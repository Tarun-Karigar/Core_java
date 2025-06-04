<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>RawStitch - Premium Clothing Brand</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Discover premium clothing at RawStitch. Shop the latest trends with style and comfort.">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;600;700&family=Poppins:wght@300;500;700&display=swap" rel="stylesheet">

    <!-- Font Awesome for Icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">

    <style>
        body {
            background-image: url('https://img.pikbest.com/ai/illus_our/20230413/7f7a5af5338449137251eaa2f673d9ab.jpg!w700wp');
            background-size: cover;
            background-position: center;
            background-attachment: fixed;
            min-height: 100vh;
            font-family: 'Poppins', sans-serif;
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
            font-family: 'Montserrat', sans-serif;
            font-weight: 700;
            font-size: 1.8rem;
            color: #f9d423 !important;
        }

        .navbar-brand:hover {
            color: #ff4e50 !important;
        }

        .nav-link {
            color: #fff !important;
            font-weight: 500;
            padding: 10px 20px !important;
            transition: color 0.3s ease, transform 0.2s ease;
        }

        .nav-link:hover {
            color: #f9d423 !important;
            transform: translateY(-2px);
        }

        .dropdown-menu {
            background: rgba(0, 0, 0, 0.9);
            border: none;
            border-radius: 10px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.3);
        }

        .dropdown-item {
            color: #fff;
            padding: 10px 20px;
            transition: background 0.3s ease;
        }

        .dropdown-item:hover {
            background: #f9d423;
            color: #000 !important;
        }

        /* Main Content Overlay */
        .overlay {
            background: rgba(0, 0, 0, 0.75);
            padding: 80px 40px;
            border-radius: 25px;
            box-shadow: 0 0 30px rgba(255, 255, 255, 0.15);
            animation: fadeIn 1s ease-in-out;
            max-width: 600px;
            width: 100%;
        }

        @keyframes fadeIn {
            0% { opacity: 0; transform: translateY(20px); }
            100% { opacity: 1; transform: translateY(0); }
        }

        h1 {
            font-family: 'Montserrat', sans-serif;
            font-weight: 700;
            font-size: 2.5rem;
            color: #fff;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
            margin-bottom: 20px;
        }

        .message {
            color: #ff4e50;
            font-size: 1.6rem;
            margin-bottom: 20px;
        }

        .btn-custom {
            background: linear-gradient(45deg, #ff4e50, #f9d423);
            border: none;
            color: #000;
            font-weight: 600;
            font-size: 1.2rem;
            padding: 15px 35px;
            border-radius: 50px;
            transition: transform 0.3s ease, box-shadow 0.3s ease, background 0.3s ease;
            display: inline-flex;
            align-items: center;
            gap: 10px;
        }

        .btn-custom:hover {
            transform: translateY(-5px);
            box-shadow: 0 12px 24px rgba(0, 0, 0, 0.4);
            background: linear-gradient(45deg, #f9d423, #ff4e50);
        }

        .btn-custom i {
            font-size: 1.3rem;
        }

        /* Footer Styling */
        footer {
            background: rgba(0, 0, 0, 0.9);
            padding: 30px 0;
            color: #fff;
            text-align: center;
            position: relative;
            bottom: 0;
            width: 100%;
        }

        footer a {
            color: #f9d423;
            text-decoration: none;
            margin: 0 10px;
            transition: color 0.3s ease;
        }

        footer a:hover {
            color: #ff4e50;
        }

        /* Responsive Design */
        @media (max-width: 768px) {
            .overlay {
                padding: 40px 20px;
                margin: 20px;
            }

            h1 {
                font-size: 2rem;
            }

            .btn-custom {
                padding: 12px 25px;
                font-size: 1rem;
            }

            .navbar-brand {
                font-size: 1.5rem;
            }

            .nav-link {
                padding: 8px 15px !important;
            }
        }

        @media (max-width: 576px) {
            .overlay {
                padding: 30px 15px;
            }

            h1 {
                font-size: 1.8rem;
            }

            .btn-custom {
                padding: 10px 20px;
                font-size: 0.9rem;
            }
        }
    </style>
</head>
<body>

<!-- Navigation Bar -->
<nav class="navbar navbar-expand-lg navbar-dark fixed-top">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">👕 RawStitch</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link active" href="#">Home</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="shopDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Shop
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="shopDropdown">
                        <li><a class="dropdown-item" href="#">Men</a></li>
                        <li><a class="dropdown-item" href="#">Women</a></li>
                        <li><a class="dropdown-item" href="#">Kids</a></li>
                        <li><a class="dropdown-item" href="#">Accessories</a></li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Collections</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Cloth.jsp">Manage Inventory</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">About Us</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Contact</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="fas fa-shopping-cart"></i> Cart</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- Main Content -->
<div class="container d-flex justify-content-center align-items-center min-vh-100">
    <div class="text-center overlay">
        <h1 class="message">${message}</h1>
        <h1 class="mb-4">Welcome to RawStitch</h1>
        <p class="lead mb-4" style="color: #ddd;">Discover the latest trends in premium clothing designed for style and comfort.</p>
        <a href="#shop" class="btn btn-custom"><i class="fas fa-store"></i> Shop Now</a>
    </div>
</div>

<!-- Footer -->
<footer>
    <div class="container">
        <p>© 2025 RawStitch. All Rights Reserved.</p>
        <div>
            <a href="#"><i class="fab fa-facebook-f"></i></a>
            <a href="#"><i class="fab fa-instagram"></i></a>
            <a href="#"><i class="fab fa-twitter"></i></a>
            <a href="#"><i class="fab fa-pinterest"></i></a>
        </div>
        <p class="mt-2">
            <a href="#">Privacy Policy</a> | <a href="#">Terms of Service</a> | <a href="#">FAQs</a>
        </p>
    </div>
</footer>

<!-- Bootstrap JS and Popper.js -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

<!-- Smooth Scroll for Anchor Links -->
<script>
    document.querySelectorAll('a[href^="#"]').forEach(anchor => {
        anchor.addEventListener('click', function (e) {
            e.preventDefault();
            document.querySelector(this.getAttribute('href')).scrollIntoView({
                behavior: 'smooth'
            });
        });
    });
</script>

</body>
</html>