<#-- @ftlvariable name="currentUser" type="ru.dz.labs.api.domain.User" -->
<nav class="navbar navbar-default  navbar-fixed" role="navigation">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">BookStore</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">


            <a href="/enter" type="button" class="btn btn-default navbar-btn">Вход</a>
            <a href="/register" type="button" class="btn btn-default navbar-btn">Регистрация</a>

            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Link</a></li>
                <li><a href="/cart">Моя корзина</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Меню<b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="/just">Просто Небо</a></li>
                        <li><a href="/news">Новости</a></li>
                        <li><a href="/how-to">Как заказать</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Информация</a></li>
                        <li class="divider"></li>
                        <li><a href="/sales">Акции!</a></li>
                    </ul>
                </li>
            </ul>
            <form class="navbar-form navbar-left" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Введите запрос...">
                </div>
                <button type="submit" class="btn btn-default">Поиск</button>
            </form>
            <ul class="nav navbar-nav navbar-right">

                <#if currentUser??>
                    <li><a href="/personalArea">Личный кабинет</a></li>
                </#if>


                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"> <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Action</a></li>
                        <li><a href="#">Another action</a></li>
                        <li><a href="#">Something else here</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Separated link</a></li>
                    </ul>
                </li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://code.jquery.com/jquery.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
