<%-- 
    Document   : editOperator
    Created on : 2017-05-04, 17:09:56
    Author     : Robo
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="/TicketyWebNazwa/css/bootstrap.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script src="/TicketyWebNazwa/js/bootstrap.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edytuj operatora</title>
    </head>
    <body>
        <div class="container">
            <jsp:include page="menu.jsp"/>

            <h1>Edycja operatora</h1>

            <form:form method="POST" modelAttribute="operator">

                <table>  
                    <form:hidden path="nrOperatora"/>
                    <tr><td>Imię:</td><td><form:input path="imie"/></td></tr>
                    <tr><td>Nazwisko:</td><td><form:input path="nazwisko"/></td></tr>
                    
                    
                    </table>
                    <br>
                    <input type="submit" value="Zapisz" class="btn btn-success">
                </div>
        </form:form>
    </body>
</html>