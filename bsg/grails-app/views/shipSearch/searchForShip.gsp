<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Search for Ship</title>
	<meta name="layout" content="ship" />
</head>
<body>

	<g:renderErrors bean="${searchInputCommand}"/>


	<g:form controller="shipSearch" action="search">
		<label for="shipname">Shipname</label>
		<g:textField name="shipname" value="${searchInputCommand.shipname}" placeholder="Input shipname"/>

		<label for="minCrew">Minimum crewsize</label>
		<g:field type="number" name="minCrew" value="${searchInputCommand.minCrew}" placeholder="Min. crewsize"/>

		<label for="maxCrew">Maximum crewsize</label>
		<g:field type="number" name="maxCrew" value="${searchInputCommand.maxCrew}" placeholder="Max crewsize"/>

		<g:submitButton name="Submit">Search</g:submitButton>
	</g:form>

<g:set var="now" value="${new Date()}"  />
<g:formatDate date="${now}" format="yyyy-MM-dd"/>

<g:rallyingCry/>





</body>
</html>