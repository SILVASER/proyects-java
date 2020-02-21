<%-- 
    Document   : index
    Created on : 23/10/2017, 08:27:00 PM
    Author     : Dani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Municipalidad de Sullana</title>
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0,
              maximum-scale=1.0, minimum-scale=1.0">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="estilos/cssLogin.css">

        <script type="text/javascript" src="menuVertical/js/jquery-3.2.1.js"></script>
        <script type="text/javascript" src="menuVertical/js/main.js"></script>
    </head>

    <body>

        <div class="container">
            <div class="card card-container">

                <img id="profile-img" class="profile-img-card" src="imagen/usuarios.png" />

                <p id="profile-name" class="profile-name-card"></p>

                <form class="form-signin" method="POST" id="form1" name="form1" action="servLogin">

                    <span id="reauth-email" class="reauth-email"></span>

                    <input type="text" name="usuario" id="inputEmail" class="form-control" placeholder="Nombre de usuario" required autofocus>

                    <input type="password" name="password" id="inputPassword" class="form-control" placeholder="Contraseña" required>

                    <div id="remember" class="checkbox">
                        <label>
                            <input type="checkbox" value="remember-me"> Recordar contraseña
                        </label>
                    </div>

                    <button  type="submit" id="menu1" name="" class="btn btn-lg btn-primary btn-block btn-signin">Iniciar sesión</button>
                </form>

                <a href="#" class="forgot-password">
                    Olvidaste la contraseña?
                </a>

            </div>
        </div>

        <!--verificamos si el usuario que ingreso el nivel 1 o 2-->

        <%
            /* HttpSession sesion = request.getSession();//para ver si sesiones activas  y con esta linea recuperamos sesiones activas
            int EsActivo = 0;
            if (request.getAttribute("EsActivo") != null) {
                //recuperamos atributos
                EsActivo = (Integer) request.getAttribute("EsActivo");

                if (EsActivo == 1) {
                    //si es true creamos sesiones
                    sesion.setAttribute("usuario", request.getAttribute("usuario"));
                    sesion.setAttribute("EsActivo", EsActivo);

                    response.sendRedirect("ventana.jsp");

                }

            }

            if (request.getParameter("cerrar") != null) {
                session.invalidate();
            }
             */
        %>

        <script type="text/javascript" src="menuVertical/js/jquery-3.2.1.js"></script>
        <script type="text/javascript" src="menuVertical/js/main.js"></script>

        <script src="bootstrap/js/jquery.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>

    </body>
</html>
