<#include "security.ftl">
<#import "login.ftl" as l>

<nav class="navbar navbar-expand-lg ">
    <a class="navbar-brand" href="/">Расписание ИМИТ</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link --light" href="/">Расписание</a>
            </li>
            <#if isAdmin>
            <li class="nav-item --light">
                <a class="nav-link" href="/user">Пользователи</a>
            </li>
            </#if>
            <li class="nav-item --light">
                <a class="nav-link" href="/news">Новости</a>
            </li>
        </ul>
        <#if isAdmin>
        <div class="navbar-text mr-3">${name}</div>
            <@l.logout />
        </#if>
    </div>
</nav>
