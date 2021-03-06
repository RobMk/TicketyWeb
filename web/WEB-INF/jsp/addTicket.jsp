<%-- 
    Document   : addTicket
    Created on : 2017-04-06, 09:37:48
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
        <title>Dodawanie nowego ticketa</title>
    </head>
    <body>
        <div class="container">
            <jsp:include page="menu.jsp"/>

            <h1>Nowy Ticket</h1>

            <form:form  method="POST" modelAttribute="addticket">
                <table border="1" class="table table-hover">
                    <form:hidden path="nrTicketa"/>
                    <form:hidden path="status.nrStatusu" value="10"/>
                    <tr><td>Tytuł</td><td><form:input  path="tytulTicketa" type="text" cssClass="form-control"/></td></tr>
                    <tr><td>Opis</td><td><form:input path="opisTicketa" cssClass="form-control"/></td></tr>
                    <tr>
                        <td>Typ Ticketu</td><td>
                            <form:select path="typTickety.nrTt" cssClass="form-control">
                                <c:forEach items="${typticketu}" var="tt">
                                    <c:choose>
                                        <c:when test="${tt.nrTt==tickety.typTickety.nrTt}">
                                    <option selected="true" value="${tt.nrTt}">${tt.nazwaTt}</option>
                                </c:when>
                                <c:otherwise>
                                    <option value=${tt.nrTt}>${tt.nazwaTt}</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </form:select>    
                    </td>
                    </tr>
                    <tr>
                        <td>Priorytet</td><td>
                            <form:select path="priorytet.nrPriorytetu" cssClass="form-control">
                                <c:forEach items="${priorytet}" var="p">
                                    <c:choose>
                                        <c:when test="${p.nrPriorytetu==tickety.priorytet.nrPriorytetu}">
                                    <option selected="true" value="${p.nrPriorytetu}">${p.nazwaPriorytetu}</option>
                                </c:when>
                                <c:otherwise>
                                    <option value=${p.nrPriorytetu}>${p.nazwaPriorytetu}</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </form:select>    
                    </td>
                    </tr>
                    <tr>
                        <td>Operator</td><td>
                            <form:select path="operator.nrOperatora" cssClass="form-control">
                                <c:forEach items="${operator}" var="o">
                                    <c:choose>
                                        <c:when test="${o.nrOperatora==tickety.operator.nrOperatora}">
                                    <option selected="true" value="${o.nrOperatora}">${o.imie} ${o.nazwisko}</option>
                                </c:when>
                                <c:otherwise>
                                    <option value=${o.nrOperatora}>${o.imie} ${o.nazwisko}</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </form:select>    
                    </td>
                    </tr>
                </table>
                <br>
                <input type="submit" value="Zapisz" class="btn btn-success"</a>
            </form:form> 
        </div>
    </body>
</html>
