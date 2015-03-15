<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Socket Demo</title>
	<asset:javascript src="jquery" />
	<asset:javascript src="spring-websocket" />

	<script type="text/javascript">
		$(function() {
			var socket = new SockJS("${createLink(uri: '/stomp')}");
			var client = Stomp.over(socket);
			client.connect({}, function() {
				client.subscribe("/topic/ship", function(message) {
					var newShip = $("<div class='ship'></div>")
					newShip.html(message.body)
					$("#shipDiv").append(newShip);
				});
			});
		});
	</script>
</head>

<body>
	<h1>Socket demo</h1>
	<div id="shipDiv"></div>
</body>
</html>