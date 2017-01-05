<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Success</title>
</head>
<body>
	<h2>Hurray Person Found!!!</h2>
	
	<div style="color: red">  {{error}}  </div>
	<div id="searchResults">
		{{ person.fName +" "+ person.lName }}	</br>
	</div>
	<table>
			<thead>
				<th>BankTypes</th>
				
			</thead>
			<tbody>
				<tr ng-repeat="bank in banks">
					<td>{{bank}}</td>					
				</tr>
			</tbody>
		</table>
</body>
</html>
