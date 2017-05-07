<%-- 
    Document   : showTickets
    Created on : 2017-04-04, 09:02:51
    Author     : Robo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="/TicketyWebNazwa/css/bootstrap.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script src="/TicketyWebNazwa/js/bootstrap.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista ticketów</title>
    </head>
    <body>
        <div class="container">
            <jsp:include page="menu.jsp"/>

            <h1>Lista Ticketów</h1>
            <table class="table table-hover">
                <tr>
                    <td>nr</td><td>Tytuł</td><td>Typ ticketu</td><td>Priorytet</td><td>Status</td><td>Operator</td><td>Akcje</td>
                </tr>

                <c:forEach items="${ticket}" var="t">
                    <tr>
                        <td>${t.nrTicketa}</td>
                        <td>${t.tytulTicketa}</td>
                        <td>${t.typTickety.nazwaTt}</td>
                        <td>${t.priorytet.nazwaPriorytetu}</td>
                        <td>${t.status.nazwaStatusu}</td>
                        <td>${t.operator.imie} ${t.operator.nazwisko}</td>
                        <td><a href="showdetails.io?id=${t.nrTicketa}" class="btn btn-info">Pokaż</a>&nbsp;
                            <a href="editdetails.io?id=${t.nrTicketa}" class="btn btn-warning">Edytuj</a>&nbsp;
                            <a href=" " class="btn btn-danger">Kasuj</a></td>
                    </tr>  
                </c:forEach>
            </table>
        </div>
    </body>
</html>
