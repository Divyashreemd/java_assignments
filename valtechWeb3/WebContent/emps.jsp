<%@page import="java.util.List"%>
<%@page import="com.valtech.dao.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Employee> emps = (List<Employee>) request.getAttribute("emps"); %>
<table>
<thead>
   <tr>
      <td>Id</td>
      <td>Name</td>
      <td>Age</td>
      <td>Gender</td>
      <td>Salary</td>
      <td>Operations</td>
    </tr>
</thead>
<tbody>
<% for(Employee e : emps) {%>
   <tr>
   <td><%=e.getId() %></td>
   <td><%=e.getName() %></td>
   <td><%=e.getAge() %></td>
   <td><%=e.getGender() %></td>
   <td><%=e.getSalary() %></td>
   <td>
   <a href="empCtlr?empId=<%= e.getId() %>"><button>ViewDetails</button></a>
   <a href="empCtlr?submit=delete&empId=<%= e.getId() %>"><button>Delete</button></a>
   
   <form action="empCtlr?empId=<%= e.getId() %>" method="post">
   <input type="submit" name="submit" value="Update"/>
   </form> 
   </td>
   
   </tr>

<% } %>

</tbody>
</table>
<form action="empCtlr" method="post">
<input type="submit" name="submit" value="New Employee"/>
</form>
</body>
</html>