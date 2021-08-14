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
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <jsp:include page="Header.jsp"/>
            <div class="content">
                <div class="left">
                    <div class="intro">
                        <div class="intro_image">
                            <img src="images/intro.jpg" alt=""/>
                        </div>
                        <div class="intro_content">
                            <div class="intro_title">
                                Maria's Cosy Cafe
                            </div>
                            <div class="intro_des">
                                Lorem ipsum dolor sit amet, consectetuer 
                                adipiscing elit, sed diam nonummy nibh 
                                euismod tincidunt ut laoreet dolore magna 
                                aliquam erat volutpat. Ut wisi enim ad 
                                minim veniam, quis nostrud exerci tation 
                                ullamcorper suscipit lobortis nisl ut 
                                aliquip ex ea commodo consequat.
                                Claritas est etiam processus dynamicus, 
                                qui sequitur mutationem consuetudium 
                                lectorum. Mirum est notare quam littera 
                                gothica
                            </div>
                        </div>
                    </div>
                    <div class="top2">
                        <c:forEach begin="1" end="2">
                            <div class="perTop2">
                                <div class="top2_image">
                                    <a href="CakeDetail.jsp">
                                        <img src="images/product1.jpg" alt=""/>
                                    </a>
                                </div>
                                <div class="top2_title">
                                    In the Afternoon
                                </div>
                                <div class="top2_description">
                                    Lorem ipsum dolor sit amet, 
                                    consectetuer adipiscing elit, 
                                    sed diam nonummy nibh euismod 
                                    tincidunt ut laoreet dolore magna 
                                    aliquam erat volutpat. Ut wisi 
                                    enim ad minim veniam, quis nostrud 
                                    exerci tation ullamcorper suscipit 
                                    lobortis nisl ut aliquip ex ea commodo 
                                    consequat.
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                    <div class="infor">
                        <div class="infor_title">
                            Visit my cafe
                        </div>
                        <p>
                            Lorem ipsum dolor sit amet, consectetuer adipiscing elit.
                        </p>
                        <p>
                            Gammel Torv, Copenhagen, Denmark
                        </p>
                        <p>
                            Phone:0345666656
                        </p>
                    </div>
                    <div class="signature">
                        Kind regards
                    </div>
                </div>
                <jsp:include page="Right.jsp"/>
            </div>
            <jsp:include page="Footer.jsp"/>
        </div>
    </body>
</html>
