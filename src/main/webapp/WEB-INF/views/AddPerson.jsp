<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="application/javascript"
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script type="text/javascript"
	src="//ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-route.js"></script>
<script type="text/javascript"
	src="<spring:url value="/resources/js/app.js"/>"></script>
<script type="text/javascript"
	src="<spring:url value="/resources/js/angularService.js"/>"></script>
<script type="text/javascript"
	src="<spring:url value="/resources/js/userController.js"/>"></script>
<script type="text/javascript"
	src="<spring:url value="/resources/js/mainController.js"/>"></script>
<script type="text/javascript"
	src="<spring:url value="/resources/js/bankController.js"/>"></script>




<title>MY APP</title>

</head>

<body>
	<div ng-app="myApp">

		<h1>Person Viewer</h1>
		<div ng-view></div>
	</div>



</body>

<script>
	
</script>
</html>
