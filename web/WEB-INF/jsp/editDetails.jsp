<%-- 
    Document   : editDetails
    Created on : 2017-04-05, 09:33:48
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
        <title>Edit ticket</title>
    </head>
    <body>
        <div class="container">

            <jsp:include page="menu.jsp"/>

            <h1>Edytuj ticket</h1>

            <form:form  method="POST" modelAttribute="tickety">
                <table border="1" class="table table-hover">

                    <form:hidden path="nrTicketa"/>
                   
                    
                    <tr><td>Tytuł</td><td><form:input  path="tytulTicketa" type="text" cssClass="form-control"/></td></tr>
                    <tr><td>Opis</td><td><form:input path="opisTicketa" cssClass="form-control"/></td></tr>
                    <tr>
                        <td>Status</td><td>
                            <form:select path="status.nrStatusu" cssClass="form-control">
                                <c:forEach items="${status}" var="s">
                                    <c:choose>
                                        <c:when test="${s.nrStatusu==tickety.status.nrStatusu}">
                                    <option selected="true" value="${s.nrStatusu}">${s.nazwaStatusu}</option>
                                </c:when>
                                <c:otherwise>
                                    <option value=${s.nrStatusu}>${s.nazwaStatusu}</option>
                                </c:otherwise>
                            </c:choose>
                        </c:forEach>
                    </form:select>    
                    </td>
                    </tr>

                    <tr>
                        <td>Typ Ticketu</td><td>
                            <form:select path="typTickety.nrTt" cssClass="form-control">
                                <c:forEach items="${typTicketu}" var="tt">
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
