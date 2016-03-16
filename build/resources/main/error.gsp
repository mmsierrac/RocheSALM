<!doctype html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <title><g:if env="development">RocheSALM Grails Runtime Exception</g:if><g:else>Error</g:else></title>
        <g:if env="development"><asset:stylesheet src="errors.css"/></g:if>
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
        <g:if env="development">
            <g:if test="${Throwable.isInstance(exception)}">
                <g:renderException exception="${exception}" />
            </g:if>
            <g:elseif test="${request.getAttribute('javax.servlet.error.exception')}">
                <g:renderException exception="${request.getAttribute('javax.servlet.error.exception')}" />
            </g:elseif>
            <g:else>
                <ul class="errors">
                    <li>An error has occurred</li>
                    <li>Exception: ${exception}</li>
                    <li>Message: ${message}</li>
                    <li>Path: ${path}</li>
                </ul>
            </g:else>
        </g:if>
        <g:else>
            <ul class="errors">
                <li>An error has occurred</li>
            </ul>
        </g:else>
    </body>
</html>
