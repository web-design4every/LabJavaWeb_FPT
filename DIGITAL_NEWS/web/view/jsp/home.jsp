<%-- 
    Document   : home
    Created on : Jan 14, 2021, 2:28:23 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Digital News</title>
        <link href="../css/style.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <div class ="container">
            <div class="preheader"></div>
            <div class="header">
                <h3>My Digital News</h3>
            </div>
            <div class="menu">
                <a>News</a>
            </div>
            <div class="content">
                <div class="main">
                    <div class="tittle">
                        Christoper come back
                    </div>
                    <div class="image">
                        <img src="../../images/i1.jpg"/>
                    </div>
                    <div class="text">
Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.
                    </div>
                    <div class="signature">
                        <div class="icon1"></div>
                        <div class="icon2"></div>

                    </div>
                </div>
                <div class="right">
                    <div class="newst">
                        <div class="titleNews">
                            <span>Digital News</span>
                        </div>
                        <div class="contentNews">

                        </div>
                    </div>
                    <div class="newst">
                        <div class="titleNews">
                            Search
                        </div>
                        <form action="SearchControl" method="post">
                            <input class="searchBox" type="text" name="txtSearch" size="15"  required>
                            <input class="searchButton" type="submit" name="btnGo" value="Go">
                        </form>                        
                    </div>
                    <div class="newst">
                        <div class="titleNews">
                            <span>Last Articles</span><br>
                        </div>
                        <c:forEach items="${top5}" var="i">
                            <div class="lastArticles">
                                <a href="DetailControl?id=${i.id}"> </a>
                            </div>
                        </c:forEach>
                    </div>
                </div> 
            </div>
            <div class="footer"></div>
        </div>
    </body>
</html>
