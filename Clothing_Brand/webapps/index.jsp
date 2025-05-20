<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>My Clothing Brand</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-image: url('https://img.pikbest.com/ai/illus_our/20230413/7f7a5af5338449137251eaa2f673d9ab.jpg!w700wp');
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            height: 100vh;
            color: white;
        }

        .overlay {
            background-color: rgba(0, 0, 0, 0.6); /* Dark overlay for contrast */
            padding: 60px;
            border-radius: 15px;
        }
    </style>
</head>
<body>

<div class="container d-flex justify-content-center align-items-center h-100">
    <div class="text-center overlay">
        <h1 style="color: red;">${message}</h1>
        <h1 class="mb-4">Welcome to My Clothing Brand</h1>
        <a href="Cloth.jsp" class="btn btn-primary btn-lg">Add New Clothing Item</a>
    </div>
</div>

</body>
</html>
