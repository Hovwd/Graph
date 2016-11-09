<!doctype html>
<html lang="en">
<head>
    <link rel="stylesheet" href="css/prof.css"/>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
    <meta charset="UTF-8">
    <title>Developer Graph</title>
</head>
<body>
<%
    String userName = null;
    Cookie[] cookies = request.getCookies();
    if(cookies !=null){
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("user")) userName = cookie.getValue();
        }
    }
    if(userName == null) response.sendRedirect("login.jsp");
%>
<header>
    <div class="navigation container">
        <ul class="laft">
            <li>
                <div class="logo"></div>
            </li>
            <li>
                <form action=""><input type="search"  placeholder="Search User"><input type="submit" class="btn1" value="Search"></form></li>
            <li><a href="">Home</a></li>
            <li><a href="">Organisaition</a></li>
        </ul>
    <ul class="right">
        <li>
            <input type="submit" value="loge out" class="btn1">
    </ul>
    </div>
</header>
<main class="container">
  <section class="prof">
      <div class="img"><img src="img/images.png" alt="">
      </div>
      <h3 class="name"><%=userName %></h3>
      <input type="submit" value="CV" class="btn1">
  </section>
    <section>
        <button class="btn1 edit">Edit Profile</button>
        <nav>
            <ul class="rep">
                <li>My Questions</li>
                <li>Answers in question</li>
                <li>Question</li>
                <li>Jobs</li>
            </ul>
        </nav>
        <div class="question">
            <input type="search"  placeholder="check your question"><input type="submit" class="btn1" value="Search Question">
        </div>
    </section>
    <div class="clear"></div>
</main>
<script src="myjs.js"></script>
</body>
</html>