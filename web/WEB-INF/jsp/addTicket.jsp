<%-- 
    Document   : addTicket
    Created on : 2017-04-06, 09:37:48
    Author     : Robo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dodawanie nowego ticketa</title>
    </head>
    <body>

        <jsp:include page="menu.jsp"/>

        <h1>Nowy Ticket</h1>
        <form method="POST">
            <table border="1">
                <tr><td>Podaj tytuł ticketa</td><td><input type="text" name="nazwa"></td></tr>
                <tr><td>Opis</td><td><input type="text" name="opis"</td></tr>
                <tr><td>Wybierz typ ticketu</td><td>
                        <select name="typTicketu">
                            <c:forEach items="${att}" var="tt">
                                <option value="${tt.nrTt}">${tt.nazwaTt}</option>                            
                            </c:forEach>                        
                        </select>        
                    </td></tr>
                <tr><td>Wybierz priorytet</td><td>
                        <select name="priorytet">
                            <c:forEach items="${ap}" var="p">
                                <option value="${p.nrPriorytetu}">${p.nazwaPriorytetu}</option>
                            </c:forEach>
                        </select>
                    </td></tr>
                <tr><td>Wybierz operatora</td><td>
                        <select name="operator">
                            <c:forEach items="${ao}" var="o">
                                <option value="${o.nrOperatora}">${o.imie} ${o.nazwisko}</option>
                            </c:forEach>
                        </select>
                    </td></tr>
            </table>
            <br>
            <input type="submit" value="Zapisz">
        </form>
    </body>
</html>
