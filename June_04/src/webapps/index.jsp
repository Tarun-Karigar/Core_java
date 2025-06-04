<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>ElectroTech - Premium Electronics</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Discover the latest premium electronics at ElectroTech. Experience innovation and technology at its best.">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;600;700&display=swap" rel="stylesheet">

    <!-- Font Awesome for Icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">

    <style>
        body {
            background-image: url('https://img.pikbest.com/ai/illus_our/20230413/technology_background.jpg');
            background-size: cover;
            background-position: center;
            background-attachment: fixed;
            min-height: 100vh;
            font-family: 'Roboto', sans-serif;
            color: #fff;
            margin: 0;
            overflow-x: hidden;
        }

        /* Navbar Styling */
        .navbar {
            background: rgba(0, 0, 0, 0.85);
            padding: 15px 0;
            transition: background 0.3s ease;
        }

        .navbar-brand {
            font-weight: 700;
            font-size: 1.8rem;
            color: #ff9800 !important;
        }

        .nav-link {
            color: #fff !important;
            font-weight: 500;
            padding: 10px 20px !important;
            transition: color 0.3s ease;
        }

        .nav-link:hover {
            color: #ff9800 !important;
        }

        /* Main Content */
        .overlay {
            background: rgba(0, 0, 0, 0.75);
            padding: 80px 40px;
            border-radius: 25px;
            box-shadow: 0 0 30px rgba(255, 255, 255, 0.15);
            animation: fadeIn 1s ease-in-out;
            max-width: 600px;
            width: 100%;
        }

        h1 {
            font-weight: 700;
            font-size: 2.5rem;
            color: #fff;
        }

        .btn-custom {
            background: linear-gradient(45deg, #ff9800, #ff5722);
            border: none;
            color: #000;
            font-weight: 600;
            font-size: 1.2rem;
            padding: 15px 35px;
            border-radius: 50px;
            transition: transform 0.3s ease;
        }

        .btn-custom:hover {
            transform: translateY(-5px);
            background: linear-gradient(45deg, #ff5722, #ff9800);
        }

        /* Footer */
        footer {
            background: rgba(0, 0, 0, 0.9);
            padding: 30px 0;
            text-align: center;
        }
    </style>
</head>
<body>

<!-- Navigation Bar -->
<nav class="navbar navbar-expand-lg navbar-dark fixed-top">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">⚡ ElectroTech</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link" href="#">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="#">Shop</a></li>
                <li class="nav-item"><a class="nav-link" href="product.jsp">New Arrivals</a></li>
                <li class="nav-item"><a class="nav-link" href="#">Offers</a></li>
                <li class="nav-item"><a class="nav-link" href="#">Contact</a></li>
                <li class="nav-item"><a class="nav-link" href="#"><i class="fas fa-shopping-cart"></i> Cart</a></li>
            </ul>
        </div>
    </div>
</nav>

<!-- Main Content -->
<div class="container d-flex justify-content-center align-items-center min-vh-100">
    <div class="text-center overlay">
        <h1>Welcome to ElectroTech</h1>
        <p class="lead" style="color: #ddd;">Explore cutting-edge gadgets designed for the future.</p>
        <a href="#shop" class="btn btn-custom"><i class="fas fa-store"></i> Shop Now</a>
    </div>
</div>

<!-- Footer -->
<footer>
    <p>© 2025 ElectroTech. All Rights Reserved.</p>
    <div>
        <a href="#"><i class="fab fa-facebook-f"></i></a>
        <a href="#"><i class="fab fa-instagram"></i></a>
        <a href="#"><i class="fab fa-twitter"></i></a>
        <a href="#"><i class="fab fa-pinterest"></i></a>
    </div>
</footer>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>