<#macro login path isRegisterForm>
<form action="${path}" method="post">
    <div class="form-group">
        <label for="exampleInputEmail1"> User Name : </label>
        <input type="text" name="username" class="form-control" placeholder="User name"/>
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1"> Password: </label>
        <input type="password" class="form-control" name="password" placeholder="Password"/>
    </div>
    <#if isRegisterForm>
    <div class="form-group">
        <label for="exampleInputPassword1"> Email: </label>
        <input type="email" class="form-control" name="email" placeholder="some@some.com"/>
    </div>
    </#if>
    <input type="hidden" name="_csrf" value="${_csrf.token}" />
    <#if !isRegisterForm><a href="/registration">Add new user</a></#if>
    <button type="submit" class="btn btn-primary"><#if isRegisterForm>Sign up<#else>Sign in</#if></button>
</form>
</#macro>

<#macro logout>
<form action="/logout" method="post">
    <input type="hidden" name="_csrf" value="${_csrf.token}" />
    <button type="submit" class="btn btn-primary">Sign Out</button>
</form>
</#macro>