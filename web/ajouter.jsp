<%-- 
    Document   : ajouter
    Created on : 11 mars 2018, 21:13:58
    Author     : SAMSUNG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <fieldset>
            <legend>
                Ajouter Produit
            </legend>
            <form action="AjouterProduit" method="POST" enctype="multipart/form-data">
                <table>
                    <tr>
                        <td>Libelle :</td>
                        <td><input type="text" name="libelle"></td>
                    </tr>
                    <tr>
                        <td>Prix :</td>
                        <td>
                            <input type="number" name="prix">
                        </td>
                    </tr>
                    <tr>
                        <td>Image :</td>
                        <td><input type="file" name="img"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Ajouter"></td>
                    </tr>
                </table>
            </form>
        </fieldset>

    </body>
</html>
