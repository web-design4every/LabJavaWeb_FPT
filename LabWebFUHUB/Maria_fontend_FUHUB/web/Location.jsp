<%-- 
    Document   : HomePage
    Created on : 25-Dec-2019, 03:26:19
    /*copyright by fu hub*/
/*link group https://www.facebook.com/groups/498752080529382/*/
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/location.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <jsp:include page="Header.jsp"/>
            <div class="content">
                <div class="left">
                    <div class="location_title">
                        Find Maria's Cafe
                    </div>
                    <div class="location">
                        <div class="location_left">
                            <div class="location_header">
                                Address and contact:
                            </div>
                            <p>Gammel Torv, Copenhagen, Denmark</p>
                            <p>Tel:123456</p>
                            <p>Email:your-email@your-email.com</p>
                        </div>
                        <div class="location_right">
                            <div class="location_header">
                                Opening hours:
                            </div>
                            <p>Monday: Closed</p>
                            <p>Tuesday - Friday: 10:00 - 20:00</p>
                            <p>Saturday and Sunday: 11.00 - 21:00</p>
                        </div>
                    </div>
                    <div class="map">
                        <img src="images/map.PNG" alt=""/>
                    </div>
                </div>
                <jsp:include page="Right.jsp"/>
            </div>
            <jsp:include page="Footer.jsp"/>
        </div>
    </body>
</html>
