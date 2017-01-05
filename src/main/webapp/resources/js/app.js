(function() {
	var app = angular.module("myApp", ['ngRoute']);
	var contextRoot = "/" + window.location.pathname.split('/')[1];

	app.config(function($routeProvider) {
	    $routeProvider
	    .when("/", {
	        templateUrl : contextRoot + "/search",
	        controller : "myCtrl"
	    })
	    .when("/user/:searchname", {
	        templateUrl : contextRoot + "/results",
	        controller : "userController"
	    })
	     .when("/user/:searchname/:accNumber", {
	        templateUrl : contextRoot + "/bankResults",
	        controller : "bankController"
	    })	   
	    .otherwise({
	        template : "<h1>None</h1><p>Nothing has been selected,</p>"
	    });
	    
	});

}());