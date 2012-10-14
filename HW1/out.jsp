<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Output</title>
</head>
<body>

<table id="tabel" width="200" border="1">
  <tr>
    <td colspan="2"><b>Piiripunkti info</b></td>
  </tr>
  <tr>
    <td>Piiripunkti nimi:</td>
    <td><% out.println(request.getParameter("nimi")); %></td>
  </tr>
  <tr>
    <td>Piiripunkti aadress:</td>
    <td><% out.println(request.getParameter("aadress")); %></td>
  </tr>
  <tr>
    <td>Piirivalvurite hulk:</td>
    <td><% out.println(request.getParameter("arv")); %></td>
  </tr>
</table>
</body>
</html>