(function() {
    'use strict';

    angular
        .module('movieflix')
        .service('titleService', titleService);

    titleService.$inject = ['$http', '$q'];

    function titleService($http, $q) {
        var self = this;

        self.getTypes = getTypes;
        self.getYears  = getYears;
        self.getGenres = getGenres;
        self.setTitle = setTitle;
        self.getTitle = getTitle;
        self.getTitles =getTitles;

        function getTypes() {
            return $http.get('http://localhost:8000/persistence/api/titles')
                .then(successFn, errorFn);
        }

        function getYears() {
            return $http.get('http://localhost:8000/persistence/api/Years')
                .then(successFn, errorFn);
        }
        function getGenres() {
            return $http.get('http://localhost:8000/persistence/api/genres')
                .then(successFn, errorFn);
        }
        function setTitle(){
            return $http.get('http://localhost:8000/persistence/api/titles')
                .then(successFn, errorFn);
        }
        function getTitle(id) {
            return $http.get('http://localhost:8000/persistence/api/titles' + id)
                .then(successFn, errorFn);
        }
        function getTitles() {
            return $http.get('http://localhost:8000/persistence/api/titles')
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