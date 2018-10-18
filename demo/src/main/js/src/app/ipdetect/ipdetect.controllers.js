angular.module('app.ipdetect.controllers', [
])

    .controller('IpDetectCtrl', function($scope, IpDetectIntegrationService) {

        $scope.data = {};

        IpDetectIntegrationService.getData().then(function(data) {
            $scope.data = data;
        });

    })

;
