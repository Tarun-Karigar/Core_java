<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Donation Trust</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
    <style>
        body {
            background-color: #f8f9fa;
        }
        .hero {
    background: url('https://www.enter-world.org/images/donations.jpg') center/cover no-repeat;
    color: white;
    text-shadow: 2px 2px 4px #000;
    height: 100vh; /* This makes it cover the entire viewport height */
    display: flex;
    align-items: center;
    justify-content: center;
    text-align: center;
}

        .donation-form {
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        footer {
            background-color: #343a40;
            color: white;
            padding: 20px 0;
            text-align: center;
        }
    </style>
</head>
<body>
<!-- Navigation Bar -->
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container">
        <a class="navbar-brand" href="#">Trust Name</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#about">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Donation.jsp">Contact</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="Fir.jsp">FIR Complaint</a>
                </li>
                <li class="nav-item">
                <a class="nav-link" href="Labouratory.jsp">Labouratory Report</a>
                </li>
                <li class="nav-item">
                 <a class="nav-link" href="Feedback.jsp">Feedback</a>
                 </li>
                 <li class="nav-item">
                  <a class="nav-link" href="License.jsp">License</a>
                  </li>
            </ul>
        </div>
    </div>
</nav>

<!-- Hero Section -->
<header class="hero">
    <h1>Support a Cause That Matters</h1>
    <p>Every donation makes a difference in changing lives.</p>
</header>

<!-- Donation Section -->
<section class="container mt-5">
    <h2 class="text-center mb-4">Make a Donation</h2>
    <div class="donation-form mx-auto" style="max-width: 500px;">
        <form class="row g-3">
            <div class="col-md-6">
                <label class="form-label">Full Name</label>
                <input type="text" class="form-control" placeholder="Your Name">
            </div>
            <div class="col-md-6">
                <label class="form-label">Email</label>
                <input type="email" class="form-control" placeholder="Your Email">
            </div>
            <div class="col-12">
                <label class="form-label">Donation Amount</label>
                <input type="number" class="form-control" placeholder="Amount (INR)">
            </div>
            <div class="col-12 text-center">
                <button type="submit" class="btn btn-success">Donate Now</button>
            </div>
        </form>
    </div>
</section>

<!-- About Section -->
<section id="about" class="bg-light p-5 mt-5">
    <div class="container text-center">
        <h2>Our Mission</h2>
        <p>We are dedicated to supporting communities, education, and healthcare for those in need.</p>
    </div>
</section>

<!-- Contact Section -->
<section id="contact" class="p-5">
    <div class="container text-center">
        <h2>Contact Us</h2>
        <p>Email: support@example.com | Phone: +91 98765 43210</p>
    </div>
</section>

<!-- Footer -->
<footer class="bg-dark text-white text-center p-3 mt-5">
    <p>Contact us at support@example.com | Follow us on social media</p>
</footer>

</body>
</html>
