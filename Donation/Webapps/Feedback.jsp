<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Teacher Feedback Form</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<form action="Feedback" method="post">
    <!-- Navigation Bar -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container">
            <a class="navbar-brand" href="#">Teacher Feedback</a>
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

    <!-- Teacher Feedback Form -->
    <div class="container mt-5">
        <h2 class="text-center">Teacher Feedback Form</h2>
        <form>
            <div class="mb-3">
                <label for="teacherName" class="form-label">Teacher's Name</label>
                <input type="text" class="form-control" id="teacherName" placeholder="Enter teacher's name" required>
            </div>
            <div class="mb-3">
                <label for="studentName" class="form-label">Your Name</label>
                <input type="text" class="form-control" id="studentName" placeholder="Enter your name" required>
            </div>
            <div class="mb-3">
                <label for="rating" class="form-label">Rating (1 to 5)</label>
                <select class="form-control" id="rating">
                    <option value="1">1 - Poor</option>
                    <option value="2">2 - Fair</option>
                    <option value="3">3 - Good</option>
                    <option value="4">4 - Very Good</option>
                    <option value="5">5 - Excellent</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="comments" class="form-label">Feedback Comments</label>
                <textarea class="form-control" id="comments" rows="4" placeholder="Share your thoughts"></textarea>
            </div>
            <button type="submit" class="btn btn-primary">Submit Feedback</button>
        </form>
    </div>
</body>
</html>
