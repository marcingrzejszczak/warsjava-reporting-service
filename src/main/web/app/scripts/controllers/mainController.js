'use strict';

/**
 * @ngdoc function
 * # MainCtrl
 */
angular.module('BootstrapApplication.controllers')
        .controller('MainCtrl', ['$scope', 'PersonService', function ($scope, PersonService) {
            $scope.awesomeThings = [
                'HTML5 Boilerplate',
                'AngularJS',
                'Karma'
            ];
            $scope.alerts = [];

            $scope.getPersons = function() {
                PersonService.getPersons(function(data) {
                        $scope.persons = data;
                    });
            };

            $scope.getPersons();

            $scope.closeAlert = function (index) {
                $scope.alerts.splice(index, 1);
            };
        }]);
