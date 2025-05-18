<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admission Inquiry Details</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
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

<h2 class="text-center">Submitted Admission Inquiry Details</h2>

<table>
    <tr>
        <th>Field</th>
        <th>Value</th>
    </tr>
    <tr>
        <td>Full Name</td>
        <td><%= request.getParameter("name") %></td>
    </tr>
    <tr>
        <td>Email Address</td>
        <td><%= request.getParameter("email") %></td>
    </tr>
    <tr>
        <td>Interested Course</td>
        <td><%= request.getParameter("course") %></td>
    </tr>
    <tr>
        <td>Additional Queries</td>
        <td><%= request.getParameter("message") %></td>
    </tr>
</table>

</body>
</html>
