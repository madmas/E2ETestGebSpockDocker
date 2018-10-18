angular.module('app.ipdetect.integrationservices', [])

    .service('IpDetectIntegrationService', function($q, $http) {

        return {
            getData: function () {
                var dfd = $q.defer();

                $http.get('http://ip.jsontest.com/').success(function(data) {
                    dfd.resolve(data);
                });

                return dfd.promise;
            }
        };

    })

;
