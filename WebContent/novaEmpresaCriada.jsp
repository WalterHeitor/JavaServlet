<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

	<%
	String nomeEmpresa = (String) request.getAttribute("empresa");
	System.out.println(nomeEmpresa);
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
1 = Empresa "<%out.println(nomeEmpresa);%>" cadastrada com Sucesso!!!
2 = Empresa "<%=nomeEmpresa%>" cadastrada com Sucesso!!!
</body>
</html>