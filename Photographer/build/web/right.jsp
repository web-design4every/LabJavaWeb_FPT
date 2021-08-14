<%-- 
    Document   : right
    Created on : Feb 24, 2021, 10:18:45 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/right.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div class="rightt">
            <div class="share_box">
                <div class="share_header">
                    <h4>Share this page</h4>
                </div>
                <div class="share_content">
                    <c:forEach items="${listShare}" var="l">
                        <a href="${i.url}">
                            <img src="${l.icon}"/>Share on ${l.socialNetwork}
                        </a><br>
                    </c:forEach>
                </div>
            </div>
        </div>
    </body>
</html>