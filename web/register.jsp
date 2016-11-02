<!doctype html>
<html lang="en">
<head>
    <link rel="stylesheet" href="css/register.css"/>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
    <meta charset="UTF-8">
    <title>Developer Graph</title>
</head>
<body>
<header>
    <div class="navigation">
        <div class="wrapper">
            <nav>
                <a href="/dev-project/index.html"><span class="logo"></span></a>
                <ul class="main-menu">
                    <li><a href="#">List</a></li>
                    <li><a href="#">Link 2</a></li>
                    <li><a href="#">Link 3</a></li>
                </ul>
                <label class="mobile-visible" id="menu-toggle" for="menu-check"></label>
                <input type="checkbox" id="menu-check"/>
                <ul class="right-menu mobile-hidden" id="collapse" >
                    <li><a href="#">Link 1</a></li>
                    <li><a href="#">Link 2</a></li>
                    <li><a href="#">Link 3</a></li>
                    <li class="buttons">
                        <form action="">
                            <input type="text" name="search" id="search" placeholder="Search"/>
                        </form>
                    </li>
                    <li class="buttons">
                        <a class="btn" href="login.jsp">Sign in</a>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
</header>
<main class="container">
    <h1>Join Developer Graph</h1>
    <p>The best way to design, build, and ship software.</p>
  <form action="reg" method="post">
      <label for="" >Firstname</label>
      <input type="text" placeholder="cacke your Firstname" class="" name="firstname">
      <div class="clear"></div>
      <label for=""  class=" ">Lastname</label>
      <input type="text" placeholder="cacke your Lastname" class="" name="lastname"/>
      <div class="clear"></div>
      <label for=""  class="">Gender</label>
      <select name="gender" placeholder="cacke your Gender" name="gender" class="" name="gender">
          <option>male</option>
          <option>female</option>
      </select>
      <div class="clear"></div>
      <label for=""class="" >BirdtDate</label>
      <input type="Date" name="birdtDate" >
      <div class="clear"></div>
      <label for=""  class="" >Country</label>
      <input type="text" name="country" placeholder="Check Country" class="">
      <div class="clear"></div>
      <label for="" class="">City</label>
      <input type="text" name="sity" placeholder="Check sity" class="">
      <div class="clear"></div>
      <label for="" class="">Email</label>
      <input type="email" class="" name="mail">
      <div class="clear"></div>
      <label for="" >Password</label>
      <input type="Password" name="password">
      <div class="clear"></div>
      <input type="submit" value="Sign up">
  </form>
    <section class="visible-lg visible-md ">
        <h2>You will love Developer-Graph</h2>
        <b>Unlimited </b> collaborators
        <br>
        <b>Unlimited </b>  public repositories
        <div>Great communication</div>
        <div>Frictionless development</div>
        <div>Open source community</div>
        <div class="img"></div>
    </section>
</main>
<script src="myjs.js"></script>
</body>
</html>