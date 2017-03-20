<%@page import="gestione.GestioneMeteo"%>
<%@page import="java.util.List"%>
<%@page import="model.Giorno"%>
<%@page import="model.RilevazioneMeteorologica"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>

<html>

<head>
	<title>Weather</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="weather.js"></script>
</head>

<body>

	<!-- BARRA DI NAVIGAZIONE -->
	<nav class="navbar navbar-default" style="background-color: #66ccff;">
	
		<div class="container">
		
			<div class="navbar-header">
				<span class="navbar-brand">
					<img src="img/weather.png" width="70" height="60" />
				</span>
				<a class="navbar-brand" style="color: white;">Weather</a>
			</div>
			
			<div class="collapse navbar-collapse" id="myNavbar">
			</div>
			
		</div>
		
	</nav>


	<!-- CONTENUTO DELLA PAGINA -->
	<div class="container">
	
		<h3 id="title">Rilevazioni meteorologiche del mese</h3>
		
		<a href="weatherPage.jsp" class="btn btn-success" id="btn" role="button">Scopri il giorno con la minore escursione termica</a>
		<hr>
		
		<table class="table" id="weatherTable">
			
			<thead>
				<tr>
				  <th>Giorno</th>
				  <th>Temperatura massima</th>
				  <th>Temperatura minima</th>
				  <th>Escursione termica</th>
				</tr>
			</thead>
			
			<tbody>
				
					<%
					
					/// richiamiamo la lista di tutti i giorni e la inseriamo in una tabella tramite un ciclo for
					
					RilevazioneMeteorologica rm = new RilevazioneMeteorologica();
					GestioneMeteo g = new GestioneMeteo();
					
					g.aggiungiGiorni(rm);
					
					List<Giorno> giorni = rm.getGiorni();					
					
					for (int i=0; i<giorni.size(); i++){
						
					%>	
						
						<tr>	
							
							<td><%=giorni.get(i).getGiorno()%></td>
							<td><%=giorni.get(i).getTempMassima()%></td>
							<td><%=giorni.get(i).getTempMinima()%></td>
							<td><%=giorni.get(i).getEscursioneTermica()%></td>
						
						</tr>
						
					<%
					
					}					
					
					%>
				
			</tbody>
			
		</table>		
		
	</div>
	
</body>

</html>