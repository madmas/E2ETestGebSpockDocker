angular.module('app', [
    'app.contact',
    'app.about',
    'app.templates',
    'app.routings',
    'app.ipdetect'
])

    .controller('AppCtrl', function($http, $scope, $locale) {
        $scope.date = Date.now();
        $scope.locale = $locale.id;
    })
;
