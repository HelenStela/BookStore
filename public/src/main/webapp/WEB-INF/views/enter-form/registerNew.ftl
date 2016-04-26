<#-- @ftlvariable name="currentUser" type="ru.dz.labs.api.domain.User" -->
<#assign form=JspTaglibs["http://www.springframework.org/tags/form"]>
<#include "../mainTemplate.ftl">
<@mainTemplate />
<#macro store_body>
<#--<div class="container">-->
<#--<div class="row otstup">-->
<#--<div class="col-md-9">-->
<#--<h2>Регистрация</h2>-->
<#--<form action="/register" method="post" role="form">-->
<#--<div class="form-group">-->
<#--<label for="exampleInputPassword1">Фамилия</label>-->
<#--<input type="surname" class="form-control" name="surname" id="exampleInputSurname"-->
<#--placeholder="Введите вашу Фамилию">-->
<#--</div>-->
<#--<div class="form-group">-->
<#--<label for="exampleInputName">Имя</label>-->
<#--<input type="name" class="form-control" name="name" id="exampleInputName"-->
<#--placeholder="Введите ваше имя">-->
<#--</div>-->
<#--<div class="form-group">-->
<#--<label for="exampleInputEmail1">Email</label>-->
<#--<input type="email" class="form-control" name="email" id="exampleInputEmail1"-->
<#--placeholder="Введите адрес электронной почты">-->
<#--</div>-->
<#--<div class="form-group">-->
<#--<label for="exampleInputPassword1">Пароль</label>-->
<#--<input type="password" class="form-control" name="password" id="exampleInputPassword1"-->
<#--placeholder="Пароль">-->
<#--</div>-->


<#--<button type="submit" class="btn btn-default">Зарегистрироваться</button>-->
<#--</form>-->
<#--</div>-->
<#--</div>-->
    <#if currentUser??>
    <h1>
        Вы уже зарегестрированы!
    </h1>
    </#if>

<div class="container">
    <div class="row otstup">
        <div class="col-md-9">
            <@form.form commandName="regForm" action="/register" acceptCharset="UTF-8" method="post">
                <div class="register-top-grid">
                    <h2>Личная Информация</h2>
                    <@form.errors path="*" cssStyle="color: red;" />
                    <div class="form-group">
                        <span>Имя<label>*</label></span>
                        <@form.input path="firstName" />
                        <@form.errors path="firstName" cssStyle="color: red;" />
                    </div>
                    <div class="form-group">
                        <span>Фамилия           <label>*</label></span>
                        <@form.input path="lastName" />
                        <@form.errors path="lastName" cssStyle="color: red;" />
                    </div>
                    <div class="form-group">
                        <span>Email             <label>*</label></span>
                        <@form.input path="email" />
                        <@form.errors path="email" cssStyle="color: red;" />
                    </div>
                    <div class="form-group">
                        <span>Phone<label>*</label></span>
                        <@form.input path="phone" />
                        <@form.errors path="phone" cssStyle="color: red;" />
                    </div>
                    <div class="clearfix"></div>
                    <i class="news-letter">
                        <label class="">
                            <@form.checkbox path="signIn" />
                            <i> </i>Подписаться на рассылку
                            <@form.errors path="signIn" cssStyle="color: red;" />
                        </label>
                    </i>
                </div>
                <div class="form-group">
                    <h2>Пароль</h2>
                    <div class="form-group">
                        <span>Пароль            <label>*</label></span>
                        <@form.password path="password" />
                        <@form.errors path="password" cssStyle="color: red;" />
                    </div>
                    <div class="form-group">
                        <span>Подтвердить пароль<label>*</label></span>
                        <@form.password path="confirmPassword" />
                        <@form.errors path="confirmPassword" cssStyle="color: red;" />
                    </div>
                    <div class="clearfix"></div>
                </div>
                <div class="clearfix"></div>
                <div class="register-but">
                    <input type="submit" value="Зарегистрироваться" class="btn btn-default">
                    <div class="clearfix"></div>
                </div>
            </@form.form>
        </div>
    </div>

</#macro>