<#-- @ftlvariable name="allGoods" type="java.util.List<ru.dz.labs.api.domain.Good>" -->
<#include "../mainTemplate.ftl">
<@mainTemplate />
<#macro store_body>
<div class="container">
    <div class="row otstup">
        <div class="col-md-9">
            <h2>Регистрация</h2>
            <form action="/register" method="post" role="form">
                <div class="form-group">
                    <label for="exampleInputPassword1">Фамилия</label>
                    <input type="surname" class="form-control" name="surname" id="exampleInputSurname"
                           placeholder="Введите вашу Фамилию">
                </div>
                <div class="form-group">
                    <label for="exampleInputName">Имя</label>
                    <input type="name" class="form-control" name="name" id="exampleInputName"
                           placeholder="Введите ваше имя">
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail1">Email</label>
                    <input type="email" class="form-control" name="email" id="exampleInputEmail1"
                           placeholder="Введите адрес электронной почты">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Пароль</label>
                    <input type="password" class="form-control" name="password" id="exampleInputPassword1"
                           placeholder="Пароль">
                </div>


                <button type="submit" class="btn btn-default">Зарегистрироваться</button>
            </form>
        </div>
    </div>


<#--<div class="row otstup">-->
<#--<div class="col-md-9">-->
<#--<!--<h4>Форма в линию</h4>&ndash;&gt;-->
<#--<h5>  </h5>-->
<#--<form class="form-inline" role="form" >-->

<#--<div class="form-group">-->
<#--<label class="sr-only" for="exampleInputEmail2">Email</label>-->
<#--<input type="email" class="form-control" id="exampleInputEmail2" placeholder="Введите email">-->
<#--</div>-->
<#--<div class="form-group">-->
<#--<label class="sr-only" for="exampleInputPassword2">Password</label>-->
<#--<input type="password" class="form-control" id="exampleInputPassword2" placeholder="Пароль">-->
<#--</div>-->
<#--<div class="checkbox">-->
<#--<label>-->
<#--<input type="checkbox"> Запомнить-->
<#--</label>-->
<#--</div>-->
<#--<button type="submit" class="btn btn-default">Вход</button>-->
<#--<button type="submit" class="btn btn-default">Регистрация</button>-->
<#--</form>-->
<#--<h5>                 </h5>-->
<#--</div>-->
<#--</div>-->

<#--<div class="row otstup">-->
<#--<div class="col-md-9">-->
<#--<h2>Горизонтальная форма</h2>-->
<#--<form class="form-horizontal" role="form">-->
<#--<div class="form-group">-->
<#--<label for="inputEmail3" class="col-sm-2 control-label">Email</label>-->
<#--<div class="col-sm-10">-->
<#--<input type="email" class="form-control" id="inputEmail3" placeholder="Email">-->
<#--</div>-->
<#--</div>-->
<#--<div class="form-group">-->
<#--<label for="inputPassword3" class="col-sm-2 control-label">Пароль</label>-->
<#--<div class="col-sm-10">-->
<#--<input type="password" class="form-control" id="inputPassword3" placeholder="Пароль">-->
<#--</div>-->
<#--</div>-->
<#--<div class="form-group">-->
<#--<div class="col-sm-offset-2 col-sm-10">-->
<#--<div class="checkbox">-->
<#--<label>-->
<#--<input type="checkbox"> Запомнить меня-->
<#--</label>-->
<#--</div>-->
<#--</div>-->
<#--</div>-->
<#--<div class="form-group">-->
<#--<div class="col-sm-offset-2 col-sm-10">-->
<#--<button type="submit" class="btn btn-default">Войти</button>-->
<#--</div>-->
<#--</div>-->
<#--</form>-->
<#--</div>-->
<#--</div>-->
</div>
</#macro>