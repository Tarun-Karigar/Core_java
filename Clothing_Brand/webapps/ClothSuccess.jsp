<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Clothing Item Submission</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .card {
            box-shadow: 0 8px 20px rgba(0,0,0,0.1);
        }
        .table-hover tbody tr:hover {
            background-color: #f1f1f1;
        }
        .table th {
            background-color: #198754;
            color: white;
        }
    </style>
</head>
<body>

<div class="container my-5">
    <div class="card">
        <div class="card-header bg-success text-white text-center fs-4">
            Submitted Clothing Item Details
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
                <tr><td>Name</td><td><%= request.getParameter("name") %></td></tr>
                <tr><td>Type</td><td><%= request.getParameter("type") %></td></tr>
                <tr><td>Incoming Price</td><td><%= request.getParameter("incomingPrice") %></td></tr>
                <tr><td>Selling Price</td><td><%= request.getParameter("sellingPrice") %></td></tr>
                <tr><td>MRP</td><td><%= request.getParameter("mrp") %></td></tr>
                <tr><td>Description</td><td><%= request.getParameter("description") %></td></tr>
                <tr><td>Brand</td><td><%= request.getParameter("brand") %></td></tr>
                <tr><td>Quantity</td><td><%= request.getParameter("quantity") %></td></tr>
                <tr><td>Color</td><td><%= request.getParameter("color") %></td></tr>
                <tr><td>Weight</td><td><%= request.getParameter("weight") %> grams</td></tr>
                <tr><td>Manufacture Date</td><td><%= request.getParameter("manufDate") %></td></tr>
                <tr><td>Warranty</td><td><%= request.getParameter("warranty") %></td></tr>
                <tr><td>Return Policy</td><td><%= request.getParameter("returnPolicy") != null ? "Yes (7 Days)" : "No" %></td></tr>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>
