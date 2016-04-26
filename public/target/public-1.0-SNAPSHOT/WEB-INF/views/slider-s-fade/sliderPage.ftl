<#-- @ftlvariable name="allGoods" type="java.util.List<ru.dz.labs.api.domain.Good>" -->
<#include "../mainTemplate.ftl">
<@mainTemplate />
<#macro store_body>
<div class="col-lg-10 col-lg-offset-0 col-sm-offset-0 col-md-offset-0 col-sm-9 col-xs-12 main"
     xmlns="http://www.w3.org/1999/html">

    <head>
        <title>Первый шаблон</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Bootstrap -->
        <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
        <link href="css/dopstyle.css" rel="stylesheet" media="screen">
        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
        <script src="../../assets/js/html5shiv.js"></script>
        <script src="../../assets/js/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
    <div class="container">
        <div class="row otstup">
            <div class="col-md-2"></div>
            <div class="col-md-8">
                <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                    <!-- Indicators -->
                    <ol class="carousel-indicators">
                        <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                        <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                        <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                    </ol>


                    <h2>
                        Ваш персональный кабинет с прикольными картинками!
                    </h2>
                    <!-- Wrapper for slides -->
                    <div class="carousel-inner">
                        <div class="item active">
                            <img src="resources/images/slider/1.jpg" alt="...">
                            <div class="carousel-caption">
                                <h3>Россия (Москва)</h3>
                                <p>Где это видано, чтобы люди в Москве без прописки проживали.</p>
                            </div>
                        </div>

                        <div class="item">
                            <img src="resources/images/slider/2.jpg" alt="...">
                            <div class="carousel-caption">
                                <h3>Осень</h3>
                                <p>Осень — это вторая весна, когда каждый лист — цветок.</p>
                            </div>
                        </div>

                        <div class="item">
                            <img src="resources/images/slider/3.jpg" alt="...">
                            <div class="carousel-caption">
                                <h3>Дождь</h3>
                                <p>Осень опять идут дожди...</p>
                            </div>
                        </div>
                    </div>

                    <!-- Controls -->
                    <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
                        <span class="glyphicon glyphicon-chevron-left"></span>
                    </a>
                    <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
                        <span class="glyphicon glyphicon-chevron-right"></span>
                    </a>
                </div>
            </div>
        </div>
    </div>

    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    </body>

</div>
</#macro>