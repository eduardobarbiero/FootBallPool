<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de carros</title>

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.1.8/semantic.min.css" />
</head>
<body>
	<div class="ui fixed inverted menu">
		<div class="ui container">
			<a href="#" class="header item">FootBallPool</a>
		</div>
	</div>
	<div class="ui main text container" style="padding-top: 80px">
		<table class="ui blue celled table">
			<tbody>
				<tr>
					<td><b>Seleção: </b>${teams.SName} <img src="${teams.SCountryFlag}"></td>
				</tr>
				<tr>
					<td><b>Treinador: </b>${teams.SCoach}</td>
				</tr>
				<tr>
					<td><b>Goleiros</b></td>
					<tr>
					<td><c:forEach items="${teams.SGoalKeepers}" var="team">
							<tr>
								<td>${team}</td>
							</tr>
						</c:forEach>
					<td>
				</tr>
				<tr>
					<td><b>Zagueiros</b></td>
					<tr>
					<td><c:forEach items="${teams.SDefenders}" var="team">
							<tr>
								<td>${team}</td>
							</tr>
						</c:forEach>
					<td>
				</tr>
				<tr>
					<td><b>Meio campo</b></td>
					<tr>
					<td><c:forEach items="${teams.SMidFields}" var="team">
							<tr>
								<td>${team}</td>
							</tr>
						</c:forEach>
					<td>
				</tr>
				<tr>
					<td><b>Atacante</b></td>
					<tr>
					<td><c:forEach items="${teams.SForwards}" var="team">
							<tr>
								<td>${team}</td>
							</tr>
						</c:forEach>
					<td>
				</tr>				
				<tr><td><b>Artilheiros</b></td></tr>
				<c:forEach items="${top_goals}" var="top_goal">				  			 
					 <tr>
					   <td>Jogador: ${top_goal.SName } <td>
					   <td>Gols: ${top_goal.IGoals } <td>					    		
					 </tr>				  
				</c:forEach>				
			</tbody>
			
		</table>
	</div>

	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0-beta1/jquery.min.js"></script>
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.1.8/semantic.min.js"></script>
</body>
</html>