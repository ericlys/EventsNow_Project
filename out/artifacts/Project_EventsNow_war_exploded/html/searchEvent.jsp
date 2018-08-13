<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
    <meta charset="utf-8">
    <title>Marker Clustering</title>
    <link rel="stylesheet" href="/css/style1.css">

    <script src="https://developers.google.com/maps/documentation/javascript/examples/markerclusterer/markerclusterer.js"></script>
    <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBY1Fb5yos4HOJ9NOmHlwbA8e6cbusEGzI&callback=initMap"></script>
    <%--<script src="/js/mapa3.js"></script>--%>
</head>

<body>
<jsp:include page="header.jsp"></jsp:include>
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
<script>
    function initMap() {

        var map = new google.maps.Map(document.getElementById('mapa3'), {
            zoom: 3,
            center: {lat: -6.891181,lng: -38.556410}
        });

        // Create an array of alphabetical characters used to label the markers.
        var labels = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';

        // Add some markers to the map.
        // Note: The code uses the JavaScript Array.prototype.map() method to
        // create an array of markers based on a given "locations" array.
        // The map() method here has nothing to do with the Google Maps API.
        var markers = locations.map(function(location, i) {
            return new google.maps.Marker({
                position: location,
                label: labels[i % labels.length]
            });
        });

        // Add a marker clusterer to manage the markers.
        var markerCluster = new MarkerClusterer(map, markers,
            {imagePath: 'https://developers.google.com/maps/documentation/javascript/examples/markerclusterer/m'});
    }
    var locations = [
        {lat: -6.891181,lng: -38.556410},
        {lat: -6.891181,lng: -37.556410},
        {lat: -6.891181,lng: -38.656410}

    ]
    <%--var locations = [--%>
        <%--{--%>
            <%--<%--%>
            <%--List<Event> events = (ArrayList) request.getAttribute ("events");--%>
             <%--Iterator<Event> iterator = events.iterator ( );--%>
             <%--while (iterator.hasNext ()){--%>
             <%--Event event = iterator.next ();--%>
            <%--%>--%>
            <%--lat: <%=event.getLatitude()%>,lng: <%=event.getLongitude ()%>},--%>
        <%--<%--%>
          <%--}--%>
        <%--%>--%>
        <%--{lat: -6.891181,lng: -38.556410}--%>
    <%--]--%>

    initMap();
</script>

</body>
</html>

