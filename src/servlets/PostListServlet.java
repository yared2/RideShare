package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PostListServlet" , urlPatterns={"/postlist"})
public class PostListServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{	
		
		/**
		 *   retreive all posts for that user then set attribute called rides and pass to postlist.jsp
		 */
			
		
		RequestDispatcher dispacher = req.getRequestDispatcher("postlist.jsp");
		dispacher.forward(req, resp);
	}	
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		doGet(req,resp);
	}
	
	
	
	
	

	
}

