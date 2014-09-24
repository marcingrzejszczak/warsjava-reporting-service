'use strict';

/**
 * @ngdoc function
 * # MainCtrl
 */
angular.module('BootstrapApplication.controllers')
        .controller('MainCtrl', ['$scope', 'ReportingService', function ($scope, ReportingService) {
            $scope.awesomeThings = [
                'HTML5 Boilerplate',
                'AngularJS',
                'Karma'
            ];
            $scope.alerts = [];

            $scope.getReportingData = function() {
                ReportingService.getReportingData(function(data) {
                        $scope.reportingData = data;
                    });
            };

            $scope.getReportingData();

            $scope.closeAlert = function (index) {
                $scope.alerts.splice(index, 1);
            };
        }]);
