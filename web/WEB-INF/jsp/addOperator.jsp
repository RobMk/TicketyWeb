<%-- 
    Document   : addOperator
    Created on : 2017-04-04, 12:01:09
    Author     : Robo
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="/TicketyWebNazwa/css/bootstrap.css" rel="stylesheet">
        <script src="/TicketyWebNazwa/js/bootstrap.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Operator</title>
    </head>
    <body>
        <div class="container">
            <br>
            <jsp:include page="menu.jsp"/>
            <br>
            <h1>Dodawanie operatora</h1>
            <br> <br>

            <form:form method="POST" modelAttribute="addoperator" >
                <table>  
                    <form:hidden path="nrOperatora"/>
                    <tr><td>Imię:</td><td><form:input path="imie" class="form-control input-md"/></td></tr>
                    <tr><td>Nazwisko:</td><td><form:input path="nazwisko" class="form-control input-md"/></td></tr>

                </table>
                <br>
                <input type="submit" value="Zapisz" class="btn btn-success">
            </form:form>
            </body>
            </html>
