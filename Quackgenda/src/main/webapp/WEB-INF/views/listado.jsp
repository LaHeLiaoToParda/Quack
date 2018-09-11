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
			    				    <!-- <div class="form">		
								        <input type="text" class="active textbox" value="Nombre" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Nombre';}">
										<input type="text" class="textbox" value="Apellidos" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Apellido';}">
										<input type="text" class="textbox" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}">
										
										<input type="submit" value="Añadir empleado">
							        </div> -->
							</li>
    						<li><div class="top-grids">
					      			<div class="top-grid1">
					      				<img src="../resources/images/f1.jpg" title="" alt="">
					      			</div>
					      			<div class="top-grid2">
						      			<a href="#single.html"><h4>Listar todos los empleados<h4></h4></a>
						      			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt</p>
					      			</div>
					      			 <div class="top-grid1">
					      				<img src="../resources/images/f2.jpg" title="" alt="">
					      			</div>
					      			<div class="top-grid2">
						      			<a href="#single.html"><h4>Listar por departamento<h4></h4></a>
						      			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt</p>
					      			</div>
					      			 <div class="top-grid1">
					      				<img src="../resources/images/f3.jpg" title="" alt="">
					      			</div>
					      			<div class="top-grid2">
						      			<a href="#single.html"><h4>Listar por categoria<h4></h4></a>
						      			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt</p>
					      			</div>
					      			 <div class="top-grid1">
					      				<img src="../resources/images/f4.jpg" title="" alt="">
					      			</div>
					      			<div class="top-grid2">
						      			<a href="#single.html"><h4>Listar por nombre<h4></h4></a>
						      			<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt</p>
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
    							        <div id="consultar" class="noMostrar" style="background-color: aliceblue; border: 1px solid grey; border-radius: 4px 4px 0px 0px;">div que se despliega al pulsar consultar empleado.</div>
	    							<a onclick="showHideAlta();" href="#single.html"><h5><img src="../resources/images/arrow1.png" title="" alt="">Alta empleado</h5></a>
	    							    <div id="alta" class="noMostrar" style="background-color: aliceblue; border: 1px solid grey; border-radius: 4px 4px 0px 0px;">
	    							        <div class="form">		
								                <input style="width: 80%" type="text" class="active textbox" value="Nombre" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Nombre';}">
										        <input style="width: 80%" type="text" class="textbox" value="Apellidos" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Apellido';}">
										        <input style="width: 80%" type="text" class="textbox" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}">
										
										        <input style="width: 80%" type="submit" value="Añadir empleado">
							                </div>
	    							    </div>
	    							<a onclick="showHideModificar();" href="#single.html"><h5><img src="../resources/images/arrow1.png" title="" alt="">Modificar empleado</h5></a>
	    							    <div id="modificar" class="noMostrar" style="background-color: aliceblue; border: 1px solid grey; border-radius: 4px 4px 0px 0px;">consultar</div>
	    							<a onclick="showHideBaja();" href="#single.html"><h5><img src="../resources/images/arrow1.png" title="" alt="">Baja empleado</h5></a>
	    							    <div id="baja" class="noMostrar" style="background-color: aliceblue; border: 1px solid grey; border-radius: 4px 4px 0px 0px;">baja</div>
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