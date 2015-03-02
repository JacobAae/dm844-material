
<%@ page import="dk.dm844.bsg.Crisis" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'crisis.label', default: 'Crisis')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-crisis" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-crisis" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list crisis">
			
				<g:if test="${crisisInstance?.header}">
				<li class="fieldcontain">
					<span id="header-label" class="property-label"><g:message code="crisis.header.label" default="Header" /></span>
					
						<span class="property-value" aria-labelledby="header-label"><g:fieldValue bean="${crisisInstance}" field="header"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${crisisInstance?.description}">
				<li class="fieldcontain">
					<span id="description-label" class="property-label"><g:message code="crisis.description.label" default="Description" /></span>
					
						<span class="property-value" aria-labelledby="description-label"><g:fieldValue bean="${crisisInstance}" field="description"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${crisisInstance?.affectedShips}">
				<li class="fieldcontain">
					<span id="affectedShips-label" class="property-label"><g:message code="crisis.affectedShips.label" default="Affected Ships" /></span>
					
						<g:each in="${crisisInstance.affectedShips}" var="a">
						<span class="property-value" aria-labelledby="affectedShips-label"><g:link controller="ship" action="show" id="${a.id}">${a?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${crisisInstance?.solved}">
				<li class="fieldcontain">
					<span id="solved-label" class="property-label"><g:message code="crisis.solved.label" default="Solved" /></span>
					
						<span class="property-value" aria-labelledby="solved-label"><g:formatBoolean boolean="${crisisInstance?.solved}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${crisisInstance?.solvers}">
				<li class="fieldcontain">
					<span id="solvers-label" class="property-label"><g:message code="crisis.solvers.label" default="Solvers" /></span>
					
						<g:each in="${crisisInstance.solvers}" var="s">
						<span class="property-value" aria-labelledby="solvers-label"><g:link controller="person" action="show" id="${s.id}">${s?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:crisisInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${crisisInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
