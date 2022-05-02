<!DOCTYPE html>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
 
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
 <link rel="stylesheet" href="view.css">
 
<title>Insert title here</title>
</head>
<body>
  
 <a class="btn btn-primary" id="newdata" href="Second.html" role="button">Add new data</a>
</form>

<div class="box">
	<table class="table table-striped">
		<tr>
			<td>ID</td>
			<td>NAME<td>
			<td>EMAIL</td>
			<td>MOBILE NO</td>
			<td>PLACE</td>
			 
		</tr>
   <tr>
    <form action="updateServlet" method="post">
       <td><button type="submit"  id =stud.getId() class="btn btn-primary" value="update">Update</button></td> 
   </form>
   <form action="deleteServlet" method="post">
       <td><button type="submit" id=stud.getId()  class="btn btn-primary">Delete</button></td> 
       <td><input style="display:none">
   </form>
   </tr>

	 
	</table>
	</div>
	
 
</body>
</html>