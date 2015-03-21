<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<meta name="layout" content="main">
	<title>Error demo</title>
</head>

<body>

<div class="content scaffold-list" role="main">

	<h1>Demo of errors</h1>
	<g:hasErrors bean="${ship}">
		<section class="errors">
			<g:renderErrors bean="${ship}"/>
		</section>
	</g:hasErrors>

</div>
</body>
</html>