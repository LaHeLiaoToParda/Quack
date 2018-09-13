<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
<title>Quackgenda</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="../resources/css/style.css" />
<script type="text/javascript" src="../resources/js/JFCore.js"></script>
		
			
		
		
		<!-- Set here the key for your domain in order to hide the watermark on the web server -->
		<script type="text/javascript">
			(function() {
				JC.init({
					domainKey: ''
				});
				})();
			function showHideConsultar(){
			    var divId = document.getElementById("consultar");
			    var currentClass = divId.className;
			    if (currentClass == "noMostrar") { // si el elemento ya esta oculto
			        divId.className = "mostrar";   // muestro el elemento
			    } else {
			        divId.className = "noMostrar";  // si el elemento NO esta ocutlo, lo oculto
			    }
			}
			function showHideAlta(){
			    var divId = document.getElementById("alta");
			    var currentClass = divId.className;
			    if (currentClass == "noMostrar") { // si el elemento ya esta oculto
			        divId.className = "mostrar";   // muestro el elemento
			    } else {
			        divId.className = "noMostrar";  // si el elemento NO esta ocutlo, lo oculto
			    }
			}
			function showHideModificar(){
			    var divId = document.getElementById("modificar");
			    var currentClass = divId.className;
			    if (currentClass == "noMostrar") { // si el elemento ya esta oculto
			        divId.className = "mostrar";   // muestro el elemento
			    } else {
			        divId.className = "noMostrar";  // si el elemento NO esta ocutlo, lo oculto
			    }
			}
			function showHideBaja(){
			    var divId = document.getElementById("baja");
			    var currentClass = divId.className;
			    if (currentClass == "noMostrar") { // si el elemento ya esta oculto
			        divId.className = "mostrar";   // muestro el elemento
			    } else {
			        divId.className = "noMostrar";  // si el elemento NO esta ocutlo, lo oculto
			    }
			}
		</script>

</head>
<body>
<div class="wrap">
<!-- tab style-1 -->
<div class="row">
	<div class="grid_12 columns">
		<div class="tab style-1">
    					<dl>
                            <dd class="users"><a class="user active" href="#tab1" > </a></dd>
    				        <dd class="messages"><a class="msg" href="#tab2"> </a></dd>
    						<dd class="likes"><a class="like" href="#tab3"> </a></dd>
    						<dd class="settings"><a class="setting" href="#tab4"> </a></dd>
    					</dl>
    					<ul>
    						<li class="active">
    							<div class="top-grids">
    								<div class="tituloListado">Listado de Empleados</div><br/>
    								<c:forEach var="p" items="${lista}">
    									<div class="top-grid2">
    										<a href="fichaTecnica?personaId=${p.id_persona}"><h4>${p.nombre}   -   ${p.apellido1}   -   ${p.empleado.cod_empleado}</h4>
    										<p>Dpto: ${p.empleado.departamento.nombre} &nbsp;&nbsp; - &nbsp;&nbsp; Categ: ${p.empleado.categoria.nombre} </p>
    										</a>
    									</div>
							    	</c:forEach>	
							    </div>
							    <div class="clear"> </div>
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
						      			<a href="#single.html"><h4>Búsqueda por ciudad<h4></h4></a>
						      			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt</p>
					      			</div>
					      			 <!--
					      			 <div class="top-grid1">
					      				<img src="../resources/images/f2.jpg" title="" alt="">
					      			</div>
					      			-->
					      			<div class="top-grid2">
						      			<a href="#single.html"><h4>Búsqueda por código postal<h4></h4></a>
						      			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt</p>
					      			</div>
					      			<!--
					      			 <div class="top-grid1">
					      				<img src="../resources/images/f3.jpg" title="" alt="">
					      			</div>
					      			-->
					      			<div class="top-grid2">
						      			<a href="#single.html"><h4>Búsqueda por telefono<h4></h4></a>
						      			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt</p>
					      			</div>
					      			<!--
					      			 <div class="top-grid1">
					      				<img src="../resources/images/f4.jpg" title="" alt="">
					      			</div>
					      			-->
					      			<div class="top-grid2">
						      			<a href="#single.html"><h4>Búsqueda por categoría<h4></h4></a>
						      			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt</p>
					      			</div>
					      			<!--
					      			<div class="top-grid1">
					      				<img src="../resources/images/f1.jpg" title="" alt="">
					      			</div>
					      			-->
					      			<div class="top-grid2">
						      			<a href="#single.html"><h4>Búsqueda por departamento<h4></h4></a>
						      			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt</p>
					      			</div>
					      		</div>    		
								<div class="clear"> </div>
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
<div class="clear"> </div>
</div>
    </body>
</html>