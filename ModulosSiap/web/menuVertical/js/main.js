$(document).ready(function () {

    // ------------- MOSTRANDO Y OCULTANDO MENU ---------------
    $('#button-menu').click(function () {
        if ($('#button-menu').attr('class') == 'fa fa-bars') {

            $('.navegacion').css({'width': '100%'}); // MOSTRAMOS EL FONDO TRANSPARENTE
            $('#button-menu').removeClass('fa fa-bars').addClass('fa fa-close'); //AGREGAMOS EL ICONO X
            $('.navegacion .menu').css({'left': '0px'}); //MOSTRAMOS EL MENU

        } else {

            $('.navegacion').css({'width': '0%', 'background': 'rgba(0,0,0,.0)'}); // OCULTAMOS EL FONDO TRANSPARENTE
            $('#button-menu').removeClass('fa fa-close').addClass('fa fa-bars'); // AGREGAMOS EL INCONO MENU
            $('.navegacion .submenu').css({'left': '-320px'}); // OCULTAMOS LOS SUBMENUSS
            $('.navegacion .menu').css({'left': '-320px'}); // OCULTAMOS EL MENU

        }
    });

    // -------------- MOSTRANDO SUBMENU --------------------
    $('.navegacion .menu > .item-submenu a').click(function () {

        var positionMenu = $(this).parent().attr('menu'); // / BUSCAMOS EL VALOR DEL ATRIBUTO MENU Y LO GUARDAMOS EN UNA VARIABLE
        console.log(positionMenu);

        $('.item-submenu[menu=' + positionMenu + '] .submenu').css({'left': '0px'}); // MOSTRAMOS EL SUBMENU CORRESPONDIENTE

    });

    // OCULTANDO EL SUBMENU
    $('.navegacion .submenu li.regresar').click(function () {

        $(this).parent().css({'left': '-320px'}); // OCULTAMOS EL SUBMEN

    });

});



$(document).ready(function () {

    $('#menu1').click(function () {

        $('#contenedor').attr('src', 'bandejaEntrada.jsp');
    });

    $('#menu2').click(function () {
        
        $('#contenedor').attr('src', 'bandejaSalida.jsp');
    });

    $('#menu3').click(function () {
        $('#contenedor').attr('src', 'bandejaArchivos.jsp');
    });

    $('#menu4').click(function () {
        $('#contenedor').attr('src', 'pagina-1.jsp');
    });

});

/*function cargar1() {
 
 var url = "bandejaEntrada.jsp"
 $.ajax({
 type: "POST",
 url: url,
 data: {},
 success: function (datos1) {
 $('#contenedor').html(datos1);
 }
 });
 }
 
 function cargar2() {
 
 var url = "bandejaSalida.jsp"
 $.ajax({
 type: "POST",
 url: url,
 data: {},
 success: function (datos2) {
 $('#contenedor').html(datos2);
 }
 });
 }
 
 function cargar3() {
 
 var url = "bandejaArchivos.jsp"
 $.ajax({
 type: "POST",
 url: url,
 data: {},
 success: function (datos3) {
 $('#contenedor').html(datos3);
 }
 });
 }
 
 function cargar4() {
 
 var url = "pagina-1.jsp"
 $.ajax({
 type: "POST",
 url: url,
 data: {},
 success: function (datos4) {
 $('#contenedor').html(datos4);
 }
 });
 }
 
 $(function () {
 var url = "bandejaEntrada.jsp"
 $("#contenedor").load(url);
 });*/






















