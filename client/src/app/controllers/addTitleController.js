/**
 * Created by akshatha on 7/23/2017.
 */
(function(){
    'use strict';
    angular
        .module('movieflix')
        .controller('addTitleController',AddTitleController);

    AddTitleController.$inject= ['titleService'];
    function AddTitleController(titleService){
        var addTitleVm = this;

        addTitleVm.addTitle = addTitle;
        init();
        function init(){
console.log("Add title controller");
            titleService.getGenres()
                .then(function(data){
                    addTitleVm.genres=['Drama','Thriller','Romantic','Horror'];
                })
                .catch(function(error) {
                    console.log(error);
                });
        }
        function addTitle() {
            titleService
                .addTitle(addTitleVm.title)
                .then(function(data) {
                    $location.path('/title');
                }, function(error) {
                    console.log(error);
                })
        }

    }

})();