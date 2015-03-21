<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Create Ship</title>
</head>

<body>

<h1>Create Ship</h1>

<g:if test="${flash.message}">
	<h2>${flash.message}</h2>
</g:if>
<g:if test="${ship.hasErrors()}">

	<g:renderErrors bean="${ship}"/>

	<h3>Error codes</h3>
	<bsg:showErrorCodes bean="${ship}"/>
</g:if>


<form action="saveShip">
	<fieldset>
		<f:all bean="${ship}"/>
		<g:submitButton name="Save">Save</g:submitButton>
	</fieldset>

</form>

</body>
</html>