/**
 * Created by akshatha on 7/20/2017.
 */
(function() {
    'use strict';

    angular
        .module('movieflix', ['ngMessages', 'ngRoute'])
        .config(moduleConfig)
        .run(moduleRun);

    moduleConfig.$inject = ['$routeProvider'];

    function moduleConfig($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: 'src/app/views/login.tmpl.html',
                controller: 'authorizeUserController',
                controllerAs: 'loginVm'
            })
            .when('/sign-up', {
                templateUrl: 'src/app/views/sign-up.tmpl.html',
                controller: 'addUserController',
                controllerAs: 'addUserVm'
            })
            .when('/title', {
                templateUrl: 'src/app/views/title.tmpl.html',
                controller: 'titleController',
                controllerAs: 'titleVm'
            })
            .when('/title-detail/:id', {
                templateUrl: 'src/app/views/title-detail.tmpl.html',
                controller: 'titleDetailController',
                controllerAs: 'titleVm'
            })
            .when('/edit-title/:id', {
                templateUrl: 'src/app/views/edit-title.tmpl.html',
                controller: 'modifyTitleController',
                controllerAs: 'addTitleVm'
            })
            .when('/add-title', {
                templateUrl: 'src/app/views/add-title.tmpl.html',
                controller: 'addTitleController',
                controllerAs: 'addTitleVm'
            })
            .otherwise({
                redirectTo: '/'
            });
    }

    moduleRun.$inject = [];

    function moduleRun() {
        console.log('App Started');
    }
})();