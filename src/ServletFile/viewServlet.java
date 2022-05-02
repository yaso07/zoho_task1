package ServletFile;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addServlet
 */
public class viewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 
	
	  
			 
			 ArrayList<Student> list1 = null;
			try {
				list1 = dbcheck.getStudentlist();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	  	res.setContentType("text/html");  
		   PrintWriter out=res.getWriter(); 
		    out.println("");
		   out.println("<html>"
		   		+ "<head>"
		   		+ "<link rel=\"stylesheet\" href=\"view.css\">"
		   		+ "<meta charset=\"ISO-8859-1\">"
		   		+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">"
		   		+ "<!-- JavaScript Bundle with Popper -->"
		   		+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>"
		   		+ "</head>");
		   
		   out.println(" <a class=\"btn btn-primary\" id=\"newdata\" href=\"Second.html\" role=\"button\">Add new data</a>");
		   
		  
		   out.print("<div class=\"box\"><table class='table table-striped border border-4'>");
		   
		   out.print("<tr><td>Id</td><td>Name</td><td>Email</td><td>Mobile</td><td>Place<td><td></td></tr>");
		   	   for(Student stud:list1)
			     {
		   		    
			    	 out.print("<tr><td>"+stud.getId()+"</td><td>"+stud.getName()+"</td><td>"+stud.getEmail()+"</td><td>"+stud.getMobile()
			    	 +"</td><td>"+stud.getPlace()+"</td><td><a  class=\"btn btn-primary\" href='updateServlet?id="+stud.getId()+"'>Update</a></td>"
			    	 + "<td><a  class=\"btn btn-primary\" href='deleteServlet?id="+stud.getId()+"'>Delete</a></td> \r\n"
			    	 + "</form></tr>");
			    	
			    	 
			    	 	 
			     }
		   	 out.print("</table></div>");
		    
	}
	

}
