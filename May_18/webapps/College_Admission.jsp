<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admission Inquiry</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<form action="College" method="post">

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container">
        <a class="navbar-brand" href="index.jsp">College Admission</a>
    </div>
</nav>

<header class="text-center py-4 bg-light">
    <h1>Admission Inquiry</h1>
    <p>Fill out the form below and we'll get back to you soon!</p>
</header>

<section class="container my-5">
    <form id="admissionForm" class="mx-auto" style="max-width: 500px;">
        <div class="mb-3">
            <label for="name" class="form-label">Full Name</label>
            <input type="text" name="name" class="form-control" id="name" required>
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">Email Address</label>
            <input type="email"  name="email" class="form-control" id="email" required>
        </div>
        <div class="mb-3">
            <label for="course" class="form-label">Interested Course</label>
            <select class="form-select" name="course" id="course">
                <option selected>Select a Course</option>
                <option value="B.E">B.E</option>
                <option value="B.Sc">B.Sc</option>
                <option value="MBA">MBA</option>
            </select>
        </div>
        <div class="mb-3">
            <label for="message" class="form-label">Additional Queries</label>
            <textarea class="form-control" name="message" id="message" rows="4"></textarea>
        </div>
        <button type="submit" class="btn btn-primary w-100">Submit Inquiry</button>
    </form>
</section>

<script>
    document.getElementById("admissionForm").addEventListener("submit", function(event) {
        event.preventDefault(); // Prevent default form submission

        // Simulating form processing (e.g., sending data to a server)
        alert("Form submitted successfully!");

        // Redirect to index page
        window.location.href = "index.jsp";
    });
</script>

</body>
</html>
