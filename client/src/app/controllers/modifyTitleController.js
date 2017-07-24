/**
 * Created by akshatha on 7/22/2017.
 */
(function() {
    'use strict';

angular
    .module('movieflix')
    .controller('modifyTitleController', ModifyTitleController);

ModifyTitleController.$inject = ['titleService', '$routeParams','$location'];

function ModifyTitleController(titleService, $routeParams,$location) {
    var titleVm = this;
titleVm.editTitle = editTitle;
    init();

    function init() {
        console.log("modify controller");
        titleService
            .getTitle($routeParams.id)
            .then(function(data) {
                titleVm.title = data;
            }, function(error) {
                console.log(error);
            });
        titleService.getGenres()
            .then(function(data){
                titleVm.genres=data;//['Drama','Thriller','Romantic','Horror'];
            })
            .catch(function(error) {
                console.log(error);
            });
    }
    function editTitle(){
        titleService
            .setTitle(titleVm.title)
            .then(function(data) {
                $location.path('/title');
            }, function(error) {
                console.log(error);
            });
    }
}
})();
