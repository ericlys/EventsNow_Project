<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EventsNow</title>
</head>
<link rel="stylesheet" href="css/style1.css">
<script async defer
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBY1Fb5yos4HOJ9NOmHlwbA8e6cbusEGzI&callback=initMap">
</script>
<script src="js/mapa2.js"></script>

<body>
    <h2 id="title2">Eventos Próximos a mim</h2>
    <div id="container">
        <div id="map"></div>

        <div id="right">
            <form>
            <input type="submit" value="Criar Eventos" formmethod="get" formaction="html/index.html"><br>
            <input type="submit" value="Buscar eventos" formmethod="post" formaction="searchEvents" >
            </form>
        </div>
    </div>





</body>
</html>
