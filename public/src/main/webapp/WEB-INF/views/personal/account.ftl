<#-- @ftlvariable name="currentUser" type="ru.dz.labs.api.domain.User" -->
<#include "../mainTemplate.ftl">
<@mainTemplate />
<#macro store_body>
<div class="col-lg-10 col-lg-offset-0 col-sm-offset-0 col-md-offset-0 col-sm-9 col-xs-12 main"
     xmlns="http://www.w3.org/1999/html">
    <H1>
        Это Личный Кабинет!
    </H1>
    <#if currentUser??>
        <div>
            <h1>
                Имя: ${currentUser.name}
            </h1>
            <br/>
            <h1>
                Фамилия: ${currentUser.surname}
            </h1>
            <br/>
            <h1>
                Email: ${currentUser.mail}
            </h1>
        </div>
    </#if>
</div>
</#macro>