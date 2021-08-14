<%-- 
    Document   : HomePage
    Created on : 26-Dec-2019, 14:40:59
    Author     : Hoan toan hanh phuc 
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/menu.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <jsp:include page="Header.jsp"/>
            <div class="content">
                <div class="left">
                    <div class="menu_title">
                        Menu and Price list
                    </div>
                    <c:forEach begin="1" end="3">
                        <div class="perMenu">
                            <table class="menu_table">
                                <tr>
                                    <td class="row_left">Menu 1</td>
                                    <td class="row_right">Price</td>
                                </tr>
                                <tr>
                                    <td class="row_left">Claritas est etiam processus</td>
                                    <td class="row_right">€15.00</td>
                                </tr>
                            </table> 
                            <p>
                                Lorem ipsum dolor sit amet, consectetuer 
                                adipiscing elit, sed diam nonummy nibh 
                                euismod tincidunt ut laoreet dolore 
                                magna aliquam erat volutpat.
                            </p>
                        </div>
                    </c:forEach>
                    <div class="paging">
                        <c:forEach begin="1" end="3" var="i">
                            <a href="#">${i}</a>
                        </c:forEach>
                    </div>
                </div>
                <jsp:include page="Right.jsp"/>
            </div>
            <jsp:include page="Footer.jsp"/>
        </div>
    </body>
</html>
