<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Contact Us</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
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
                    <a class="nav-link" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="about.html">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="contact.html">Contact</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- Contact Section -->
<section class="container mt-5">
    <h2 class="text-center mb-4">Contact Us</h2>
    <div class="row">
        <div class="col-md-6">
            <h5>Get in Touch</h5>
            <p>Email: support@example.com</p>
            <p>Phone: +91 98765 43210</p>
            <p>Address: 123 Donation Street, Bengaluru, India</p>
        </div>
        <div class="col-md-6">
            <h5>Send us a Message</h5>
            <form action="Donation" methods="post">
                <div class="mb-3">
                    <label class="form-label">Full Name</label>
                    <input type="text" name="Name" placeholder="Your Name">
                </div>
                <div class="mb-3">
                    <label class="form-label">Email</label>
                    <input type="email" name="Email" placeholder="Your Email">
                </div>
                <div class="mb-3">
                    <label class="form-label">Message</label>
                    <textarea name="Message" rows="4" placeholder="Your Message"></textarea>
                </div>
                <input type="submit" value="click">
                            </form>
        </div>
    </div>
</section>

<!-- Footer -->
<footer class="bg-dark text-white text-center p-3 mt-5">
    <p>Contact us at support@example.com | Follow us on social media</p>
</footer>

</body>
</html>
