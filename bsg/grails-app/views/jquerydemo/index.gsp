<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>JQuery demo</title>
	<asset:javascript src="bsg.js"/>
	<style>
		.redcolor {
			color: red;
		}
</style>
</head>

<body>
	<h1>This page is for demoing javascript</h1>

	<p class="foo">First paragraph with foo class</p>
	<p class="bar">Second paragraph with bar class</p>
	<p id="baz">Third paragraph with baz id</p>

	<input class="input-element" value="42">

	<button id="button-1">Button 1</button>
	<button id="button-2">Button 2</button>
	<button id="button-3">Button 3</button>
	<button id="button-4">Button 4</button>
	<br/>
	<a href="http://grydeske.net" id="grydeske-link">Grydeske link</a>
	<br/>
	<a href="http://jquery.com/" id="jquery-link">Jquery link</a>

	<script>
		$(function() {
			$("#button-1").click(function( event ) {
				console.debug("Button clicked");
				$("#button-1").rallyingcry().addClass('redcolor');
			}); //<1>


			$("#jquery-link").click(function( event ) {
				event.preventDefault();
				console.debug("Link clicked");
			}); //<1>

			$("#grydeske-link").on( 'click', function( event ) {
				event.preventDefault();
				console.debug("Link clicked");
			}); //<2>
		});

	</script>

	<br/>
	<br/>
	<a href="geolocation.gsp">Geolocation Demo</a>
	<br/>
	<a href="canvas.gsp">Canvas Demo</a>

</body>
</html>