package ServletFile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class dbcheck {
	
	public static Connection getconnect() throws ClassNotFoundException
	{
		Connection c = null;
		 
	  
		 
	        Class.forName("org.postgresql.Driver");
	        try {
				c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Sample123","postgres", "yaso4456");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return c;
	}
	
	  public static int save(Student stud) throws ClassNotFoundException, SQLException
      {
		  
		int status =0;
	    Connection connect=getconnect();	
	     PreparedStatement res= connect.prepareStatement( "INSERT INTO public.task1(id,name,email,mobile,place) VALUES (?, ?, ?, ?, ?);" );
        res.setInt(1,stud.getId());
        res.setString(2,stud.getName());
        res.setString(3,stud.getEmail());
        res.setInt(4,stud.getMobile());
        res.setString(5, stud.getPlace());
  
        //connect.commit();
        res.executeUpdate();
        res.close();
        connect.close();
        return status;
      }
	  public static ArrayList<Student> getStudentlist() throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
		  ArrayList<Student> list=new ArrayList<>();
			 Connection connect=getconnect();
			 PreparedStatement res= connect. prepareStatement( "select * from task1");
			 ResultSet result=res.executeQuery();
			 while(result.next())
			 {
				 Student stud=new Student();
				 stud.setId(result.getInt(1));
				 stud.setName(result.getString(2));
				 stud.setEmail(result.getString(3));
				 stud.setMobile(result.getInt(4));
				 stud.setPlace(result.getString(5));
				 list.add(stud);
				 
				 
				 
				 
			 }
		     
			 return list;
		     
			 
		}

	  
	 
	public static void update(Student temp,int stud_id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 
		 Connection connect=getconnect();
		 PreparedStatement res= connect.prepareStatement("UPDATE public.task1 set name=?, email=?, mobile=?, place=?, id=? where id=? ");
          
		  res.setString(1,temp.getName());
          res.setString(2,temp.getEmail());
          res.setInt(3,temp.getMobile());
          res.setString(4,temp.getPlace());
          res.setInt(5,temp.getId());
          res.setInt(6,stud_id);
         
          
          res.executeUpdate();
          res.close();
          connect.close();
          
          
          
	}

	public static void delete(int stud_id) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		 Connection connect=getconnect();
		 
		 PreparedStatement res= connect.prepareStatement("DELETE FROM public.task1 WHERE id=?;");
		 res.setInt(1, stud_id);
         res.executeUpdate();
         res.close();
         connect.close();
         
	}
	 

	 
      
	

}
