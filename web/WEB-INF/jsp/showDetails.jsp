<%-- 
    Document   : showDetails
    Created on : 2017-04-04, 10:00:22
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
         <jsp:include page="menu.jsp"/>
        
        <h1>Szczegóły ticketu</h1>
        <table border="1" class="table table-hover">
            <tr><td>NR</td><td>${showOne.nrTicketa}</td></tr>
            <tr><td>Tytuł</td><td>${showOne.tytulTicketa}</td></tr>
             <tr><td>Opis</td><td>${showOne.opisTicketa}</td></tr>
            <tr><td>Typ ticketu</td><td>${showOne.typTickety.nazwaTt}</td></tr>
            <tr><td>Priorytet</td><td>${showOne.priorytet.nazwaPriorytetu}</td></tr>
            <tr><td>Status</td><td>${showOne.status.nazwaStatusu}</td></tr>
            <tr><td>Operator</td><td>${showOne.operator.imie} ${showOne.operator.nazwisko}</td></tr>
            
               
        </table>
            <br><br>
            <a href="showtickets.io" class="btn btn-default">Powrót</a>
        </div>
    </body>
</html>
