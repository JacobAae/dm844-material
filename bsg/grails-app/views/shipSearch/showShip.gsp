<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title></title>
</head>
<body>
	Ship name: ${ship.name}
	Crewsize: ${ship.crewsize}


<g:if test="${ship.crewmembers}">
	<h3>Crewmembers</h3>
	<ul>
		<g:each in="${ship.crewmembers}" var="crewmember">
			<li>${crewmember.name}</li>
		</g:each>
	</ul>
</g:if>
<g:else>
	<p>No crewmembers registrered</p>
</g:else>

<g:findAll in="${ship.crewmembers}" expr="it.solvedCrisis">
	<p>Crisis solver: ${it.name}</p>
</g:findAll>

<g:link controller="ship" action="show" id="1">Ship 1</g:link>

<g:link url="[controller: 'ship', action: 'show', id: 2 ]">Ship 2</g:link>

<asset:image src="Code-comments.jpg"/>

</body>
</html>