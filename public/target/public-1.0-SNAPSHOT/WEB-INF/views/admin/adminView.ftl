<#-- @ftlvariable name="allGoods" type="java.util.List<ru.dz.labs.api.domain.Good>" -->
<#-- @ftlvariable name="currentUser" type="ru.dz.labs.api.domain.User" -->
<#include "../mainTemplate.ftl">
<@mainTemplate />
<#macro store_body>
<div class="col-lg-10 col-lg-offset-0 col-sm-offset-0 col-md-offset-0 col-sm-9 col-xs-12 main"
     xmlns="http://www.w3.org/1999/html">
    <#if allGoods??>
        <#list allGoods as good>
            <div class="col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-lg-3 col-md-4 col-sm-5 thumbnail">
                <#if good??>
                    <div class="col-lg-offset-1">

                        <img src="resources/images/${good.image}" width="200">

                        <p>
                        <h3>${good.name?html}</h3><br>
                        Цена : ${good.price}<br>
                    <#--<div >-->
                    <#--<button>-</button>-->
                    <#--<button>+</button>-->
                    <#--<input type="number">-->

                    <#--</div>-->
                        Описание: ${good.description}
                        </p>

                        <form action="/good" method="post">
                            <input type="hidden" name="goodId" value="${good.id}">
                            <input type="submit" value="Подробнее" class="btn btn-success"
                                   style="margin-bottom: 10px">
                        </form>


                      </div>
                </#if>
            </div>
        </#list>
    </#if>

        <form action="/add" method="post">
        <input type="hidden" name="goodId" value="${good.id}">
        <input type="submit" value="Добавить товар" class="btn btn-success"
               style="margin-bottom: 10px">
    </form>
</div>
</#macro>
