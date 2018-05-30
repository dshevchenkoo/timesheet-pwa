<#import "parts/common.ftl" as c>

<@c.page>
<h5>${username}</h5>
    ${message?ifExists}
   <form method="post">
       <div class="form-group">
           <label for="exampleInputEmail1"> User Name : </label>
           <input type="text" name="username" class="form-control" value="${username}"/>
       </div>
       <h5>New password</h5>
       <div class="form-group">
           <label for="exampleInputPassword1"> Password: </label>
           <input type="password" class="form-control " name="password" placeholder="Password"/>
       </div>
       <div class="form-group">
           <label for="exampleInputPassword1"> Password: </label>
           <input type="password" class="form-control" name="password" placeholder="Password"/>
       </div>
       <input type="hidden" name="_csrf" value="${_csrf.token}" />
       <button type="submit" class="btn btn-primary">Save</button>
   </form>
</@c.page>