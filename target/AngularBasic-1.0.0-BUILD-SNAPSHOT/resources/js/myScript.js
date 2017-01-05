var app = angular.module("myApp", []);
app.controller("myCtrl", function($scope,$http) {
	
	 var onCompletion = function(response){
		 
		 $scope.person = response.data
	 };
	$http.get("http://localhost:8080/angularApp/getPerson")
	.then(onCompletion);

});