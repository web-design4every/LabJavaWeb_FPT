<%-- 
    Document   : HomePage
    Created on : 26-Dec-2019, 14:40:59
    Author     : Hoan toan hanh phuc 
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <jsp:include page="Header.jsp"/>
            <div class="content">
                <div class="left">
                    <div class="image_top">
                        <div class="image_child">
                        </div>
                    </div>
                    <c:forEach begin="1" end="3">
                        <div class="list_product">
                            <div class="product_title">
                                Lorem ipsum dolor
                            </div>
                            <div class="product_image">
                                <a href="SushiDetail.jsp">
                                    <img src="images/sushi/sushi1.jpg" alt=""/>
                                </a>
                            </div>
                            Lorem ipsum dolor 
                            sit amet, consectetuer adipiscing elit, 
                            sed diam nonummy nibh euismod tincidunt 
                            ut laoreet dolore magna aliquam erat v
                            olutpat. Ut wisi enim ad minim veniam, 
                            quis nostrud exerci tation ullamcorper 
                            suscipit lobortis nisl ut aliquip ex ea 
                            commodo consequat. Duis autem vel eum 
                            iriure dolor in hendrerit in vulputate 
                            velit esse molestie consequat, vel illum 
                            dolore eu feugiat nulla facilisis at vero 
                            eros et accumsan et iusto odio dignissim 
                            qui blandit praesent luptatum zzril delenit
                            augue duis dolore te feugait nulla facilisi.
                            Nam liber tempor cum soluta nobis eleifend 
                            option congue nihil imperdiet doming id 
                            quod mazim placerat facer possim assum.
                        </div>
                    </c:forEach>
                    <div class="paging">
                        <c:forEach begin="1" end="3" var="i">
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
