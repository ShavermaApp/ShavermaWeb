<!DOCTYPE HTML>
<html>
<body>
<form action="/login" method="post">
    <div><label> UserName : <input type="text" name="username"/> </label></div>
    <div><label> Password: <input type="password" name="password"/> </label></div>
    <input type="hidden" name="_csrf" value="${_csrf.token}" />
    <div><input type="submit" value="Sign In"/></div>
</form>
    </div>
    </form>
</body>
</html>
<!-- Pills content -->