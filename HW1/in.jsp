<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Piirivalvuri vorm</title>
</head>
<body>

 <H1>Piiripunkt</H1>
       <FORM ACTION="out.jsp" METHOD="POST">
      <table width="200" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td> Sõduri kood:
            <INPUT TYPE="TEXT" NAME="Sodurikood"></td>
    <td> E-mail:
            <INPUT TYPE="TEXT" NAME="E-mail"> </td>
  </tr>
  <tr>
    <td> Isikukood:
            <INPUT TYPE="TEXT" NAME="Isikukood"></td>
    <td>Telefon:
            <INPUT TYPE="TEXT" NAME="Telefon">   
   </td>
  </tr>
  <tr>
    <td>Eesnimi:
            <INPUT TYPE="TEXT" NAME="Eesnimi"></td>
    <td>Aadress:
            <INPUT TYPE="TEXT" NAME="Aadress"> </td>
  </tr>
  <tr>
    <td>Perekonnanimi:
            <INPUT TYPE="TEXT" NAME="Perekonnanimi"></td>
    <td>Kommentaar:
             <textarea name="" cols="" rows="" ></textarea></td>
  </tr>
  <tr>
    <td>Sugu:
            <select name="Sugu:">naine,mees</select></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td><input name="Salvesta" type="button" value="Salvesta"></td>
    <td> <input name="Katkesta" type="button" value="Katkesta">
    <input name="Kustuta" type="button" value="Kustuta">
    </td>
  </tr>
</table>
 </FORM>

    
</body>
</html>




