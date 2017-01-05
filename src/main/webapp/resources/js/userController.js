(function() {
	var app = angular.module("myApp");
	
	var userController = function($scope, personService, $routeParams) {		
		$scope.searchname = $routeParams.fName;
		var onCompletion = function(data) {
			$scope.error = null;
			$scope.person = data;
			
			
			if (!data) {
				$scope.error = "Could not fetch the data"
			}
			personService.BankTypes().then(onSucess, onError);
			
		};
		var onError = function(reason) {
			$scope.error = "Could not fetch the data";
		};	
		var onSucess = function(datas) {
			$scope.banks = datas;
		};
		$scope.searchname = $routeParams.searchname;
		personService.getPerson($scope.searchname).then(onCompletion, onError);
		
	};
	
	app.controller("userController", userController);
}());