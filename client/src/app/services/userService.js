/**
 * Created by akshatha on 7/20/2017.
 */
(function() {
    'use strict';

    angular
        .module('movieflix')
        .service('userService', userService);

    userService.$inject = ['$http', '$q'];

    function userService($http, $q) {
        var self = this;
        self.authorizeUser = authorizeUser;
        self.getUsers = getUsers;

        self.getUser = getUser;
        self.createUser = createUser;



        function authorizeUser(user){
            console.log(user)
            return $http.get('http://localhost:8000/persistence/api/users')
                .then(successFn, errorFn);
        }
        function getUsers() {
            return $http.get('http://localhost:8000/persistence/api/users')
                .then(successFn, errorFn);
        }

        function getUser(id) {
            return $http.get('http://localhost:8000/persistence/api/users/' + id)
                .then(successFn, errorFn);
        }

        function createUser(user) {
            return $http.post('http://localhost:8000/persistence/api/users', user)
                .then(successFn, errorFn);
        }

        function successFn(response) {
            return response.data; //RESOLVE
        }

        function errorFn(response) {
            return $q.reject(error.status); //REJECT
        }
    }
})();