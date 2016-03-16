<!--
  To change this template, choose Tools | Templates
  and open the template in the editor.
-->
<html>
    <head>
        <meta name="layout" content="main"/>    
        <title>RocheSALM</title>
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
                        <a class="navbar-brand" href="#">RocheSALM</a>
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
        </header>
        <div id="content">
            <div>
                <g:if test="${flash.message}">
                    <div class="message" role="status">${flash.message}</div>
                </g:if>
                <g:if test="${params.error=="true"}">
                    <br>
                    <div style="text-align: center;"><span class="errors">Contraseña incorrecta</span></div>
                </g:if>        
            </div>
        </div>
                    <div id="footer" class="navbar-fixed-bottom">         	
            <p>&copy; 2016</p>
        </div>
    </body>
</html>