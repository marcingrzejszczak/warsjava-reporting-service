'use strict';

angular.module('BootstrapApplication.services')
    .factory('PersonService', ['$http', function($http) {
        var personService = {};
        personService.getPersons = function (successFn) {
            $http({
                url: '/persons',
                dataType: 'json',
                method: 'GET',
                headers: {
                    'Content-Type': 'application/vnd.pl.warsjawa.reporting.v1+json'
                }
            }).success(function (data) {
                successFn(data);
            });
        };

        return personService;
    }
]);
