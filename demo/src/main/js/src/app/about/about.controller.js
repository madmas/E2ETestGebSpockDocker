angular.module('app.about',[])
    .controller('AboutCtrl', function($http, $scope) {
        $scope.items = [];

        $http.get('/items').success(function(data) {
            $scope.items = data.items;
        });

    })
;
