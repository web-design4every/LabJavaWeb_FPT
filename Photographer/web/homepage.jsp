<%-- 
    Document   : homepage
    Created on : Feb 24, 2021, 9:48:10 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/home.css" rel="stylesheet" type="text/css">
        <title>My Front Page</title>
    </head>
    <body>
        <div class="container">
            <jsp:include page="header.jsp"/>
            <div class="main">
                <div class="left">
                    <div class="image">
                        <img src="${contact.image_main}" alt="First">
                    </div>
                    <div class="description">
                        ${contact.description}
                    </div>
                    <div class="content">
                        <c:if test="${errorHome !=null}">
                        <h3 class="error"> ${errorHome}</h3>
                    </c:if>
                        <c:if test="${errorHome == null}">
                            <c:if test="${index > maxPage}">
                                <h3> Not found this page!!!</h3>
                            </c:if>
                            <ul >
                                <c:if test="${index <= maxPage}">
                                    <c:forEach items="${listGallery}" var="i" >
                                        <li class="span4">
                                            <div class="image">
                                                <img src="${i.image}">
                                            </div>
                                            <h4>
                                                <a href="Gallery?galleryID=${i.ID}">${i.title}</a>
                                            </h4>
                                            <p>${i.description}</p>
                                        </li>
                                    </c:forEach>
                                </c:if>
                            </ul>

                        </c:if>
                        <div class="paging">
                            <c:if test="${maxPage < 1}">
                                <h3>Not Found!!</h3>
                            </c:if>
                            <c:if test="${maxPage > 1}">
                                <c:forEach begin="1" end="${maxPage}" var="i">
                                    <a href="HomePage?index=${i}">${i}</a>
                                </c:forEach>
                            </c:if>
                        </div>
                    </div>
                    <div class="about">
                        <h3>About me</h3>
                    </div>
                    <div class="about-detail">
                        ${contact.about}
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
