<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<!-- Static content -->
<link rel="stylesheet" href="/resources/css/estilos.css">
<script type="text/javascript" src="/resources/js/app.js"></script>
<title>test</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>nombre</td>
			<td>apellido1</td>
			<td>apellido2</td>
			<td>dni</td>
			<td>fecha_nacimiento</td>
			<td>cod_empleado</td>
			<td>salario</td>
			<td>fecha_alta</td>
			<td>imagen_empleado</td>
			<td>empleado.categoria.nombre</td>
			<td>empleado.categoria.descripcion</td>
			<td>empleado.departamento.nombre</td>
		</tr>
		<c:forEach var="persona" items="${lista}">
			<tr>
				<td>${persona.nombre}</td>
				<td>${persona.apellido1}</td>
				<td>${persona.apellido2}</td>
				<td>${persona.dni}</td>
				<td>${persona.fecha_nacimiento}</td>
				<td>${persona.empleado.cod_empleado}</td>
				<td>${persona.empleado.salario}</td>
				<td>${persona.empleado.fecha_alta}</td>
				<td>${persona.empleado.imagen_empleado}</td>
				<td>${persona.empleado.categoria.nombre}</td>
				<td>${persona.empleado.categoria.descripcion}</td>
				<td>${persona.empleado.departamento.nombre}</td>
			</tr>    	
    	<%-- <c:out value = "${persona.nombre}"/><br/> --%>
    	</c:forEach>
	</table>
	
</body>
</html>
