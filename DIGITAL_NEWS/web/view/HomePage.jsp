<%-- 
    Document   : HomePage
    Created on : Jan 14, 2021, 3:35:04 PM
    Author     : HP
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <link href="${contextPath}/css/HomeStyle.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <jsp:include page="Header.jsp"/>
            <div class="main">
                <div class="left">
                    <c:if test="${not empty err_top1}">
                        <p class="error">${err_top1}</p>
                    </c:if>
                    <c:if test="${empty err_top1}">
                        <div class="title">
                            ${top1.title}
                        </div>
                        <div class="image">
                            <img src="${top1.image}" alt=""/>
                        </div>
                        <div class="description line-bottom">
                            ${top1.description}
                        </div>
                        <div class="information">
                            <div class="icon1"></div>
                            <div class="icon2"></div>
                            By ${top1.author} | ${top1.dateConvert}
                        </div>
                    </c:if>
                </div>
                <jsp:include page="Right.jsp"/>
            </div>
            <jsp:include page="Footer.jsp"/>
        </div>
    </body>
</html>
