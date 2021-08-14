<%-- 
    Document   : Right
    Created on : Jan 17, 2021, 12:21:08 PM
    Author     : HP
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Right Page</title>
        <link href="${contextPath}/css/RightStyle.css" rel="stylesheet" type="text/css"/>
        <link href="${contextPath}/css/common1.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="right">
            <div class="title">
                Digital News
            </div>
            <div class="description">
                ${top1.shortDes}
            </div>
            <div class="title">
                Search
            </div>
            <div class="search">
                <form action="../..${contextPath}/search">
                    <input class="inputTxt" type="text" value="${txt}" name="txtSearch" required=""/>
                    <input class="submitTxt" type="submit" value="Go"/>
                </form>
            </div>
            <div class="title">
                Last Articles
            </div>
            <c:if test="${not empty err_top5}">
                <p class="error">${err_top5}</p>
            </c:if >
            
            <c:if test="${empty err_top5}">
                <c:forEach items="${top5}" var="x">
                    <div class="list">
                        <a href="../..${contextPath}/detail?id=${x.id}">${x.title}</a>
                    </div>
                </c:forEach>
            </c:if>
        </div>
    </body>
</html>
