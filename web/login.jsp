
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/login.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
</head>
<body>
    <div class="container" id="container">

        <div class="form-container sign-up-container">
            <form action="register" method="post"><!--action forgot pass register--> 
                <h1>Create Account</h1>

                <span>Make your own Account</span>
                <input type="username" placeholder="Username" name="user"/>
                <input type="password" placeholder="Password" name="pass"/>
                <input type="password" placeholder="Reenter Password" name="rpass"/>
                <input type="text" placeholder="Your Name" name="name"/>
                <input type="email" placeholder="Email" name="email"/>
                <input type="text" placeholder="Phone Number" name="phone"/>
                <input type="text" placeholder="Address" name="address"/>

                <button>
                    <input class="btn" type="submit" value="REGISTER" onclick="return Validate()"/>
                </button>
            </form>
        </div>

        <div class="form-container sign-in-container">
            <form action="login" method="post">
                <h1>Sign in</h1>

                <span>Use your account</span>
                <input type="text" placeholder="Username" name="username"/>
                <input type="password" placeholder="Password" name="password"/>
                <input type="checkbox" name="remember" value="remember"/> Remember me
                <a href="#">Forgot your password?</a>
                <button>
                    <input class="btn" type="submit" value="LOGIN"/>
                </button>
                <a class="home" href="index.html">HOME</a>
            </form>
        </div>

        <div class="overlay-container">
            <div class="overlay">
                <div class="overlay-panel overlay-left">
                    <h1>Welcome Back!</h1>
                    <p>To keep connected with us please login with your personal info</p>
                    <button class="ghost signIn" id="signIn">Sign In</button>
                </div>
                <div class="overlay-panel overlay-right ">
                    <h1>Hello, Friend!</h1>
                    <p>Enter your personal details and start journey with us</p>
                    <button class="ghost signIn" id="signUp">Sign Up</button>
                </div>
            </div>
        </div>
    </div>

</body>
<script src="js/login.js"></script>
</html>
