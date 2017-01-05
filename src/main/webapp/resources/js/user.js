/**
 * 
 */

var contextRoot = "/" + window.location.pathname.split('/')[1];


(function() {
	
	var myCtrl = function($scope, personService, $log, $location, $interval,
			$anchorScroll) {

		var decreaseCount = function() {
			$scope.countdown -= 1;
			if ($scope.countdown < 1) {
				$scope.search($scope.searchname);
			}

		};

		
		$scope.countdown = 5;
		dummycount = null;
		dummycount = $interval(decreaseCount, 1000, 5);

		

		$scope.makeajaxcall = function(fname, lname) {
			var person = {
				fName : fname,
				lName : lname
			};
			$http({
				'url' : 'savenewperson',
				'method' : 'POST',
				'headers' : {
					'Content-Type' : 'application/json'
				},
				'data' : person
			}).success(function(data) {
				$scope.success = "sucessfully added";
			}).error(function(data) {
				console.log('Error: ' + data);
			});
		};
		
		$scope.getAll = function() {
			personService.AllPersons().then(ongetList, onError);			}

		
		var ongetList = function(datas) {

			$scope.persons = datas;
			$location.hash("userTable");
			$anchorScroll();
		};
	};
	app.controller("myCtrl", myCtrl);
}());