

(function() {	
	var app = angular.module("myApp");
	var contextRoot = "/" + window.location.pathname.split('/')[1];
	var myCtrl = function($scope,$location, $interval) {

		var decreaseCount = function() {
			$scope.countdown -= 1;
			if ($scope.countdown < 1) {
				$scope.search($scope.searchname);
			}

		};

		$scope.searchname = "David";
		$scope.countdown = 5;
		dummycount = null;
		dummycount = $interval(decreaseCount, 1000, 5);

		
		$scope.search = function(searchname) {
			if (dummycount) {
				$interval.cancel(dummycount);
				$scope.countdown = null;
			}
			$location.path("/user/" + searchname);
		};
		
	};
app.controller("myCtrl", myCtrl);
}());