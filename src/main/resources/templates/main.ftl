<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page>
<div>
    <@l.logout />
    <span><a href="/user">User list</a></span>
</div>

    <div>
        <form method="post" enctype="multipart/form-data">
            <input type="text" name="number" placeholder="Введите сообщение" />
            <input type="file" name="file">
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <button type="submit">Добавить</button>
        </form>
    </div>
    <div>Список сообщений</div>
        <form method="get" action="/main">
            <input type="text" name="filter" value="${filter?ifExists}">
            <button type="submit">Найти</button>
        </form>
    <div>Список групп:</div>
    <#list groups as group>
        <div>
            <b>${group.id}</b>
            <span>${group.number}</span>
            <strong>${group.authorName}</strong>
            <div>
                <#if group.filename??>
                    <img src="/img/${group.filename}">
                </#if>
            </div>
        </div>
    <#else>
No group
    </#list>

</@c.page>