<%@page import="kb.servlet.ParameterServlet"%>
<%@page import="kb.servlet.ParameterDto"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table, th, td {
  border:1px solid black;
}
</style>
</head>
<body>
<%
ParameterDto pa = (ParameterDto)request.getAttribute("param");
%>

<h1>Post Result</h1>
    
    <table style="width:100%">

  <tr>
    <td>name</td>
 	<td><%=pa.getName() %></td>
  </tr>
  
      
  <tr><td>email</td>
 <td><%=pa.getEmail() %></td>
  </tr>
      
  <tr><td>gender</td>
  <td><%=pa.getGender() %></td>
  </tr>
      
  <tr><td>hobby</td>
  <td><%=pa.getHobby().toString() %></td>
  </tr>
      
  <tr><td>favorite</td>
  <td><%=pa.getFavorite() %></td>
  </tr>
      
  <tr><td>desc</td>
  <td><%=pa.getDesc() %></td>
  </tr>


</table>
</body>
</html>