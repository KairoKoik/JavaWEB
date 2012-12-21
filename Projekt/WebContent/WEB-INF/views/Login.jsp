<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<div style="border:1px solid grey; width:160px; margin-left:auto;margin-right:auto;margin-top:250px;">
 <FORM ACTION="out.jsp" METHOD="POST" style="margin-bottom: 5px;">
    <table width="150" border="0" cellspacing="0" cellpadding="0" style="margin-left:auto; margin-right:auto;  ">
  <tr>
    <td>Nimi: <br />
    <INPUT TYPE="TEXT" NAME="Nimi"></td>
  </tr>
  <tr>
    <td>Parool: <br />
    <INPUT TYPE="TEXT" NAME="Parool"></td>
  </tr>
  <tr>
    <td><input name="Sisene" type="button" value="Sisene" class="buttons" style="float:left;" >
    <input name="Tühista" type="button" value="Tühista" class="buttons" style="float:right;">
</td>
  </tr>

</table>
 </FORM>
</div>

</body>
</html>