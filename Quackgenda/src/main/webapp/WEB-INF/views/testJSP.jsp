<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<!-- Static content -->
<link rel="stylesheet" href="/resources/css/estilos.css">
<script type="text/javascript" src="/resources/js/app.js"></script>
<title>Test - Pedir cadenas</title>
</head>
<body>
	<h1>${mensajeTest}</h1>
	<c:forEach var="empleado" items="${listaEmpleados}">
    	<p><c:out value = "${listaEmpleados.nombre}"/></p>
    </c:forEach>
</body>
</html>
