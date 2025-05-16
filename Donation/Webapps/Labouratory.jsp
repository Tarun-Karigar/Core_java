<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Laboratory Registration</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<form action="Labrotary" method="post">
    <!-- Navigation Bar -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container">
            <a class="navbar-brand" href="#">Laboratory</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="index.jsp">Home</a> <!-- Links to Home Page -->
                    </li>

                </ul>
            </div>
        </div>
    </nav>

    <!-- Laboratory Registration Form -->
    <div class="container mt-5">
        <h2 class="text-center">Laboratory Registration</h2>
        <form>
            <div class="mb-3">
                <label for="labName" class="form-label">Laboratory Name</label>
                <input type="text" class="form-control" id="labName" placeholder="Enter laboratory name" required>
            </div>
            <div class="mb-3">
                <label for="location" class="form-label">Laboratory Location</label>
                <input type="text" class="form-control" id="location" placeholder="Enter location" required>
            </div>
            <div class="mb-3">
                <label for="contactPerson" class="form-label">Contact Person</label>
                <input type="text" class="form-control" id="contactPerson" placeholder="Enter contact person's name" required>
            </div>
            <div class="mb-3">
                <label for="contactNumber" class="form-label">Contact Number</label>
                <input type="tel" class="form-control" id="contactNumber" placeholder="Enter contact number" required>
            </div>
            <button type="submit" class="btn btn-primary">Register Laboratory</button>
        </form>
    </div>
</body>
</html>
