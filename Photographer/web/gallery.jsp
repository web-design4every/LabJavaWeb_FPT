<%-- 
    Document   : gallery
    Created on : Feb 26, 2021, 9:18:02 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/gallery.css" rel="stylesheet" type="text/css">
        <link href="css/home.css" rel="stylesheet" type="text/css">
    </head>
    <body>   
        <jsp:include page="header.jsp"/>
        <div class="container">
            <div class="main">
                <div class="left">
                    <c:if test="${errorGallery !=null}">
                        <h3 class="error"> ${errorGallery}</h3>
                    </c:if>
                    <c:if test="${errorGallery ==null}">
                        <div class="galleryName">
                            <h3>${gallery.name}</h3>
                        </div>
                        <c:if test="${index > maxpage}">
                            <h3 class="error"> ${errorPage}</h3>
                        </c:if>
                        <c:if test="${index <= maxpage}">
                            <div class="galleryImg">
                                <img src="${firstImg.image_url}" alt="Gallery">
                            </div>
                            <div class="contentGallery">
                                <ul>              
                                    <c:forEach items="${listImg}" var="list" >
                                        <li>
                                            <a href="Gallery?index=${index}&galleryID=${list.galery_id}&imgID=${list.id}"><img src="${list.image_url}"/></a>
                                        </li>
                                    </c:forEach>
                                </ul>
                            </div>

                            <div class="paging">
                                <c:if test="${maxpage > 1}">
                                    <c:forEach begin="1" end="${maxpage}" var="i">
                                        <a class="${i==index?"page":""}" href="Gallery?index=${i}&galleryID=${galleryID}">${i}</a>
                                    </c:forEach>
                                </c:if>
                            </div>
                        </c:if>
                    </c:if>
                </div>
                <div class="right">
                    <jsp:include page="right.jsp"/>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"/> 
    </body>
</html>
