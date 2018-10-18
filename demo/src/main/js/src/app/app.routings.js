angular.module('app.routings', ['ui.router'])
    .config(function ($stateProvider, $urlRouterProvider) {
        $urlRouterProvider.otherwise('/');

        $stateProvider
            .state('default', {
                url: '/',
                templateUrl: 'app.tpl.html',
                controller: 'AppCtrl'
            })
            .state('default.contact', {
                url: 'contact',
                templateUrl: 'contact/contact.tpl.html',
                controller: 'ContactCtrl'
            })
            .state('default.about', {
                url: 'about',
                templateUrl: 'about/about.tpl.html',
                controller: 'AboutCtrl'
            })
        ;
    })
;

