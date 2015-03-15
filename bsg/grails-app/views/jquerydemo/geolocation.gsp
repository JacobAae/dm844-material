<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Geolocation</title>
	<asset:javascript src="bsg.js"/>
</head>

<body>
	<h1>Geolocation Demo</h1>

	<script>
		$(function() {
			navigator.geolocation.getCurrentPosition( function(position) {
				var latitude = position.coords.latitude;
				var longitude = position.coords.longitude;
				var element = $("<br/><img src='https://maps.googleapis.com/maps/api/staticmap?center="+latitude+","+longitude+"&zoom=12&size=500x500&markers=color:blue|label:X|"+latitude+","+longitude+"'>");
				$("h1").append( element)
			});
		});
	</script>

<br/>
<a href="canvas.gsp">Canvas Demo</a>


</body>
</html>