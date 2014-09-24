'use strict';

angular.module('BootstrapApplication.services')
    .factory('ReportingService', ['$http', function($http) {
        var reportingService = {};
        reportingService.getReportingData = function (successFn) {
            $http({
                url: '/api/reporting',
                dataType: 'json',
                method: 'GET',
                headers: {
                    'Content-Type': 'application/vnd.pl.warsjawa.reporting.v1+json'
                }
            }).success(function (data) {
                successFn(data);
            });
        };

        return reportingService;
    }
]);
