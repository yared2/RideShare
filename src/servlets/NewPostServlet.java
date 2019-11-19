package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "NewPostServlet" , urlPatterns={"/newpost"})
public class NewPostServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{		
		doPost(req,resp);		
	}	
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		
		/**
		 *  get the parameters her and save to db. then forward to postlist
		 */

			RequestDispatcher dispacher = req.getRequestDispatcher("/postlist");
			dispacher.forward(req, resp);


	}
	
	
	
	
	

	
}
