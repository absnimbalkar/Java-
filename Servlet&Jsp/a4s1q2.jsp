<%@ page import="java.util.*, java.io.*, javax.servlet.*, javax.servlet.http.*" %>

<html>

	<b><%out.println("Today's Date:");%> <%= new Date() %></b><br>
	<b><%out.println("Browser: ");%><%=request.getHeader("User-Agent")%></b><br>
	<b><%Cookie c1=new Cookie("c1","1");response.addCookie(c1);%><%out.println("Cookie is added");%></b><br>
	<form action="text.jsp" method="get">

Name:<input type = "text.jsp" name="username">
<input type="submit">
</html>
