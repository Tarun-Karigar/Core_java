<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>HappyPaws - Pet Adoption</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f0f8ff;
            margin: 0;
            padding: 0;
        }

        .navbar {
            background-color: #4CAF50;
        }

        .navbar-brand, .nav-link {
            color: white !important;
        }

        .hero {
            text-align: center;
            padding: 80px 20px;
            background-color: #e3f2fd;
        }

        .hero h1 {
            font-size: 2.5rem;
            color: #333;
        }

        .hero p {
            font-size: 1.2rem;
            color: #555;
        }

        .btn-adopt {
            background-color: #4CAF50;
            color: white;
            padding: 12px 25px;
            border: none;
            border-radius: 25px;
            text-decoration: none;
        }

        footer {
            text-align: center;
            padding: 20px;
            background-color: #333;
            color: white;
        }
    </style>
</head>
<body>

<!-- Navigation -->
<nav class="navbar navbar-expand-lg">
    <div class="container">
        <a class="navbar-brand" href="#">🐶 HappyPaws</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link" href="#">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="#">Adopt</a></li>
                <li class="nav-item"><a class="nav-link" href="#">Donate</a></li>
                <li class="nav-item"><a class="nav-link" href="#">Contact</a></li>
            </ul>
        </div>
    </div>
</nav>

<!-- Main Section -->
<div class="hero">
    <h1>${message != null ? message : "Welcome to HappyPaws"}</h1>
    <p>Your next best friend is waiting. Adopt a pet today!</p>
    <a href="Adopt.jsp" class="btn-adopt">View Pets</a>
</div>

<!-- Footer -->
<footer>
    &copy; 2025 HappyPaws. All rights reserved.
</footer>

</body>
</html>
