<%-- 
    Document   : Homepage
    Created on : Feb 24, 2021, 8:57:22 AM
    Author     : hungn
--%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/homepage.css" rel="stylesheet" type="text/css">
        <link href="css/style.css" rel="stylesheet" type="text/css">   
    </head>
    <body>
        <div class="container">
            <jsp:include page="Header.jsp"/>
            <div class="main">
                <div class="left">
                    <div class="image">
                        <img src="${home.image_url}">
                    </div>
                    <div class="description">
                        ${home.description}
                    </div>
                    <div class="content">
                        <c:if test="${error != null}">
                            <h3 class="error"> ${error}</h3>
                        </c:if>
                        <c:if test="${error == null}">
                            <c:if test="${index > maxpage||index <= 0}">
                                <h3 class="error"> ${error}</h3>
                            </c:if>
                            <c:if test="${index <= maxpage||index > 0}">
                                <ul>                      
                                    <c:forEach items="${listGallery}" var="list" >
                                        <li>
                                            <div class="image">
                                                <a href="Gallery?galleryID=${list.ID}"><img src="${list.image}"></a>
                                            </div>
                                            <h4>
                                                <a href="Gallery?galleryID=${list.ID}">${list.title}</a>
                                            </h4>
                                            <div class="about-detail">
                                                ${list.description}
                                            </div>
                                        </li>
                                    </c:forEach>            
                                </ul>
                            </c:if>
                        </c:if>                 
                    </div>
                    <div class="about">
                        <h3>${home.about}</h3>
                    </div>
                    <div class="about-detail">
                        ${home.aboutDetail}
                    </div>
                </div>
                <div class="right">
                    <jsp:include page="Share.jsp"/>
                </div>
            </div>     
        </div>       
        <jsp:include page="Footer.jsp"/> 
    </body>

</html>


