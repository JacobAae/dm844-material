<%@ page import="dk.dm844.bsg.Crisis" %>



<div class="fieldcontain ${hasErrors(bean: crisisInstance, field: 'header', 'error')} required">
	<label for="header">
		<g:message code="crisis.header.label" default="Header" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="header" required="" value="${crisisInstance?.header}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: crisisInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="crisis.description.label" default="Description" />
		
	</label>
	<g:textField name="description" value="${crisisInstance?.description}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: crisisInstance, field: 'affectedShips', 'error')} ">
	<label for="affectedShips">
		<g:message code="crisis.affectedShips.label" default="Affected Ships" />
		
	</label>
	

</div>

<div class="fieldcontain ${hasErrors(bean: crisisInstance, field: 'solved', 'error')} ">
	<label for="solved">
		<g:message code="crisis.solved.label" default="Solved" />
		
	</label>
	<g:checkBox name="solved" value="${crisisInstance?.solved}" />

</div>

<div class="fieldcontain ${hasErrors(bean: crisisInstance, field: 'solvers', 'error')} ">
	<label for="solvers">
		<g:message code="crisis.solvers.label" default="Solvers" />
		
	</label>
	

</div>

