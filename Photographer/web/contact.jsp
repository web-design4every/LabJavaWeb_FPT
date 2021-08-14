<%-- 
    Document   : contact
    Created on : Feb 26, 2021, 9:17:43 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/home.css" rel="stylesheet" type="text/css">
        <link href="./css/contact.css" rel="stylesheet" type="text/css">
        <title>Contact Page</title>
    </head>
    <body>
        <div class="container">
            <jsp:include page="header.jsp"/>
            <div class="main">
                <div class="left">
                    <div class="about">
                        <h3>Contact</h3>
                    </div>
                    <div class="content-contact">
                        <h3>PHOTOGRAPHER</h3>
                        <div class="country">
                            <p>Address: ${contact.address}<br>
                            City:<span class="tab-1"></span>${contact.city}<br>
                            Country: ${contact.country}</p>
                        </div>
                        <div class="infor">
                            <table>
                                <tr>
                                    <td>Tel: </td>
                                    <td>${contact.telephone}</td>
                                </tr>
                                <tr>
                                    <td>Email: </td>
                                    <td>${contact.email}</td>
                                </tr>
                            </table>
                        </div> 
                        <div class="map">
                        </div>
                    </div>
                </div>
                <div class="right">
                    <jsp:include page="right.jsp"/>
                </div>
            </div>
        </div>
       <jsp:include page="footer.jsp"/>         
    </body>
</html>
