/**
 * Angular HTTP Calls to webSevices in REST and other Format
 */

(function(){
	var personService = function($http,$log){
		var getPerson = function(searchname){
			
			return $http.get(
					"http://localhost:8080/AngularBasic/getPerson/"
							+ searchname).then(function(response){
								return response.data;							
							});
		};
		
		var BankTypes =function(){
			var result;
			return $http.get("http://localhost:8080/AngularBasic/getAllBankTypes").then(function(response){
				result= response.data;
				console.log(result);
				return result;									
			});
		};
		return{
			
			getPerson:getPerson,
			BankTypes:BankTypes
			
		};
	};
	

	var module = angular.module("myApp");
	module.factory("personService",personService);
}());