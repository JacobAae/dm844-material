
<%@ page import="dk.dm844.bsg.Crisis" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'crisis.label', default: 'Crisis')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-crisis" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-crisis" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="header" title="${message(code: 'crisis.header.label', default: 'Header')}" />
					
						<g:sortableColumn property="description" title="${message(code: 'crisis.description.label', default: 'Description')}" />
					
						<g:sortableColumn property="solved" title="${message(code: 'crisis.solved.label', default: 'Solved')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${crisisInstanceList}" status="i" var="crisisInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${crisisInstance.id}">${fieldValue(bean: crisisInstance, field: "header")}</g:link></td>
					
						<td>${fieldValue(bean: crisisInstance, field: "description")}</td>
					
						<td><g:formatBoolean boolean="${crisisInstance.solved}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${crisisInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
