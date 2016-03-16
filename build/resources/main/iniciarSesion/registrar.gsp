<!--
  To change this template, choose Tools | Templates
  and open the template in the editor.
-->
<html>
    <head>
        <meta name="layout" content="main"/>    
        <title>ProKids</title>
    </head>
    <body>       
        <header>
            <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="#">PROKIDS</a>
                    </div>
                    <div class="navbar-collapse collapse">

                        <g:form action="IniciarSesion" controller="IniciarSesion" style="text-align: center;" method="post" class="navbar-form navbar-right" role="form">  
                            <div style="text-align: center;display: inline-block">
                                <div class="form-group">
                                    <g:textField class="form-control" name="email" pattern="[a-zA-Z0-9-_]+[@]+[a-zA-Z]+[.]+[a-zA-Z.]+" placeholder="Correo electrónico" required="" value="${email}" oninvalid="setCustomValidity('Por favor ingresa con un correo electronico valido')" oninput="setCustomValidity('')"/>
                                </div>
                                <div class="form-group">
                                    <g:passwordField class="form-control" name="password"   placeholder="Contraseña" required="" value="${password}"/>
                                </div>
                                <form class="navbar-form navbar-right" role="form">

                                    <g:submitButton type="submit" class="btn btn-success save" name="create" value="Log In"/>           
                                </form> 
                            </div>
                        </g:form>          
                    </div><!--/.navbar-collapse -->
                    <br>
                </div>
            </div>

            </br></br>
            <div class="container" id="menu"><!--Cambiar links de navegación menu -->
                <ul class="nav navbar-nav">
                    <li><a class="home" href="${createLink(uri: '/iniciarSesion/logScreen')}"><g:message code="default.home.label"/></a></li>
                    <li id = "active"><g:link action="registrar" controller="IniciarSesion">Registrarse</g:link></li><!--Cambiar link -->
                    </ul>

            </div>
        </header>
        <div id="content">
            <br>
            <div id="left-contentR">
                <h1>Busca un servicio</h1>
                <g:form action="create" controller="Padre" style="text-align: center;" method="post" class="navbar-form navbar-right" role="form"> 
                    <g:submitButton type="submit" class="btn btn-success btn-lg" name="registrarPadre" value="Registrarme como Padre"/>           
                </g:form> 
            </div>
            <br><br><br><br>
            <div id="right-contentR">
                <br>
                <h1>Busca empleo</h1>
                <g:form action="create" controller="Cuidador" style="text-align: center;" method="post" class="navbar-form navbar-right" role="form"> 
                    <g:submitButton type="submit" class="btn btn-success btn-lg" name="registrarCuidador" value="Registrarme como Cuidador"/>           
                </g:form>
            </div>

            <div id="footer">            	
                <p>&copy; 2014</p>
                <div class="clear"></div>
            </div>
        </footer>
</body>
</html>