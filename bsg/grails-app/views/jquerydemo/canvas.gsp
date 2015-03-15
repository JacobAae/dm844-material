<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>Canvas Demo</title>
	<asset:javascript src="bsg.js"/>
	<style>
		canvas {
			border-color: #000;
			border-style: solid;
		}
</style>
</head>

<body>

	<h1>Canvas Demo</h1>

	<canvas id="logo-canvas" width="600" height="600">Logo</canvas>

	<script>
		var canvas = document.getElementById('logo-canvas');
		if( canvas.getContext ) {
			var context = canvas.getContext('2d');


			context.fillStyle = "rgb(0,0,225)"
			// x,y, x-size, y-size
			context.fillRect(10,10,580,580);
			context.save();

			context.fillStyle = "rgb(0,0,225)";
			context.strokeStyle = "#FF0000";
			context.lineWidth = 5;

			context.beginPath();
			context.moveTo(300,300);
			context.lineTo(560,300);
			context.lineTo(560,560);
			context.lineTo(40,560);
			context.lineTo(40,40);
			context.lineTo(560,40);
			context.lineTo(560,60);

			context.stroke();
			context.closePath();


			context.fillStyle = "#FF0000";
			context.strokeStyle = "#FF0000";
			context.lineWidth = 12;

			context.beginPath();
			context.moveTo(100,100);
			context.lineTo(130,130);
			context.lineTo(100,160);
			context.lineTo(100,100);
			context.closePath();
			context.fill();


			context.beginPath();
			context.moveTo(100,160);
			context.lineTo(130,190);
			context.lineTo(100,220);
			context.lineTo(100,160);
			context.closePath();
			context.fill();

			// Top of S
      context.beginPath();
      context.moveTo(250, 160);
      context.bezierCurveTo(150, 160, 150, 100, 320, 100);

			// Bottom of S
			context.moveTo(250, 160);
			context.bezierCurveTo(350, 160, 350, 220, 180, 220);

			// complete custom shape
      context.lineWidth = 10;
      context.strokeStyle = 'rgb(0,225,0)';
      context.stroke();

		} else {
			// Do backup stuff or let browser show canvas element content
		}
	</script>



</body>
</html>