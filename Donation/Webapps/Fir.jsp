<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>FIR Complaint Registration</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<form action="Fir" method="post">
<!-- Navigation Bar -->
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container">
        <a class="navbar-brand" href="#">FIR Registration</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link" href="index.jsp">Home</a> <!-- Added Home Link -->
                </li>

            </ul>
        </div>
    </div>
</nav>

    <div class="container mt-5">
        <h2 class="text-center">FIR Complaint Registration</h2>
        <form>
            <div class="mb-3">
                <label for="name" class="form-label">Full Name</label>
                <input type="text" class="form-control" id="name" placeholder="Enter your full name" required>
            </div>
            <div class="mb-3">
                <label for="contact" class="form-label">Contact Number</label>
                <input type="tel" class="form-control" id="contact" placeholder="Enter your contact number" required>
            </div>
            <div class="mb-3">
                <label for="email" class="form-label">Email Address</label>
                <input type="email" class="form-control" id="email" placeholder="Enter your email address">
            </div>
            <div class="mb-3">
                <label for="incidentDate" class="form-label">Date of Incident</label>
                <input type="date" class="form-control" id="incidentDate" required>
            </div>
            <div class="mb-3">
                <label for="location" class="form-label">Incident Location</label>
                <input type="text" class="form-control" id="location" placeholder="Enter incident location" required>
            </div>
            <div class="mb-3">
                <label for="complaint" class="form-label">Complaint Details</label>
                <textarea class="form-control" id="complaint" rows="4" placeholder="Describe the incident in detail" required></textarea>
            </div>
            <button type="submit" class="btn btn-primary">Submit FIR</button>
        </form>
    </div>

</body>
</html>
