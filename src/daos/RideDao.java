package daos;



import javax.annotation.Resource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Ride;

public class RideDao 
{

	private DataSource dataSource;
	
	public RideDao()
	{
		try {
            Context initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:comp/env");
            this.dataSource = (DataSource) envContext.lookup("jdbc/RideShareDb");
        } catch (NamingException e) {
            System.err.println(e);
        }
	}
	
	
	
	public List<Ride> getSearchedRides() {
        List<Ride> result = new ArrayList<>();
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement pstmt = connection.prepareStatement("SELECT contacts_id, customer_name, gender, category, message FROM `cs472-201911-lesson15-contacts-db`.contacts order by customer_name");
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                int contactsId = rs.getInt("contacts_id");
                String name = rs.getString("customer_name");
                String gender = rs.getString("gender");
                String category = rs.getString("category");
                String message = rs.getString("message");
                Ride data = new Ride();
                result.add(data);
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return result;
    }
	
	
}
