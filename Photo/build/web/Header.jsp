<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/header.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="nav">
            <div class= "nav-inner">
                <ul>
                    <li> <a class="${activeHome}" href="Home">My front page</a></li>            
                        <c:forEach items="${listGallery}" var="i" >
                        <li> <a class="${i.ID==galleryID?"activeGallery":""}" href="Gallery?galleryID=${i.ID}">${i.name}</a> </li>
                        </c:forEach>

                    <li> <a class="${activeContact}" href="Contact">Contact</a> </li>
                </ul>
            </div>
        </div>
        <div class="header-outer">         
            <div class="header-inner">
                <div class="img"> </div>
                <div class="title">PHOTOGRAPHER</div>
                <div class="subtitle">Welcome to this website</div>
            </div>
        </div>
    </body>
</html>
