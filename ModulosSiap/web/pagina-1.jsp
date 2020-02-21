<%-- 
    Document   : page-1
    Created on : 08/11/2017, 10:38:31 PM
    Author     : Dani
--%>

<%@page import="Controlador.controlador"%>
<%@page import="Modelo.BandejaEntrada"%>
<%@page import="java.util.ArrayList"%>

<%@page import="java.util.List"%>
<%@page import="Modelo.Roles"%>
<%@page import="Controlador.controlador"%>
<%@page import="Controlador.Accesos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
    </head>
    <body>



        <table border="1" width="100%" align="center" cellpadding="10px" class="letra"> 
            <tr></tr>



            <% 
                controlador cbe = new controlador();

                ArrayList<BandejaEntrada> listaDatos = cbe.bandejaEntrada(IdDestino, IdPersonal);
                for (int i = 0; i < listaDatos.size(); i++) {
            %>
            <tr class="">
                <%
                    BandejaEntrada b = (BandejaEntrada) listaDatos.get(i);

                    out.println("<td>" + b.getOrigenc() + "</td>");
                    out.println("<td>" + b.getAsunto() + "</td>");
                    out.println("<td>" + b.getFechat() + "</td>");
                %>
            </tr>
            <tr >
                <%
                        out.println("<td class=''>" + b.getPersonal() + "</td>");
                        out.println("<td class=''>" + b.getComentario() + "</td>");
                        out.println("<td class=''>" + b.getVencimiento() + "</td>");
                    }
                %>
            </tr>


        </tr>
    </table> 


    <script type="text/javascript" src="bootstrap/js/jquery.js"></script>
    <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="bootstrap/js/jquery.min.js"></script>

</body> 
</html>
