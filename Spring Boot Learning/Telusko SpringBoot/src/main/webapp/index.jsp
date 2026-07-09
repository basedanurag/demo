<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Spring Boot + JSP</title>

    <style>
        *{
            margin:0;
            padding:0;
            box-sizing:border-box;
            font-family: Arial, Helvetica, sans-serif;
        }

        body{
            height:100vh;
            display:flex;
            justify-content:center;
            align-items:center;
            background:linear-gradient(135deg,#667eea,#764ba2);
        }

        .card{
            background:white;
            padding:40px;
            width:500px;
            border-radius:15px;
            text-align:center;
            box-shadow:0 10px 30px rgba(0,0,0,.3);
        }

        h1{
            color:#28a745;
            margin-bottom:20px;
        }

        h2{
            color:#444;
            margin-bottom:15px;
        }

        p{
            font-size:18px;
            margin:10px 0;
        }

        .time{
            color:#0d6efd;
            font-weight:bold;
        }

        button{
            margin-top:20px;
            padding:12px 25px;
            border:none;
            border-radius:8px;
            background:#28a745;
            color:white;
            font-size:16px;
            cursor:pointer;
        }

        button:hover{
            background:#1e7e34;
        }
    </style>
</head>

<body>

<div class="card">

    <h1>🚀 Spring Boot + JSP Working Successfully!</h1>

    <h2>Welcome Anurag 👋</h2>

    <p>
        Current Server Time:
    </p>

    <p class="time">
        <%= new java.util.Date() %>
    </p>

    <button onclick="showMessage()">
        Click Me
    </button>

</div>

<script>

    function showMessage(){
        alert("Congratulations! Your Spring Boot + JSP setup is working perfectly 🎉");
    }

</script>

</body>
</html>