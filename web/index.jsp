<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <link rel="stylesheet" href="css/style.css"/>
    <meta charset="UTF-8">
    <title>Developer Graph</title>
</head>
<body>
    <header>
        <div class="navigation">
            <div class="wrapper">
                <nav>
                    <a href="/"><span class="logo"></span></a>
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
                        <li class="buttons">
                            <form action="">
                                <input type="text" name="search" id="search" placeholder="Search"/>
                            </form>
                        </li>
                        <li class="buttons">
                            <a class="btn" href="login.jsp">Sign in</a>
                        </li>
                        <li class="buttons">
                            <a class="btn btn-success" href="register.jsp">Sign up</a>
                        </li>
                    </ul>
                </nav>
            </div>
        </div>

        <div class="intro">
            <div class="wrapper">
                <div class="welcome">
                    <h2>How people build software</h2>
                    <p>Millions of developers use GitHub to build personal projects, support their businesses, and work
                        together on open source technologies.</p>
                </div>
                <div class="registration">
                    <form action="">
                        <input type="text" placeholder="Pick a username"/>
                        <input type="email" placeholder="Your e-main adress"/>
                        <input type="password" placeholder="Create a password"/>
                        <input type="submit" value="Sign up" class="btn btn-success"/>
                    </form>
                </div>
            </div>
        </div>
    </header>
<script src="myjs.js"></script>
</body>
</html>