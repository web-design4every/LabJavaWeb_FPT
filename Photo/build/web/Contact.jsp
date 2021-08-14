<%-- 
    Document   : Contact
    Created on : Feb 23, 2021, 11:13:03 PM
    Author     : hungn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/contact.css" rel="stylesheet" type="text/css">
        <link href="css/style.css" rel="stylesheet" type="text/css">

    </head>
    <body>
        <div class="container">
            <jsp:include page="Header.jsp"/>
            <div class="main">
                <div class="left">
                    <div class="about">
                        <h3>Contact</h3>
                    </div>
                    <div class="content-contact">
                        <h4>PHOTOGRAPHER</h4>
                        <div class="country">
                            <p>Address: ${contact.address}<br>
                                City: ${contact.city}<br>
                                Country:  ${contact.country}</p>
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
                    <jsp:include page="Share.jsp"/>
                </div>
            </div>
        </div>

    </body> 
    <jsp:include page="Footer.jsp"/> 
</html>
