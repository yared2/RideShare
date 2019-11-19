package daos;




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
import model.User;

public class RideDao 
{

	private DataSource dataSource;
	
	public RideDao()
	{
		try {
            Context initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:comp/env");
            this.dataSource = (DataSource) envContext.lookup("jdbc/ridesharedb");
        } catch (NamingException e) {
            System.err.println(e);
        }
	}
	
	
	public Ride getRide(int uniqueid)
	{
		Ride data = null;
		try {
            Connection connection = dataSource.getConnection();
            PreparedStatement pstmt = connection.prepareStatement("SELECT id, origin, destination, fare, date , time , user , message FROM `ridesharedb`.rides WHERE  id ='"+uniqueid+"'");                                                                 
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                int id = rs.getInt("id");
                String origin = rs.getString("origin");
                String destination = rs.getString("destination");
                double fare = rs.getDouble("fare");
                String travelDate = rs.getString("date");
                String time = rs.getString("time");
                int user = rs.getInt("user");
                String message = rs.getString("message");
                data = new Ride(id,travelDate,origin,destination,fare,time,user,message);
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
		return data;
	}
	
	public User getUser(int uniqueid)
	{
		User data = null;
		try {
            Connection connection = dataSource.getConnection();
            PreparedStatement pstmt = connection.prepareStatement("SELECT id, username, password, phone, firstname , lastname  FROM `ridesharedb`.users WHERE  id ='"+uniqueid+"'");                                                                 
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String phone = rs.getString("phone");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                data = new User(id,username,password,phone,firstname,lastname);
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
		return data;
		
	}
	
	
	
	
	
	public List<Ride> getSearchedRides(String from,String to,String date) 
	{
        List<Ride> result = new ArrayList<>();
        try {
            Connection connection = dataSource.getConnection();
            PreparedStatement pstmt = connection.prepareStatement("SELECT id, origin, destination, fare, date , time , user , message FROM `ridesharedb`.rides WHERE origin LIKE '%"+from+"%' AND destination LIKE '%"+to+"%' AND date ='"+date+"'");                                                                 
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                int id = rs.getInt("id");
                String origin = rs.getString("origin");
                String destination = rs.getString("destination");
                double fare = rs.getDouble("fare");
                String travelDate = rs.getString("date");
                String time = rs.getString("time");
                int user = rs.getInt("user");
                String message = rs.getString("message");
                Ride data = new Ride(id,travelDate,origin,destination,fare,time,user,message);
                result.add(data);
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        return result;
    }
	
	
	
	public Ride saveRide(Ride ride)
	{		
		try {
            Connection connection = dataSource.getConnection();
            PreparedStatement pstmt = connection.prepareStatement("insert into `ridesharedb`.rides (origin, destination, fare, date, time, user, message) values (?, ?, ?, ?, ?, ?, ?)");
            pstmt.setString(1, ride.getOrigin());
            pstmt.setString(2, ride.getDestination());
            pstmt.setDouble(3, ride.getFare());
            pstmt.setString(4, ride.getDate());
            pstmt.setString(5, ride.getTime());
            pstmt.setInt(6, ride.getUser());
            pstmt.setString(7, ride.getMessage());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        }		
		return ride;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
