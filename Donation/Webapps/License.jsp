<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>License Details Form</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<form action="License" method="post">
   <!-- Navigation Bar -->
   <nav class="navbar navbar-expand-lg navbar-light bg-light">
       <div class="container">
           <a class="navbar-brand" href="#">License Details</a>
           <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
               <span class="navbar-toggler-icon"></span>
           </button>
           <div class="collapse navbar-collapse" id="navbarNav">
               <ul class="navbar-nav ms-auto">
                   <li class="nav-item">
                       <a class="nav-link" href="index.jsp">Home</a> <!-- Only Home link included -->
                   </li>
               </ul>
           </div>
       </div>
   </nav>


    <!-- License Details Form -->
    <div class="container mt-5">
        <h2 class="text-center">License Details Form</h2>
        <form>
            <div class="mb-3">
                <label for="licenseNumber" class="form-label">License Number</label>
                <input type="text" class="form-control" id="licenseNumber" placeholder="Enter license number" required>
            </div>
            <div class="mb-3">
                <label for="licenseHolderName" class="form-label">License Holder's Name</label>
                <input type="text" class="form-control" id="licenseHolderName" placeholder="Enter name" required>
            </div>
            <div class="mb-3">
                <label for="issueDate" class="form-label">Issue Date</label>
                <input type="date" class="form-control" id="issueDate" required>
            </div>
            <div class="mb-3">
                <label for="expiryDate" class="form-label">Expiry Date</label>
                <input type="date" class="form-control" id="expiryDate" required>
            </div>
            <button type="submit" class="btn btn-primary">Submit License Details</button>
        </form>
    </div>
</body>
</html>
