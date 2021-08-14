<%-- 
    Document   : SearchPage
    Created on : Jan 21, 2021, 4:17:29 PM
    Author     : HP
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
        <link href="${contextPath}/css/SearchPage1.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <jsp:include page="Header.jsp"/>
            <div class="main">
                <div class="left">
                    <c:if test="${not empty err_search_paging}">
                        <p class="error">${err_search_paging}</p>
                    </c:if>
                    <c:if test="${empty err_search_paging}">
                        <c:forEach items="${listS}" var="o">
                            <div class="listNews">
                                <div class="title">
                                    <a href="../..${contextPath}/detail?id=${o.id}">
                                        ${o.title}
                                    </a>
                                </div>
                                <div class="image_search">
                                    <img src="${o.image}" alt=""/>
                                </div>
                                <div class="description">
                                    ${o.shortDes}
                                </div>
                            </div>
                        </c:forEach>
                        <div class="paging">
                            <c:if test="${endPage < 1}">
                                <h3>Not Found !</h3>
                            </c:if>
                            <c:if test="${endPage > 1}">
                                <c:forEach begin="1" end="${endPage}" var="i">
                                    <a class="${i==index?"active":""}" 
                                       href="../..${contextPath}/search?index=${i}&txtSearch=${txt}">${i}</a>
                                </c:forEach>
                            </c:if>
                        </div>
                    </c:if>

                </div>
                <jsp:include page="Right.jsp"/>
            </div>
            <jsp:include page="Footer.jsp"/>
        </div>
    </body>
</html>
