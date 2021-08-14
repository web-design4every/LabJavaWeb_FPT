<%-- 
    Document   : HomePage
    Created on : 25-Dec-2019, 03:26:19
    /*copyright by fu hub*/
/*link group https://www.facebook.com/groups/498752080529382/*/
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/list.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
             <jsp:include page="Header.jsp"/>
            <div class="content">
                <div class="left">
                    <c:forEach begin="1" end="4">
                        <div class="list">
                            <div class="list_image">
                                <a href="CakeDetail.jsp">
                                    <img src="images/product1.jpg" alt=""/>
                                </a>
                            </div>
                            <div class="list_content">
                                <div class="list_title">
                                    Maria's Cosy Cafe
                                </div>
                                <div class="list_des">
                                    Lorem ipsum dolor sit amet, consectetuer 
                                    adipiscing elit, sed diam nonummy nibh 
                                    euismod tincidunt ut laoreet dolore magna 
                                    aliquam erat volutpat. Ut wisi enim ad 
                                    minim veniam, quis nostrud exerci tation 
                                    ullamcorper suscipit lobortis nisl ut 
                                    aliquip ex ea commodo consequat.
                                    Claritas est etiam processus dynamicus, 

                                </div>
                            </div>
                        </div>
                    </c:forEach>
                    <div class="paging">
                        <c:forEach begin="1" end="5" var="i">
                            <a href="#">${i}</a>
                        </c:forEach>
                    </div>
                </div>
               <jsp:include page="Right.jsp"/>
            </div>
             <jsp:include page="Footer.jsp"/>
        </div>
    </body>
</html>
