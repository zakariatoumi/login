<%-- 
    Document   : welcom
    Created on : 11 mars 2018, 19:25:35
    Author     : SAMSUNG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <%
            if (session != null) {
                    if (session.getAttribute("login")!=null) {
                            String name=(String) session.getAttribute("login");
                            out.print("bonjour " +name);
                        } else {
                        response.sendRedirect("index.jsp");
                        }
                }
            %>
    </body>
</html>
