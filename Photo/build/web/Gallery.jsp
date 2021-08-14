<%-- 
    Document   : Gallery
    Created on : Feb 25, 2021, 8:13:59 PM
    Author     : hungn
--%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/gallery.css" rel="stylesheet" type="text/css">
        <link href="css/style.css" rel="stylesheet" type="text/css">

    </head>
    <body>   
        <jsp:include page="Header.jsp"/>
        <div class="container">
            <div class="main">
                <div class="left">
                    <c:if test="${error !=null}">
                        <h3 class="error"> ${error}</h3>
                    </c:if>
                    <c:if test="${error ==null}">
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
                                            <a href="Gallery?index=${index}&galleryID=${list.gallery_id}&imgID=${list.id}"><img src="${list.image_url}"></a>
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
                    <jsp:include page="Share.jsp"/>
                </div>
            </div>
        </div>
        <jsp:include page="Footer.jsp"/> 
    </body>
</html>
