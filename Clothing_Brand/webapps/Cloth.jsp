<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Clothing Item</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <h1 align="center" style="color: red;" >${message}</h1>
    <h2 class="mb-4 text-center">Add New Clothing Item</h2>

    <!-- Only one form tag -->
    <form action="cloth" method="post" class="row g-3">

        <div class="col-md-6">
            <label for="name" class="form-label">Name</label>
            <input type="text" class="form-control" name="name" id="name" placeholder="Enter clothing name">
        </div>

        <div class="col-md-6">
            <label for="type" class="form-label">Type</label>
            <select name="type" id="type" class="form-select">
                <option selected disabled>Choose...</option>
                <option>T-Shirt</option>
                <option>Shirt</option>
                <option>Pants</option>
                <option>Dress</option>
            </select>
        </div>

        <div class="col-md-4">
            <label for="incomingPrice" class="form-label">Incoming Price</label>
            <input type="number" class="form-control" name="incomingPrice" id="incomingPrice">
        </div>

        <div class="col-md-4">
            <label for="sellingPrice" class="form-label">Selling Price</label>
            <input type="number" class="form-control" name="sellingPrice" id="sellingPrice">
        </div>

        <div class="col-md-4">
            <label for="mrp" class="form-label">MRP</label>
            <input type="number" class="form-control" name="mrp" id="mrp">
        </div>

        <div class="col-12">
            <label for="description" class="form-label">Description</label>
            <textarea class="form-control" name="description" id="description" rows="3"></textarea>
        </div>

        <div class="col-md-6">
            <label for="brand" class="form-label">Brand</label>
            <input type="text" class="form-control" name="brand" id="brand">
        </div>

        <div class="col-md-3">
            <label for="quantity" class="form-label">Quantity</label>
            <input type="number" class="form-control" name="quantity" id="quantity">
        </div>

        <div class="col-md-3">
            <label for="color" class="form-label">Color</label>
            <select name="color" id="color" class="form-select">
                <option selected disabled>Choose...</option>
                <option>Red</option>
                <option>Blue</option>
                <option>Black</option>
                <option>White</option>
            </select>
        </div>

        <div class="col-md-4">
            <label for="weight" class="form-label">Weight (grams)</label>
            <input type="number" class="form-control" name="weight" id="weight">
        </div>

        <div class="col-md-4">
            <label for="manufDate" class="form-label">Manufacture Date</label>
            <input type="date" class="form-control" name="manufDate" id="manufDate">
        </div>

        <div class="col-md-4">
            <label for="warranty" class="form-label">Warranty</label>
            <select name="warranty" id="warranty" class="form-select">
                <option selected disabled>Choose...</option>
                <option>No Warranty</option>
                <option>6 Months</option>
                <option>1 Year</option>
            </select>
        </div>

        <div class="col-12">
            <div class="form-check">
                <input class="form-check-input" type="checkbox" name="returnPolicy" id="returnPolicy">
                <label class="form-check-label" for="returnPolicy">
                    7-Day Return Policy
                </label>
            </div>
        </div>

        <div class="col-12 text-center">
            <button type="submit" class="btn btn-success btn-lg mt-3">Submit</button>
        </div>

    </form>
</div>

</body>
</html>
