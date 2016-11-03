<!DOCTYPE html>
<html>
<head lang="en">
    <link rel="stylesheet" href="css/login.css"/>
    <meta charset="UTF-8">
    <title>Developer Graph</title>
</head>
<body>
<div class="login-form">
    <div class="login-logo"></div>
    <div class="login-title">Sign in to Developer Graph</div>
    <form action="login" method="post">
        <label class="inputs" for="login">Username or email address </label>
        <input class="inputs" id="login" type="email" name="mail"/>
        <label class="inputs" for="pass">Password </label>
        <input class="inputs" id="pass" type="password" name="password"/>
        <label class="inputs" for="pass">Remambre my acount</label>
        <input type="checkbox" name="remamer">
        <input  class="btn btn-success inputs" type="submit" value="Sign in"/>
    </form>
    <div class="new-user">
        New to Developer Graph?
        <a href="register.jsp">Create an account.</a>
    </div>
</div>
</body>
</html>