<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>registration</title>
    <%@include file="styles.jsp"%>
    
</head>
<style>
    /* registration page specific styles */
    .registration-banner{
        background:
            linear-gradient(360deg, #e8ec0248),
            url("aserts/registration.png");
        height: 100vh;
        background-repeat: no-repeat;
        background-size: cover; 
        background-attachment: fixed;
        padding: 10% 0;
        

    }
    .registration-card{
     
        text-align: center;
        border-top-left-radius: 35px;
        border-top-right-radius: 35px;
        border-bottom-left-radius: 35px;
        border-bottom-right-radius: 35px;
        padding:10px 20px;
      
    );
    box-shadow: 
        0 10px 30px rgba(0,0,0,0.25),
        0 0 25px rgba(255, 200, 60, 0.6);
        backdrop-filter: blur(6px);

    border: 1px solid rgba(255,255,255,0.4);
    
        color: #fffcfd;
    }
    .registration-card input{
        background-color: transparent;
        border: none;
        border-bottom: 1px solid #fffcfd;
        margin: 15px 0;
        color: #fffcfd;
        border-bottom-right-radius: 20px;
        border-top-left-radius: 20px;
        background-color: #adab068a;
        border: 2px solid#e8ec02af;
        box-shadow: 2px 2px 7px #e8ec02af;
          height: 48px;
          font-size: large;

    }
    .registration-card h1{
        color: #fffcfd;
        font-size: 2.5rem;
        font-family:'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
        font-weight: 600;
        margin-bottom: 10px;
    }
    .registration-card input::placeholder{
        opacity: 0.9;
         color: #fff;
        font-size: 20px;
        font-family: Arial, Helvetica, sans-serif;
        padding-left: 30px;
        padding-top: 20px;
        
    }
    .registration-card .form-control:focus{
        box-shadow: none;
        border-color: #2E7D32;
        background: transparent !important;
         color:#000;
    }
    .registration-button{
        background-color: #1B5E20;
        border: 0.5px solid #2E7D32;
        box-shadow: 2px 2px 7px #2E7D32;
        color:#fffcfd;
        font-size: 1.2rem;
        font-family: Arial, Helvetica, sans-serif;
        font-weight: 500;
        border: none;
        padding: 10px 20px;
        border-radius: 5px;
        cursor: pointer;
         
        border-bottom-right-radius: 20px;
        border-top-left-radius: 20px;
        width: 100%;
         margin-top: 20px;
    }
    .registration-button:hover{
        background-color:#2E7D32;
    }
</style>

<body>
    <div class="registration-banner">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-md-5">
                    <div class="registration-card">
                        <h1>REGISTRATION</h1>
                      <form action="register" method="post">
                        <input type="text" class="form-control" placeholder="Firstname" name="firstname">
                        <input type="text" class="form-control" placeholder="Lastname" name="lastname">
                        <input type="text" class="form-control" placeholder="username" name="username">
                        <input type="email" class="form-control" placeholder="Email" name="email">
                        <input type="password" class="form-control" placeholder="Password" name="password">
                        <input type="password" class="form-control" placeholder="Confirm Password" name="confirmpassword">
                        
                        <button type="submit" class="registration-button">Register</button>
                        </form>
                        
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>