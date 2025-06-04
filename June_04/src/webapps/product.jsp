<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Product</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <h1 align="center" style="color: red;">${message}</h1>
    <h2 class="mb-4 text-center">Add New Product</h2>

    <form action="product" method="post" class="row g-3">

        <div class="col-md-6">
            <label for="productId" class="form-label">Product ID</label>
            <input type="text" class="form-control" name="productId" id="productId" placeholder="Enter Product ID">
        </div>

        <div class="col-md-6">
            <label for="productName" class="form-label">Product Name</label>
            <input type="text" class="form-control" name="productName" id="productName" placeholder="Enter Product Name">
        </div>

        <div class="col-md-4">
            <label for="price" class="form-label">Price</label>
            <input type="number" class="form-control" name="price" id="price" placeholder="Enter Price">
        </div>

        <div class="col-md-4">
            <label for="category" class="form-label">Category</label>
            <select name="category" id="category" class="form-select">
                <option selected disabled>Choose...</option>
                <option>Electronics</option>
                <option>Clothing</option>
                <option>Books</option>
                <option>Home</option>
            </select>
        </div>

        <div class="col-md-4">
            <label for="quantity" class="form-label">Quantity</label>
            <input type="number" class="form-control" name="quantity" id="quantity" placeholder="Enter Quantity">
        </div>

        <div class="col-12 text-center">
            <button type="submit" class="btn btn-success btn-lg mt-3">Submit</button>
        </div>

    </form>
</div>

</body>
</html>