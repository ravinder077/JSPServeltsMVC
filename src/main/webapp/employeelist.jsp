<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
     <%@ page import="com.aris.model.*" %>
<!DOCTYPE html>
<html>
<head>
<style>
#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}
</style>
</head>
<body>

<h1>A Fancy Table</h1>

<table id="customers">
  <tr>
    <th>Employee Code</th>
    <th>FirstName</th>
    <th>Last Name</th>
     <th>Job</th>
      <th>Salary</th>
  </tr>
 
  
   <%  List<EmployeeModel> eList=(ArrayList)request.getAttribute("employeList");
    
   for(EmployeeModel user : eList)
   {%>
   <tr>
       <td><%= user.getID() %></td>
      <td><%= user.getFirstName() %></td> 
      <td><%= user.getLastName() %></td>
      <td><%= user.getJob() %></td>
      <td><%= user.getSalary() %></td>
   </tr>
    <%}%>
   
   
  

</table>

</body>
</html>