<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Chuck Norris Joke</title>
	<style>
	h1 {
		color: #255b17;
	}
	.bsg_header {
		padding: 10px;
	}
	#page_header {
		margin: 5px;
		border: dashed #006dba 2px;
	}
	</style>
</head>

<body>

	<h1 class="bsg_header" id="page_header">BSG</h1>

	<g:randomChuckNorrisJoke/>


<form method="post" action="/projects/1">
	<fieldset id="personal_information">
	<legend>Project Information</legend>
	<ol>
		<li>
		<label for="name">Name</label>
		<input type="text" name="name" id="name">
		</li>
		<li>
			<label for="priority">Priority</label>
			<input type="range" min="0" max="10"
			       name="priority" value="0" id="priority">
		</li>
		<li>
			<label for="estimated_hours">Estimated Hours</label>
			<input type="number" name="estimated_hours"
			       min="0" max="1000"
			       id="estimated_hours">
		</li>

		<li>
<label for="start_date">Start date</label>
<input type="date" name="start_date" id="start_date"
value="2013-12-01">
		</li>

		<li>
			<label for="email">Email contact</label>
			<input type="email" name="email" id="email">
		</li>

		<li>
			<label for="url">Staging URL</label>
			<input type="url" name="url" id="url">
		</li>

		<li>
			<label for="project_color">Project color</label>
			<input type="color" name="project_color" id="project_color">
		</li>

		<li>
		<input type="submit" value="Submit">
		</li>
	</ol>
	</fieldset>
</form>








</body>
</html>