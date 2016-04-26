<#-- @ftlvariable name="good" type="ru.dz.labs.api.domain.Good" -->
<#include "../mainTemplate.ftl">
<@mainTemplate />
<#macro store_body>
<div class="col-lg-10 col-lg-offset-0 col-sm-offset-0 col-md-offset-0 col-sm-9 col-xs-12 main"
     xmlns="http://www.w3.org/1999/html">
    <#if good??>
        <div>
            <if good.image??>
                <img src="resources/images/${good.image}" width="500">
            </if>
        </div>

        <div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-lg-3 col-md-4 col-sm-5 thumbnail">
            <div class="col-lg-offset-1">

                <p>
                <h2>${good.name?html}</h2>
                <br> Описание : ${good.description}
                <br> Год издания : ${good.year}
                <br> Цена : ${good.price}
                </p>

                <form action="/cart" method="post">
                    <input type="hidden" name="goodId" value="${good.id}">
                    <input type="submit" value="Добавить в корзину" class="btn btn-success"
                           style="margin-bottom: 10px">
                </form>
            </div>
        </div>
    </#if>
</div>
</#macro>
