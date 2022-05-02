 package ServletFile;

import java.io.IOException;
 
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class viewServlet
 */
class Student
{
	private String name,email,place;
	private int mobile,id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
}
public class addServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    
	
    public addServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    static int id=1;
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 
         int id=Integer.parseInt(req.getParameter("id"));
		 String name=req.getParameter("name");
		 String email=req.getParameter("email");
		 int Mobile=Integer.parseInt(req.getParameter("mobile"));
		 String place=req.getParameter("place");
	 
		 
		 Student stud=new Student();
		 stud.setId(id);
		 stud.setName(name);
		 stud.setEmail(email);
		 stud.setMobile(Mobile);
		 stud.setPlace(place);
	 
		try {
			int status=dbcheck.save(stud);
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        
		 
		 res.sendRedirect("Second.html");
	}

}
