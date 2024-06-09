<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - College Bois de Boulogne</title>


    <style>
        body {
            font-family: Arial, sans-serif;
        }
        table {
            width: 50%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
        th {
            background-color: gree;
        }
        form {
            margin-bottom: 20px;
        }
        input[type="text"] {
            padding: 5px;
            margin-right: 10px;
        }
        button {
            padding: 5px 10px;
        }
        .student-info {
            margin-bottom: 5px;
        }


    </style>


</head>
<body>
<h1><%= "Welcome !" %>
</h1>
<br/>
<a href="College BdeB">College BdeB</a>


<h1>Liste des Etudiants</h1>
<form method="get" action="/search">
    <label for="searchQuery">Search:</label>
    <input type="text" id="searchQuery" name="searchQuery" placeholder="Search by name">
    <button type="submit">Search</button>
</form>

<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Nom</th>
        <th>Prenom</th>
        <th>Specialite</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="etudiant" items="${etudiants}">
        <tr>
            <td>${etudiant.id}</td>
            <td>${etudiant.nom}</td>
            <td>${etudiant.prenom}</td>
            <td>${etudiant.specialite}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>



</body>
</html>