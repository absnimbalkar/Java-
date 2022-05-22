<%@ page import ="java.util.Date"%>
<html>
<% Today's date is <%= new Date() %>

<br>The user agent is <%= request.getHeader("user-agent") %>

<%
out.println("\nConfig");
    out.println("\n"+config.getServletName());

    out.println("\nSession ID");
    out.println("\n"+session.getId());   

    out.println("\nApplication : ");
    out.println("\n"+application.getServerInfo());
%>

<form action="text.jsp" method="get">

Name:<input type = "text" name="username">
<input type="submit">

</form>

</html>
