(function() {
	var app = angular.module("myApp");
	
	var bankController = function($scope, personService, $routeParams) {	
	
		var accNumber = $routeParams.accNumber;	
		var username = $routeParams.searchname;	
		var onCompletion = function(data) {
				$scope.BankAccountNumbers = data;
			
		};
		var onError = function(reason) {
			$scope.error = "Could not fetch the data";
		};		
		$scope.searchname = $routeParams.searchname;
		personService.getBankType(accNumber,username).then(onCompletion, onError);
		
	};
	
	app.controller("bankController", bankController);
}());