<%-- 
    Document   : Right
    Created on : Feb 23, 2021, 9:36:57 PM
    Author     : hungn
--%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/share.css" rel="stylesheet" type="text/css">
    </head>

    <body>
        <div class="header">
            <h4>Share this page</h4>
        </div>
        <div class="social">
            <div>
                <ul>
                    <c:forEach items="${listShare}" var="list">
                      
                        <li><img src="${list.url_image}"><a href="#">${list.content}</a></li>
                    </c:forEach>
                </ul>
            </div>

        </div>
    </body>
</html>
