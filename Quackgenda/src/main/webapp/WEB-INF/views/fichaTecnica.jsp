<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE HTML>
<html>
<head>
<title>Quackgenda</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="../resources/css/style.css" />
<style>
.container-1{

  
  vertical-align: middle;
  white-space: nowrap;
  position: relative;
  top:140px;
  left:34.5%;
}

.container-1 input#search{
  width: 420px;
  height: 50px;
  background: #ffffff;
  border: none;
  font-size: 10pt;
  float: left;
  color: #63717f;
  padding-left: 45px;
  -webkit-border-radius: 5px;
  -moz-border-radius: 5px;
  border-radius: 5px;
}

.container-1 input#search::-webkit-input-placeholder {
   color: #65737e;
}
 
.container-1 input#search:-moz-placeholder { /* Firefox 18- */
   color: #65737e;  
}
 
.container-1 input#search::-moz-placeholder {  /* Firefox 19+ */
   color: #65737e;  
}
 
.container-1 input#search:-ms-input-placeholder {  
   color: #65737e;  
}

.container-1 .icon{
  position: absolute;
  top: 50%;
  margin-left: 17px;
  margin-top: 17px;
  z-index: 1;
  color: #4f5b66;
}

.container-1 input#search:hover, .container-1 input#search:focus, .container-1 input#search:active{
    outline:none;
    background: #ffffff;
  }
</style>
<script type="text/javascript" src="../resources/js/JFCore.js"></script>

<!-- Set here the key for your domain in order to hide the watermark on the web server -->
<script type="text/javascript">
	(function() {
		JC.init({
			domainKey : ''
		});
	})();
	function showHideConsultar() {
		var divId = document.getElementById("consultar");
		var currentClass = divId.className;
		if (currentClass == "noMostrar") { // si el elemento ya esta oculto
			divId.className = "mostrar"; // muestro el elemento
		} else {
			divId.className = "noMostrar"; // si el elemento NO esta ocutlo, lo oculto
		}
	}
	function showHideAlta() {
		var divId = document.getElementById("alta");
		var currentClass = divId.className;
		if (currentClass == "noMostrar") { // si el elemento ya esta oculto
			divId.className = "mostrar"; // muestro el elemento
		} else {
			divId.className = "noMostrar"; // si el elemento NO esta ocutlo, lo oculto
		}
	}
	function showHideModificar() {
		var divId = document.getElementById("modificar");
		var currentClass = divId.className;
		if (currentClass == "noMostrar") { // si el elemento ya esta oculto
			divId.className = "mostrar"; // muestro el elemento
		} else {
			divId.className = "noMostrar"; // si el elemento NO esta ocutlo, lo oculto
		}
	}
	function showHideBaja() {
		var divId = document.getElementById("baja");
		var currentClass = divId.className;
		if (currentClass == "noMostrar") { // si el elemento ya esta oculto
			divId.className = "mostrar"; // muestro el elemento
		} else {
			divId.className = "noMostrar"; // si el elemento NO esta ocutlo, lo oculto
		}
	}
</script>

</head>
<body>

<div class="container-1">
	      <span class="icon"><i class="fa fa-search"></i></span>
	      <form action="BarraBusqueda" method="GET">
	      		<input type="search"  name="search" id="search" placeholder="Search..." />
	      </form>
	  </div>
	<div class="wrap">
		<!-- tab style-1 -->
		<div class="row">
			<div class="grid_12 columns">
				<div class="tab style-1">
					<dl>
						<dd class="users">
							<a class="user active" href="#tab1"> </a>
						</dd>
						<dd class="messages">
							<a class="msg" href="#tab2"> </a>
						</dd>
						<dd class="likes">
							<a class="like" href="#tab3"> </a>
						</dd>
						<dd class="settings">
							<a class="setting" href="#tab4"> </a>
						</dd>
					</dl>
					<ul>
						<li class="active">
							<div class="top-grids">
								<table class="tablaFicha">
								<tr>
									<td>Nombre:</td>
									<td><c:out value="${persona.nombre}" /></td>
								</tr>
								<tr>
									<td>Apellido 1:</td>
									<td><c:out value="${persona.apellido1}" /></td>
								</tr>
								<tr>
									<td>Apellido 2:</td>
									<td><c:out value="${persona.apellido2}" /></td>
								</tr>
								<tr>
									<td>DNI:</td>
									<td><c:out value="${persona.dni}" /></td>
								</tr>
								<tr>
									<td>Fecha de Nacimiento:</td>
									<td><c:out value="${persona.fecha_nacimiento}" /></td>
								</tr>
								<tr>
									<td>Codigo de Empleado:</td>
									<td><c:out value="${persona.empleado.cod_empleado}" /></td>
								</tr>
								<tr>
									<td>Salario:</td>
									<td><c:out value="${persona.empleado.salario}" /></td>
								</tr>
								<tr>
									<td>Fecha de alta:</td>
									<td><c:out value="${persona.empleado.fecha_alta}" /></td>
								</tr>
								<tr>
									<td>Imagen:</td>
									<td><c:out value="${persona.empleado.imagen_empleado}" /></td>
								</tr>
								<tr>
									<td>Categoria:</td>
									<td><c:out value="${persona.empleado.categoria.nombre}" /></td>
								</tr>
								<tr>
									<td>Descripcion:</td>
									<td><c:out
											value="${persona.empleado.categoria.descripcion}" /></td>
								</tr>
								<tr>
									<td>Nombre Departamento:</td>
									<td><c:out value="${persona.empleado.departamento.nombre}" /></td>
								</tr>
								<tr>
									<td>Telefono:</td>
									<td><c:forEach var="telefono" items="${persona.telefonos}">
													${telefono.telefono}<br />
										</c:forEach></td>
								</tr>
								<tr>
									<td>Direccion:</td>
									<td>
										<c:forEach var="direccion" items="${persona.direcciones}">
												${direccion.direccion}<br/>
										</c:forEach>
									</td>
								</tr>
								<tr>
									<td>Codigo Postal:</td>
									<td>
										<c:forEach var="direccion"
											items="${persona.direcciones}">
											${direccion.cod_postal}<br/>
										</c:forEach>
									</td>
								</tr>
								<tr>
									<td>Localidad:</td>
									<td>
										<c:forEach var="direccion"
											items="${persona.direcciones}">
											${direccion.localidad}<br/>
										</c:forEach>
									</td>
								</tr>
								<tr>
									<td>Provincia:</td>
									<td>
										<c:forEach var="direccion" items="${persona.direcciones}">
											${direccion.provincia}<br/>
										</c:forEach>
									</td>
								</tr>
								<%-- <td><c:out value = "${persona.empleado.cod_empleado}"/></td>
											<td><c:out value = "${persona.empleado.salario}"/></td>
											<td><c:out value = "${persona.empleado.fecha_alta}"/></td>
											<td><c:out value = "${persona.imagen_empleado}"/></td>
											<td><c:out value = "${persona.categoria.nombre}"/></td>
											<td><c:out value = "${persona.categoria.descripcion}"/></td>
											<td><c:out value = "${persona.departamento.nombre}"/></td> --%>
								<%-- <td>${personaId.apellido1}</td>
											<td>${personaId.apellido2}</td>
											<td>${personaId.dni}</td>
											<td>${personaId.fecha_nacimiento}</td>
											<td>${personaId.empleado.cod_empleado}</td>
											<td>${personaId.empleado.salario}</td>
											<td>${personaId.empleado.fecha_alta}</td>
											<td>${persona.empleado.imagen_empleado}</td>
											<td>${personaId.empleado.categoria.nombre}</td>
											<td>${personaId.empleado.categoria.descripcion}</td>
											<td>${personaId.empleado.departamento.nombre}</td> --%>
							</table>
							</div>
							<div class="clear"></div>
						</li>
						<li>
							<div class="top-grids">
					      			<div class="top-grid1">
					      			</div>
					      			<div class="top-grid2">
						      			<a href="listaEmpleados"><h4>Listar todos los empleados<h4></h4></a>
						      			<p>Listar todos los empleados</p>
					      			</div>
					      			 <div class="top-grid1">
					      			</div>
					      			<div class="top-grid2">
						      			<a href="listaEmpleadosGroup?group=empleado.departamento.nombre"><h4>Listar por departamento<h4></h4></a>
						      			<p>Listar todos los empleados ordenado por departamento</p>
					      			</div>
					      			 <div class="top-grid1">
					      			</div>
					      			<div class="top-grid2">
						      			<a href="listaEmpleadosGroup?group=empleado.categoria.nombre"><h4>Listar por categoria<h4></h4></a>
						      			<p>Listar todos los empleados ordenado por categoria</p>
					      			</div>
					      			 <div class="top-grid1">
					      			</div>
					      			<div class="top-grid2">
						      			<a href="listaEmpleadosGroup?group=nombre"><h4>Listar por nombre<h4></h4></a>
						      			<p>Listar todos los empleados ordenado por nombre</p>
					      			</div>
					      			<div class="top-grid1">
					      			</div>
					      			<div class="top-grid2">
						      			<a href="listaEmpleadosGroup?group=empleado.cod_empleado"><h4>Listar por codigo de empleado<h4></h4></a>
						      			<p>Listar todos los empleados ordenado por codigo</p>
					      			</div>
      							</div>   		
								<div class="clear"> </div>
						</li>
						<li>
							<div class="top-grids">
								<!--
					      			<div class="top-grid1">
					      				<img src="../resources/images/f1.jpg" title="" alt="">
					      			</div>
					      			-->
					      		
								<div class="top-grid2">
									<h2>Busqueda Especial</h2><br>
					    	
					    			<form action="RecogerSelect" method="GET">
									  <select name="opc" >
									    <option >Seleccione Opcion:</option>
									    <option >Nombre Empleado</option>
									   
									 
									  </select>
									  <input type="submit" value="Selecciona">
									</form>
									  
									  <form action="RealizarConsulta" method="GET">
										  <select name="opc2">
										    <option value="0">Seleccione Opcion:</option>
										    <c:forEach var="tabla" items="${lista}">
												    	
											<option> ${tabla.nombre}</option>
								    		</c:forEach>
										   
							
										  </select>
										  <input type="submit" value="Buscar">
									  </form>
								</div>
								
							</div>
							<div class="clear"></div>
						</li>
						<li>
							<div class="settings">
								<a onclick="showHideConsultar();" href="#single.html"><h5><img src="../resources/images/arrow1.png" title="" alt="">Consultar empleado</h5></a>
								<div id="consultar" class="noMostrar">
									<table class="tablaFicha">
										<form action="consulta" method="get">
											<tr>
												<td><input type="text" class="textbox" value="DNI del empleado" name="personaDNI" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'DNI del empleado';}"></td>
												<td><input type="submit"></td>
											</tr>
										</form>
									</table>	
								</div>
								<a onclick="showHideAlta();" href="#single.html"><h5><img src="../resources/images/arrow1.png" title="" alt="">Alta empleado</h5></a>
								<div id="alta" class="noMostrar">
									<table class="tablaFicha">
										<tr>
											<td>Nombre:</td>
											<td><input type="text" class="textbox" value="Nombre" name="nombre" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Nombre';}"></td>
										</tr>
										<tr>
											<td>Apellido1:</td>
											<td><input type="text" class="textbox" value="Apellido1" name="apellido1" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Apellido1';}"></td>
										</tr>
										<tr>
											<td>Apellido2:</td>
											<td><input type="text" class="textbox" value="Apellido2" name="apellido2" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Apellido2';}"></td>
										</tr>
										<tr>
											<td>DNI:</td>
											<td><input type="text" class="textbox" value="DNI" name="dni" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'DNI';}"></td>
										</tr>
										<tr>
											<td>Fecha nacimiento:</td>
											<td><input type="text" class="textbox" value="Fecha nacimiento" name="fecha_nacimiento" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Fecha Nacimiento';}"></td>
										</tr>
										<tr>
											<td>Codigo empleado:</td>
											<td><input type="text" class="textbox" value="Codigo empleado" name="cod_empleado" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Codigo empleado';}"></td>
										</tr>
										<tr>
											<td>Salario:</td>
											<td><input type="text" class="textbox" value="Salario" name="salario" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Salario';}"></td>
										</tr>
										<tr>
											<td>Fecha alta:</td>
											<td><input type="text" class="textbox" value="Fecha alta" name="fecha_alta" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Fecha alta';}"></td>
										</tr>
										<tr>
											<td>Categoria:</td>
											<td><input type="text" class="textbox" value="Categoria" name="nombre_categoria" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Categoria';}"></td>
										</tr>
										<tr>
											<td>Descripcion:</td>
											<td><input type="text" class="textbox" value="Descripcion" name="descripcion" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Descripcion';}"></td>
										</tr>
										<tr>
											<td>Departamento:</td>
											<td><input type="text" class="textbox" value="Departamento" name="nombre_departamento" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Departamento';}"></td>
										</tr>
										<tr>
											<td>Telefono:</td>
											<td><input type="text" class="textbox" value="Telefono" name="telefono" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Telefono';}"></td>
										</tr>
										<tr>
											<td>Direccion:</td>
											<td><input type="text" class="textbox" value="Direccion" name="direccion" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Direccion';}"></td>
										</tr>
										<tr>
											<td>Codigo Postal:</td>
											<td><input type="text" class="textbox" value="Codigo Postal" name="cod_postal" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Codigo Postal';}"></td>
										</tr>
										<tr>
											<td>Localidad:</td>
											<td><input type="text" class="textbox" value="Localidad" name="localidad" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Localidad';}"></td>
										</tr>
										<tr>
											<td>Provincia:</td>
											<td><input type="text" class="textbox" value="Provincia" name="provincia" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Provincia';}"></td>
										</tr>
										<tr>
											<td>URL imagen empleado:</td>
											<td><input type="text" class="textbox" value="url Imagen" name="imagen_empleado" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Imagen';}"></td>
										</tr>
										<tr>
											<td></td>
											<td><input type="submit" value="Añadir empleado"></td>
										</tr>
									</table>	
								</div>
														             
								<a onclick="showHideModificar();" href="#single.html"><h5><img src="../resources/images/arrow1.png" title="" alt="">Modificar empleado</h5></a>
								<div id="modificar" class="noMostrar" style="background-color: aliceblue; border: 1px solid grey; border-radius: 4px 4px 0px 0px;">Div modificacion empleado</div>
								<a onclick="showHideBaja();" href="#single.html"><h5><img src="../resources/images/arrow1.png" title="" alt="" >Baja empleado</h5></a>
	    							<div id="baja" class="noMostrar">
	    								<table class="tablaFicha">
											<form action="eliminar" method="get">
												<tr>
													<td><input value="DNI del empleado" name="personaDNI" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'DNI del empleado';}"></td>
													<td><input type="submit"></td>
												</tr>
											</form>
										</table>
	    							</div>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div class="wrap">
		<!--footer
<div class="footer">
	<p>Template by <a href="#single.html">w3layouts</a></p>
</div>
    -->
		<div class="clear"></div>
	</div>
</body>
</html>