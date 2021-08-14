
<%@page import="javax.naming.Context"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result Search</title>
        <link href="css/style.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div class="container">
            <jsp:include page="Header.jsp"/>
            <div class="content">
                <div class="main">                
                    <c:forEach begin="1" end="3">
                        <div class="tittle">
                            <a href="Detail.jsp">      
                                Day La Bai So 2
                            </a>
                        </div>
                        <div class="image_search">
                            <img src="images/i1.jpg" alt=""/>
                        </div>
                        <div class="text_search">
                           Lorem ipsum dolor sit amet, consectetuer adipiscing elit, 
                           sed diam nonummy nibh euismod tincidunt ut laoreet dolore 
                           magna aliquam erat volutpat. Ut wisi enim ad minim veniam, 
                           quis nostrud exerci tation ullamcorper suscipit lobortis 
                           nisl ut aliquip ex ea commodo consequat.
                           nisl ut aliquip ex ea commodo consequat.
                           quis nostrud exerci tation ullamcorper suscipit lobortis 
                           nisl ut aliquip ex ea commodo consequat.
                           quis nostrud exerci tation ullamcorper suscipit lobortis 
                        </div>
                        <br>
                    </c:forEach>
                    <div class="paging">
                        <c:if test="${3 > 1}">
                            <c:forEach begin="1" end="3" var="i">
                                <a href="#">${i}</a>
                            </c:forEach>
                        </c:if>
                    </div>
                </div> 
                <jsp:include page="Right.jsp"/> 
            </div>
            <jsp:include page="Footer.jsp"/>
        </div>

    </body>
</html>
