<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <H1>Piiripunkt</H1>
        <FORM ACTION="out.jsp" METHOD="POST">
            Piiripunkti nimi:
            <INPUT TYPE="TEXT" NAME="nimi">
            <BR>
             Piiripunkti aadress:
            <INPUT TYPE="TEXT" NAME="aadress">
            <BR>
             Piirivalvurite hulk:
            <INPUT TYPE="TEXT" NAME="arv">
            <BR>
            <INPUT TYPE="SUBMIT" value="Submit">
        </FORM>
        
</body>
</html>