package ServletFile;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updateServlet
 */

public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public int stud_id=0;
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 
		 stud_id=Integer.parseInt(req.getParameter("id"));
 
		 res.sendRedirect("update.html");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	     int id=Integer.parseInt(req.getParameter("id"));
	     String name=req.getParameter("name");
		 String email=req.getParameter("email");
		 int mobile=Integer.parseInt(req.getParameter("mobile"));
		 String place=req.getParameter("place");
		 
		 Student temp=new Student();
		 temp.setId(id);
		 temp.setName(name);
		 temp.setEmail(email);
		 temp.setMobile(mobile);
		 temp.setPlace(place);
		 try {
			dbcheck.update(temp,stud_id);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   res.sendRedirect("Second.html");
		 
		 
	}

}
