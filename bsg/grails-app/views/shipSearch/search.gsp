<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Search</title>
</head>

<body>

<g:each in="${ships}" var="ship">
	<p>${ship.name}</p>
	<g:isMilitary ship="${ship}">
		<p>This is a military ship!</p>
	</g:isMilitary>
</g:each>


</body>
</html>