<%-- 
    Document   : login
    Created on : 24/10/2017, 09:03:45 AM
    Author     : Dani
--%>

<%@page import="Modelo.UsuariosValidar"%>
<%@page import="Controlador.Accesos"%>
<%@page import="Modelo.Menu"%>
<%@page import="Modelo.Roles"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Dependencias"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>

<%
    /* HttpSession sesion = request.getSession();

    if (session.getAttribute("EsActivo") == null) {
        response.sendRedirect("index.jsp");

    } else {
        String EsActivo = sesion.getAttribute("EsActivo").toString();
        if (!EsActivo.equals("1")) {
            response.sendRedirect("index.jsp");
        }

    }
     */
%> 

<%
    HttpSession obsession = request.getSession(false);
    String usuario = (String) obsession.getAttribute("usuario");

    String IdDestino = (String) obsession.getAttribute("IdDestino");
    String IdPersonal = (String) obsession.getAttribute("IdPersonal");
    String Nombres = (String) obsession.getAttribute("Nombres");

    if (usuario.equals("")) {
        response.sendRedirect("index.jsp");
    }

%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <title>Municipalidad de Sullana</title>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="menuVertical/css/estilos.css">
        <link rel="stylesheet" href="menuVertical/css/font-awesome.css">
    </head>

    <body>

        <div class="col-xs-12 col-md-12">
            <header>
                <span id="button-menu" class="fa fa-bars"></span>

                <!--============== MENU LEFT ===================-->

                <a href="#" class="separador hidden-xs hidden-sm dropdown-toggle" data-toggle="dropdown">
                    <strong style="color: #fff" class="nombreUsuaio">  <%=obsession.getAttribute("Nombres")%></strong>
                    <span style="color: #fff" class=" glyphicon glyphicon-user icon-size1"></span> 
                    <span style="color: #fff" class="glyphicon glyphicon-chevron-down"></span>
                </a>

                <ul class="menu-cerrar dropdown-menu">
                    <li>
                        <div class="navbar-login">
                            <div class="row">
                                <div class="col-lg-4">
                                    <p class="text-center">
                                        <span class="glyphicon glyphicon-user icon-size2"></span>
                                    </p>
                                </div>
                                <div class="col-lg-8">
                                    <p class="text-left"><strong class="nombreUsuaio"><%=obsession.getAttribute("Nombres")%></strong></p>
                                    <p class="text-left small">correoElectronico@email.com</p>
                                    <p class="text-left">
                                        <a href="#" class="btn btn-success btn-block btn-sm">Actualizar Datos</a>
                                    </p>
                                </div>
                            </div>
                        </div>
                    </li>

                    <li class="divider"></li>
                    <li>
                        <div class="navbar-login navbar-login-session">
                            <div class="row">
                                <div class="col-lg-12">
                                    <p>
                                        <a href="index.jsp?cerrar=true" class="btn btn-danger btn-block">Cerrar Sesion</a>
                                    </p>
                                </div>
                            </div>
                        </div>
                    </li>

                </ul>

                <!--=============== MENU RIGHT =========================-->

                <nav class="navegacion">
                    <ul class="menu">
                        <!-- TITULO -->
                        <li class="title-menu">Bandeja de Expedientes</li>
                        <!-- TITULO -->

                        <li><a id="menu1"  href="#" ><span class="fa fa-paper-plane icon-menu"></span>Bandeja de Entrada</a></li>

                        <li> <!--class="item-submenu" menu="1"-->
                            <a id="menu2"  href="#"><span class="fa fa-outdent icon-menu"></span>Bandeja de Salida</a>

                            <!--ul class="submenu">
                                <li class="title-menu"><span class="fa fa-user icon-menu"></span>MENU-2</li>
                                <li class="regresar">ATRAS</li>

                                <li><a href="#">MENU-2.1</a></li>
                                <li><a href="#">MENU-2.2</a></li>
                                <li><a href="#">MENU-2.3</a></li>
                            </ul-->
                        </li>

                        <li><!-- class="item-submenu" menu="2"-->
                            <a id="menu3" href="#"><span class="fa fa-file-text icon-menu"></span>Bandeja de Archivos</a>
                            <!--ul class="submenu">
                                <li class="title-menu"><span class="fa fa-paypal icon-menu"></span>MENU-3</li>
                                <li class="regresar">Atras</li>

                                <li><a href="#">MENU-3.1</a></li>
                                <li><a href="#">MENU-3.2</a></li>
                                <li><a href="#">MENU-3.3</a></li>
                            </ul-->
                        </li>


                        <li><!-- class="item-submenu" menu="3"-->
                            <a id="menu4" href="#"><span class="fa fa-envelope icon-menu"></span>pagina-1</a>
                            <!--ul class="submenu">
                                <li class="title-menu"><span class="fa fa-envelope icon-menu"></span>MENU-4</li>
                                <li class="regresar">Atras</li>

                                <li><a href="#">MENU-4.1</a></li>
                                <li><a href="#">MENU-4.2</a></li>
                                <li><a href="#">MENU-4.3</a></li>
                            </ul-->
                        </li>

                        <li class="item-submenu" menu="4">
                            <a href="#"><span class="fa fa-paper-plane icon-menu"></span> Menu-5</a>
                            <ul class="submenu">
                                <li class="title-menu"><span class="fa fa-plane icon-menu"></span>Menu-5</li>
                                <li class="regresar">Atras</li>

                                <li><a href="#">Menu-5.1</a></li>
                                <li><a href="#">Menu-5.2</a></li>
                                <li><a href="#">Menu-5.3</a></li>
                            </ul>
                        </li>

                        <li><a href="index.jsp?cerrar=true"><span class="fa fa-cog icon-menu"></span> Cerrar Session</a></li>

                    </ul>
                </nav>
            </header>
        </div>
        <!--=============== CONTENEDOR DE PAGINAS ==============-->
        <iframe  src="bandejaEntrada.jsp" id="contenedor"  class="cuerpo col-xs-12 col-md-12 col-lg-12"> </iframe>
       

        <!--div id="contenedor" class="cuerpo col-xs-12 col-md-12 col-lg-12">     </div-->

        <footer>       </footer>

        <script type="text/javascript" src="menuVertical/js/jquery-3.2.1.js"></script>
        <script type="text/javascript" src="menuVertical/js/main.js"></script>

        <script type="text/javascript" src="bootstrap/js/jquery.js"></script>
        <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="bootstrap/js/jquery.min.js"></script>


        <script type="text/javascript">

          /*  function cargar1() {

                var url = "bandejaEntrada.jsp"
                $.ajax({
                    type: "POST",
                    url: url,
                    data: {},
                    success: function (datos) {
                        $('#contenedor').html(datos);
                    }
                });
            }

            function cargar2() {

                var url = "bandejaSalida.jsp"
                $.ajax({
                    type: "POST",
                    url: url,
                    data: {},
                    success: function (datos) {
                        $('#contenedor').html(datos);
                    }
                });
            }

            function cargar3() {

                var url = "bandejaArchivos.jsp"
                $.ajax({
                    type: "POST",
                    url: url,
                    data: {},
                    success: function (datos) {
                        $('#contenedor').html(datos);
                    }
                });
            }

            function cargar4() {

                var url = "pagina-1.jsp"
                $.ajax({
                    type: "POST",
                    url: url,
                    data: {},
                    success: function (datos) {
                        $('#contenedor').html(datos);
                    }
                });
            }

            $(function () {
                var url = "bandejaEntrada.jsp"
                $("#contenedor").load(url);
            });
            */
        </script>

    </body>
</html>
