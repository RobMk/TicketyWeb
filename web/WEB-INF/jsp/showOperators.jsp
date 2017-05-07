<%-- 
    Document   : showOperators
    Created on : 2017-04-04, 11:42:55
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
        <title>JSP Page</title>
    </head>

    <body>
        <div class="container">
            <jsp:include page="menu.jsp"/>
            <br>
            <br>
            <a href="addOperator.io" class="btn btn-success">Dodaj operatora</a>
            <br>
            <br>


            <h1>Operatorzy</h1>
            <table border="1" class="table table-hover">
                <tr><td>Nr</td><td>Imię</td><td>Nazwisko</td><td></td>

                    <c:forEach items="${operators}" var="o">

                    <tr><td>${o.nrOperatora}</td><td>${o.imie}</td><td>${o.nazwisko}</td><td>
                            <a href="editOperator.io?id=${o.nrOperatora}" class="btn btn-warning">Edytuj</a></td></tr>

                </c:forEach>
            </table>
        </div>
    </body>
</html>
