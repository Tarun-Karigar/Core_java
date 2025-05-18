<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            padding: 2rem;
        }
        table {
            width: 60%;
            border-collapse: collapse;
            margin: auto;
        }
        th, td {
            padding: 12px;
            border: 1px solid #ddd;
        }
        th {
            background-color: #333;
            color: white;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>

<h2 style="text-align:center;">Submitted Product Details</h2>

<table>
    <tr>
        <th>Field</th>
        <th>Value</th>
    </tr>
    <tr>
        <td>brand</td>
        <td><%= request.getParameter("brand") %></td>
    </tr>
    <tr>
        <td>model Name</td>
        <td><%= request.getParameter("model_Name") %></td>
    </tr>
    <tr>
        <td>Material</td>
        <td><%= request.getParameter("material") %></td>
    </tr>
    <tr>
        <td>Size</td>
        <td><%= request.getParameter("size") %></td>
    </tr>
    <tr>
        <td>Benefits</td>
        <td><%= request.getParameter("product_Benefits") %></td>
    </tr>
</table>

</body>
</html>