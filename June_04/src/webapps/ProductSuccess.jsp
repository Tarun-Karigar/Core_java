<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Electronic Item Submission</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f8f9fa;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }
        .card {
            box-shadow: 0 8px 20px rgba(0,0,0,0.1);
            border-radius: 15px;
        }
        .table-hover tbody tr:hover {
            background-color: #f1f1f1;
        }
        .table th {
            background-color: #0d6efd;
            color: white;
        }
        .success-icon {
            font-size: 60px;
            color: #0d6efd;
        }
    </style>
</head>
<body>

<div class="container my-5">
    <div class="card">
        <div class="card-header bg-primary text-white text-center fs-4">
            <div class="mb-2">
                ✅ <span class="success-icon">&#10004;</span>
            </div>
            Electronic Item Submitted Successfully!
        </div>
        <div class="card-body p-4">
            <table class="table table-striped table-bordered table-hover">
                <thead>
                <tr>
                    <th scope="col">Field</th>
                    <th scope="col">Value</th>
                </tr>
                </thead>
                <tbody>
                <tr><td>Product ID</td><td><%= request.getParameter("productId") %></td></tr>
                <tr><td>Name</td><td><%= request.getParameter("name") %></td></tr>
                <tr><td>Price</td><td><%= request.getParameter("price") %></td></tr>
                <tr><td>Category</td><td><%= request.getParameter("category") %></td></tr>
                <tr><td>Quantity</td><td><%= request.getParameter("quantity") %></td></tr>
                </tbody>
            </table>

            <div class="text-center mt-4">
                <a href="product.jsp" class="btn btn-primary">Add Another Item</a>
                <a href="ViewElectronics.jsp" class="btn btn-outline-secondary ms-2">View All Items</a>
            </div>
        </div>
    </div>
</div>

</body>
</html>