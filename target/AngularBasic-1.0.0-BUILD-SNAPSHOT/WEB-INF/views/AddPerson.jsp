<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="application/javascript"
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script type="text/javascript"
	src="<spring:url value="/resources/js/myScript.js"/>"></script>

<title>MY APP</title>

</head>

<body>

	<div ng-app="myApp" ng-controller="myCtrl">
	{{ person.firstName +" "+ person.lastName }}
	<img ng-src={{person.imageSource}} title="{{person.firstName}}  {{person.lastName}}"/>
	</div>



</body>

<script>
	
</script>
</html>
