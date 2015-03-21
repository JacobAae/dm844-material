<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Demo of less</title>
	<asset:stylesheet src="bsg.css"/>
</head>

<body>

	<h1>H1 header is here</h1>
	<h2>A smaller H2 header is this one</h2>
	<h3>An even smaller h3 header looks like this</h3>

	<section>
		<article>
			<p id="p1">Article 1 paragraph 1</p>
			<p id="p2">Article 1 paragraph 2</p>
			<p id="p3">Article 1 paragraph 3</p>
		</article>
		<article>
			<p class="paragraph">Article 2 paragraph 1</p>
			<p>Article 2 paragraph 2</p>
			<p class="paragraph">Article 2 paragraph 3</p>
		</article>
	</section>

	<g:form action="lessDemo">
		<fieldset>
			<g:textField name="name" placeholder="Input name here"/>

			<g:submitButton name="Submit">Submit</g:submitButton>
		</fieldset>
	</g:form>

</body>
</html>