<#--<#assign c=JspTaglibs["http://java.sun.com/jsp/jstl/core"]>-->
<#macro mainTemplate>
<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8">
    <link rel="stylesheet" href="../../resources/css/styles.css">
    <title>BookStore - продажа книг</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="/resources/css/dopstyle.css" rel="stylesheet" media="screen">
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="../../assets/js/html5shiv.js"></script>
    <script src="../../assets/js/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="container">
    <#include "navbar/navbar.ftl" />

    <#--<#include "enter-form/enter.ftl" />-->
    <#-- TO Do - to make a new bit-->


     <#--<#include "slider-s-fade/slider.ftl"/>-->
    <#--<@slider/>-->
    <@store_body />
    <#--<#include "cart.ftl" />-->
    <#--<@cart_body />-->
</div>
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="/resources/js/bootstrap.min.js"></script>
</body>
</html>
</#macro>