<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Chuck Norris Joke</title>
	<style media="print">
		a:after {
			content: " (" attr(href) ") ";
		}
	</style>

	<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Lobster">

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

	ul li:nth-child(3) {
		/* Selects the  */
	}

		div:empty {

		}

	.bsg.ships {
	}

	.bsg > p {
		/* Select p elements that are direct children of an element of the bsg class */
	}
	div + p {
		/* Select p elements that are directly following a div element */
	}
	p ~ p {
		/* Select li elements that are siblings (and following) another li element. */
		color: #DD0707;
	}

table {
	border-collapse: collapse;
	width: 800px;
}

tfoot tr td, th {
	background-color: #00f;
	color: #fff;
}

		tbody tr:nth-of-type(odd) {
			background-color: #cff0ff;
		}

	th:nth-child(3), td:nth-child(3) {
			text-align: right;
		}


	.nameinput-form fieldset{
		background-color: #ccd0dd;
		border: none;
	}

	.nameinput-form legend{
		background-color:  #ccd0dd;
		padding: 5px 50px 5px 15px;
	}

	.nameinput-form ol{
		list-style: none;
	}

	.nameinput-form li{
		margin: 9px 0 9px 0;
	}
	.nameinput-form input{
		background-color: #fff;
		color: #000;
		border: 2px solid #ccd0dd;
		display:block;
		width: 300px;
	}

	.nameinput-form input, .nameinput-form fieldset, .nameinput-form legend{
		border-radius: 8px;
	}

#logo {
	border: 2px solid #000;
	box-shadow: 5px 5px 5px 0px #333;
	display: block;
	text-align: center;
	width: 200px;

	margin: 20px;

	-webkit-transform: rotate(-9deg);
	-moz-transform: rotate(-9deg);
	-ms-transform: rotate(-9deg);
	-o-transform: rotate(-9deg);
	transform: rotate(-9deg);
}
#logo h2{
	color: #454545;
	text-shadow: 2px 2px 2px #bbbbbb;
	margin: 0;
	font-size: 40px;
}
#logo h3{
	background-color: #454545;
	color: #fff;
	margin: 0;
}


		.lobster {
        font-family: 'Lobster', serif;
        font-size: 48px;
      }


	input[required]:invalid, input[pattern]:invalid{
		border-color: red;
	}
	input[required]:valid, input[pattern]:valid{
		border-color: gray;
	}


	@media screen and (max-width: 800px) {
		body {
			color: magenta;
		}
	}
	@media screen and (min-width: 800px) and (max-width: 1000px) {
		body {
			color: red;
		}
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

<section class="lobster">
	<h1>The Quick Brown Fox Jumped over the lazy dog</h1>
</section>

<section id="logo">
	<h2>BSG</h2>
	<h3>Ships and Crews</h3>
</section>


<br/>
<br/>
<br/>
<br/>
<br/>



<form method="post" action="/somewhere" class="nameinput-form">
	<fieldset id="nameinput">
		<legend>Name input</legend>
		<ol>
			<li>
				<label for="name">Name</label>
				<input type="text" name="name" required="true" >
			</li>
		</ol>
	</fieldset>
</form>


<br/>
<br/>
<br/>
<br/>
<br/>

<a href="http://imada.sdu.dk">Education</a>

<form method="post" action="/projects/1">
	<fieldset id="personal_information">
		<legend>Project Information</legend>
		<ol>
			<li>
				<label for="name">Name</label>
				<input type="text" name="name" id="name"></li>
			<li>
				<label for="password">Password</label>
				<input type="password" name="password" id="password" title="Must be at least 8 characters"></li>
			<li>
				<label for="priority">Priority</label>
				<input type="range" min="0" max="10"
				       name="priority" value="0" id="priority"></li>
			<li>
				<label for="estimated_hours">Estimated Hours</label>
				<input type="number" name="estimated_hours"
				       min="0" max="1000" id="estimated_hours"></li>
			<li>
				<label for="start_date">Start date</label>
				<input type="date" name="start_date" id="start_date"
				       value="2013-12-01"></li>
			<li>
				<label for="email">Email contact</label>
				<input type="email" name="email" id="email" placeholder="Email address"></li>
			<li>
				<label for="url">Staging URL</label>
				<input type="url" name="url" id="url"></li>
			<li>
				<label for="project_color">Project color</label>
				<input type="color" name="project_color" id="project_color"></li>
			<li>
				<input type="submit" value="Submit"></li>
		</ol>
	</fieldset>
</form>





	<h1 class="bsg_header" id="page_header">BSG</h1>

	<g:randomChuckNorrisJoke/>


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

<table>
	<thead>
		<tr>
			<th>Name</th>
			<th>Crewsize</th>
			<th>Type</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>Battlestar Galactica</td>
			<td>2741</td>
			<td>Military</td>
		</tr>
		<tr>
			<td>Cloud 9</td>
			<td>5214</td>
			<td>Recreational</td>
		</tr>
		<tr>
			<td>Colonial One</td>
			<td>142</td>
			<td>Administration</td>
		</tr>
	</tbody>
	<tfoot>
		<tr>
			<td>Total</td>
			<td>8124</td>
			<td></td>
		</tr>
	</tfoot>
</table>




<div>H2---</div>
<p>Hej hej </p>
<p>Hej hej </p>
<p>Hej hej </p>
<p>Hej hej </p>


<div class="bsg">
	<p>Im the first paragraph</p>
	<p>Im the second paragraph</p>
	<div>
		<p>Im the <span>third</span> paragraph, inside the div</p>
	</div>
</div>

<div> </div>


<div class="bsg ships">
	Hej hej
</div>

<ul>
	<li>Item 1</li>
	<li>Item 2</li>
	<li>Item 3</li>
	<li>Item 4</li>
	<li>Item 5</li>
	<li>Item 6</li>
</ul>











</body>
</html>