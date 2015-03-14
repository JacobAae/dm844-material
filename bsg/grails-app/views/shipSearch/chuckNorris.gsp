<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Chuck Norris Joke</title>
	<style>

	table {
		margin-left: 50px;
		border-collapse: collapse;
		width: 800px;
	}

	tfoot tr td, th {
		background-color: #00f;
		color: #fff;
	}
	tbody tr:nth-of-type(odd) {
		background-color: #99ccff;
	}
	th:nth-child(3), td:nth-child(3) {
		text-align: right;
	}
	</style>


</head>

<body>




<table>
	<thead>
	<tr>
		<th>Name</th>
		<th>Type</th>
		<th>Crewsize</th>
	</tr>
	</thead>
	<tbody>
	<tr>
		<td>Battlestar Galactica</td>
		<td>Military</td>
		<td>2741</td>
	</tr>
	<tr>
		<td>Cloud 9</td>
		<td>Recreational</td>
		<td>5214</td>
	</tr>
	<tr>
		<td>Colonial One</td>
		<td>Administration</td>
		<td>142</td>
	</tr>
	</tbody>
	<tfoot>
	<tr>
		<td>Total</td>
		<td></td>
		<td>8124</td>
	</tr>
	</tfoot>
</table>




<br>
<br>
<br>
<br>






<header class="bsg">
	<g:each in="[1,2,3,4]" var="i">
		<p>Im a p element ${i}</p>
	</g:each>

	<span class="sp">
		<p>Im a p element too</p>
	</span>

</header>
<p>Im folowing a header element</p>



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