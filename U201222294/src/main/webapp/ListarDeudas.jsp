<%-- 
    Document   : ListarDeudas
    Created on : 06/10/2013, 10:33:56 PM
    Author     : jose_cerna
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
 
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="Estilos/Estilos.css" />
    </head>
    <body>

        <div name="page" class="page">
            <form:form commandName="frmdeudas">
                <table border="0" align="center">
                    <tr>
                        <td>&nbsp;</td>
                        <td><label><h1>Lista de Deudas</h1></label></td>
                        <td>&nbsp;</td>
                    </tr>
                </table>
                <table id ="busqueda" border="0" align="center">
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><label>RUC   </label></td>
                        <td><input name="txtRuc" type="text" maxlength="11" width="120px"></td>
                        <td style=" text-align: right"><input type="submit" value="Buscar" name="btnBuscar" class="stlbutton"> </td>
                    </tr>
                    <tr><td></td><td></td><td></td><td></td></tr>
                </table>
                <table border="0" align="center">
                    <tr>
                        <td style="border:1px solid #000;font-weight: bold;padding:10px;">IdDeuda</td>
                        <td style="border:1px solid #000;font-weight: bold;padding:10px;">Ruc</td>
                        <td style="border:1px solid #000;font-weight: bold;padding:10px;">Concepto</td>
                        <td style="border:1px solid #000;font-weight: bold;padding:10px;">Periodo</td>
                        <td style="border:1px solid #000;font-weight: bold;padding:10px;">Resolución</td>
                        <td style="border:1px solid #000;font-weight: bold;padding:10px;">CodTributario</td>
                        <td style="border:1px solid #000;font-weight: bold;padding:10px;">Importe</td>
                    </tr>
                    <c:forEach var="product" items="${deuda}">
                        <tr>
                            <td><c:out value="${deuda.idDeuda}"/></td>
                            <td><c:out value="${deuda.idDeuda}"/></td>
                            <td><c:out value="${deuda.idDeuda}"/></td>
                            <td><c:out value="${deuda.idDeuda}"/></td>
                            <td><c:out value="${deuda.idDeuda}"/></td>
                            <td><c:out value="${deuda.idDeuda}"/></td>
                            <td><c:out value="${deuda.idDeuda}"/></td>
                        </tr>

                    </c:forEach>	
                </table>
            </form:form>		
        </div>


    </body>
</html>
