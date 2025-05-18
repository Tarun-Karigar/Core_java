<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Furniture Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<form action="Furniture" method="post">
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="furniture.jsp">Furniture</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="container mt-5">
    <h1>Furniture Form</h1>
    <form>
        <div class="mb-3">
            <label for="brand" class="form-label">Brand</label>
            <input type="text" class="form-control" id="brand" placeholder="Enter brand name">
        </div>
        <div class="mb-3">
            <label for="size" class="form-label">Size</label>
            <select class="form-control" id="size">
                <option>Small</option>
                <option>Medium</option>
                <option>Large</option>
            </select>
        </div>u
        <div class="mb-3">
            <label for="material" class="form-label">Material</label>
            <input type="text" class="form-control" id="material" placeholder="Enter material type">
        </div>
        <div class="mb-3">
            <label for="model" class="form-label">Model Name</label>
            <input type="text" class="form-control" id="model" placeholder="Enter model name">
        </div>
        <div class="mb-3">
            <label for="productbenefits" class="form-label">Product Benefits</label>
            <input type="text" class="form-control" id="productbenefits" placeholder="Enter Product Benefits">
        </div>
        <button type="submit" class="btn btn-primary" >Submit</button>
    </form>
</div>

</body>
</html>
