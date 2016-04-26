<#-- @ftlvariable name="sessionCart" type="java.util.List<ru.dz.labs.api.domain.Cart>" -->
<#-- @ftlvariable name="currentUser" type="ru.dz.labs.api.domain.User" -->
<#include "../mainTemplate.ftl">
<#macro store_body>
<div class="col-lg-10 col-lg-offset-0 col-sm-offset-0 col-md-offset-0 col-sm-9 col-xs-12 main"
     xmlns="http://www.w3.org/1999/html">

    <div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-lg-3 col-md-4 col-sm-5 thumbnail">
        <h1>Корзина</h1>
    </div>

    <#if Session.sessionCart?has_content>
        <#list Session.sessionCart as cart>
            <div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-lg-3 col-md-4 col-sm-5 thumbnail">
                <#if cart.good??>
                    <div class="col-lg-offset-1">
                        <img src="resources/images/${cart.good.image}" width="200">

                        <p>
                        <h3>${cart.good.name?html}</h3><br>
                        Цена : ${cart.good.price}<br>
                        Описание: ${cart.good.description}
                        <div>
                            <button>-</button>
                            <input type="number" size="10px 10px">
                            <button>+</button>
                        </div>
                        </p>

                        <form action="/cart/delete" method="post">
                            <input type="hidden" name="goodId" value="${cart.good.id}">
                            <input type="submit" value="Убрать из корзины" class="btn btn-success"
                                   style="margin-bottom: 10px">
                        </form>
                    </div>
                </#if>
            </div>
        </#list>
    </#if>
</div>
</#macro>