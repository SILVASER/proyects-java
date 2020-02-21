<%-- 
    Document   : bandejaEntrada
    Created on : 13/11/2017, 10:57:34 PM
    Author     : Dani
--%>

<%@page import="Controlador.controlador"%>
<%@page import="Modelo.BandejaEntrada"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    /* HttpSession sesion = request.getSession();

    if (session.getAttribute("EsActivo") == null) {
        response.sendRedirect("index.jsp");

    } else {
        String EsActivo = sesion.getAttribute("EsActivo").toString();
        if (!EsActivo.equals("1")) {
            response.sendRedirect("index.jsp");
        }

    }*/
%>

<%
    HttpSession obsession = request.getSession(false);
    String usuario = (String) obsession.getAttribute("usuario");

    String IdDestino = (String) obsession.getAttribute("IdDestino");
    String IdPersonal = (String) obsession.getAttribute("IdPersonal");

    if (usuario.equals("")) {
        response.sendRedirect("index.jsp");
    }

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <title></title>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="estilos/cssPg1.css">
        <link rel="stylesheet" href="estilos/sweetalert.css">
        <script type="text/javascript" src="js/sweetalert.min.js"></script>

    </head>
    <body onload="tablas();">
        <br>

        <div class="row">
            <div class="form-group">

                <div class="col-md-6 col-sm-0 col-xs-0">                    
                </div>

                <div class="col-md-4 col-sm-8 col-xs-8">
                    <input type="text" id="buscarTexto" name="#" onkeyup="Buscar()" placeholder="Ingrese texto a buscar..." class="form-control">
                </div>

                <div class="col-md-2 col-sm-4 col-xs-4">
                    <!--button class="btn btn-primary"><span class="glyphicon glyphicon-search"></span></button-->
                    <button id="refresh" class="btn btn-success"><span class="glyphicon glyphicon-refresh"></span></button>

                </div>


            </div>
        </div>


        <br> <div id="insertarPafinacion"></div> <br>

        <table class="table table-bordered table-hover table-responsive" id="resultado"> 
            <tr></tr>

            <%  controlador cbe = new controlador();

                ArrayList<BandejaEntrada> listaDatos = cbe.bandejaEntrada(IdDestino, IdPersonal);

                for (int i = 0; i < listaDatos.size(); i++) {
            %>
            <tr class="letra" onclick="Eliminar()">
                <%
                    BandejaEntrada b = (BandejaEntrada) listaDatos.get(i);

                    out.println("<td>" + b.getOrigenc() + "</td>");
                    out.println("<td>" + b.getAsunto() + "</td>");
                    out.println("<td class='getF'>" + b.getFechat() + "</td>");
                %>
            </tr>
            <tr onclick="Eliminar()">
                <%
                        out.println("<td class='getPC'>" + b.getPersonal() + "</td>");
                        out.println("<td class='getPC'>" + b.getComentario() + "</td>");
                        out.println("<td class='letra getV'>" + b.getVencimiento() + "</td>");
                    }
                %>
            </tr>
        </table> 

        <div class="container"> 
            <label class="nombreUsuaio"> TOTAL: <label id="contenido"></label> EXPEDIENTES</label>
        </div>

        <script type="text/javascript" src="bootstrap/js/jquery.js"></script>
        <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="bootstrap/js/jquery.min.js"></script>

        <script type="text/javascript" src="js/jspg1.js"></script>

        <script type="text/javascript">
                var paginacion = new Pager('resultado', 10);
                paginacion.init();
                paginacion.showPageNav('paginacion', 'insertarPafinacion');
                paginacion.showPage(1);
        </script> 

        <script type="text/javascript">
            function tablas() {

                var cont = document.getElementById("resultado").rows.length;
                contador = cont - 1;
                document.getElementById("contenido").innerHTML = contador;
            }
        </script> 

        <script type="text/javascript">
            $(document).ready(function () {
                $('#refresh').click(function () {
                    // Recargo la página
                    location.reload();
                });
            });
        </script>

        <script type="text/javascript">

            function Eliminar() {

                swal({
                    title: "¿Estás seguro?",
                    text: "¡No podrás recuperar este archivo!",
                    type: "warning",
                    showCancelButton: true,
                    confirmButtonColor: "#DD6B55",
                    confirmButtonText: "Aceptar",
                    closeOnConfirm: false
                },
                        function () {
                            swal("Eliminado!", "Tu archivo ha sido eliminado.", "success");
                        });


            }
        </script>

    </body>
</html>
