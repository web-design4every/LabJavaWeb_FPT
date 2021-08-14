<%-- 
    Document   : DetailPage
    Created on : Feb 20, 2021, 7:05:10 PM
    Author     : HP
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detail Page</title>
        <link href="${contextPath}/css/common.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <jsp:include page="Header.jsp"/> 
            <div class="main">
                <div class="left">
                    <c:if test="${not empty err_news_detail}">
                        <p class="error">${err_news_detail}</p>
                    </c:if>
                    <c:if test="${empty err_news_detail}">
                        <div class="title">
                            ${news.title}
                        </div>
                        <div class="image">
                            <img src="${news.image}" alt=""/>
                        </div>
                        <div class="description">
                            ${news.description}
                        </div>
                        <div class="information">
                            <div class="icon1"></div>
                            <div class="icon2"></div>
                            By ${news.author} | ${news.dateConvert}
                        </div>
                    </c:if>
                </div>
                <jsp:include page="Right.jsp"/>
            </div>
            <jsp:include page="Footer.jsp"/>
        </div>
    </body>
</html>
