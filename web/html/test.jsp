
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
    <meta charset="utf-8">
    <title>Marker Clustering</title>
    <link rel="stylesheet" href="/css/style1.css">

    <script src="https://developers.google.com/maps/documentation/javascript/examples/markerclusterer/markerclusterer.js"></script>
    <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBY1Fb5yos4HOJ9NOmHlwbA8e6cbusEGzI&callback=initMap"></script>
    <script src="/js/mapa3.js"></script>
</head>

<body>
<h2 id="title2">Buscar por eventos</h2>
<div id="container">
    <div id="eventRegistration">
        <h2>Filtros</h2><br>
        <input type="text" name="address" id="address" placeholder="Endereço"><br><br>
        <input type="date" name="date" id="date" placeholder="data"><br><br>
        <select name="theme" >
            <option value="Construção">Construção civil</option>
            <option value="Informática">Informática</option>
            <option value="Automação">Automação</option>
            <option value="Linguagens">Linguagens</option>
            <option value="Humanidades">Humanidades</option>
            <option value="Diversos">Diversos</option>
        </select><br><br>
        <input type="submit" value="Atualizar" id="submit" >
    </div>
    <div id="searchAdd">
        <h2>Resultado</h2>
        <div id="mapa3"></div>
    </div>
</div>

</body>
</html>

