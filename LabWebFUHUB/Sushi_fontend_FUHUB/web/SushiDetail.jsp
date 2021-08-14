<%-- 
    Document   : SushiDetail
    Created on : 26-Dec-2019, 16:14:45
    Author     : Hoan toan hanh phuc 
--%>

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
                    <div class="sushi">
                        <div class="sushi_title">Intro Sushi</div>
                        <div class="sushi_detail">
                            <div class="sushi_image">
                                <img src="images/sushi/sushi10.jpg" alt=""/>
                            </div>
                            Lorem ipsum dolor sit amet,
                            consectetuer adipiscing elit, 
                            sed diam nonummy nibh euismod 
                            tincidunt ut laoreet dolore magna 
                            aliquam erat volutpat. Ut wisi 
                            enim ad minim veniam, quis nostrud 
                            exerci tation ullamcorper suscipit 
                            lobortis nisl ut aliquip ex ea 
                            commodo consequat. Duis autem vel 
                            eum iriure dolor in hendrerit in 
                            vulputate velit esse molestie 
                            consequat, vel illum dolore eu 
                            feugiat nulla facilisis at vero 
                            eros et accumsan et iusto odio 
                            dignissim qui blandit praesent 
                            luptatum zzril delenit augue duis 
                            dolore te feugait nulla facilisi.
                            Nam liber tempor cum soluta nobis 
                            eleifend option congue nihil 
                            imperdiet doming id quod mazim 
                            placerat facer possim assum. 
                            Typi non habent claritatem insitam; 
                            est usus legentis in iis qui facit 
                            eorum claritatem. Investigationes
                            demonstraverunt lectores legere me 
                            lius quod ii legunt saepius.
                            Claritas est etiam processus 
                            dynamicus, qui sequitur mutationem 
                            consuetudium lectorum. 
                            Mirum est notare quam littera
                            gothica, quam nunc putamus
                            parum claram, anteposuerit 
                            litterarum formas humanitatis 
                            per seacula quarta decima et 
                            quinta decima. Eodem modo typi, 
                            qui nunc nobis videntur parum 
                            clari, fiant sollemnes in futurum.
                        </div>
                        <div class="sushi_price">
                            Price: 5000 $
                        </div>
                    </div>
                </div>
                <jsp:include page="Right.jsp"/>
            </div>
            <jsp:include page="Footer.jsp"/>
        </div>
    </body>
</html>
