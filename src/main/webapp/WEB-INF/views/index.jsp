<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Bienvenue dans l'application de démo d'accès à l'API du
		hackathon.</h1>

	<h2>Liste des articles de l'API :</h2>
	<ul>
		<c:forEach items="${ list }" var="a">
			<li>${ a.title }</li>
		</c:forEach>
	</ul>
</body>
</html>