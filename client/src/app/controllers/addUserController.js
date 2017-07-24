/**
 * Created by akshatha on 7/20/2017.
 */
(function() {
    'use strict';

    angular
        .module('movieflix')
        .controller('addUserController', AddUserController);

    AddUserController.$inject = ['userService', '$location'];

    function AddUserController(userService, $location) {
        var addUserVm = this;

        addUserVm.addUser = addUser;

        init();

        function init() {
            console.log('in AddUserController');
        }

        function addUser() {
            userService
                .createUser(addUserVm.newUser)
                .then(function(data) {
                    $location.path('/');
                }, function(error) {
                    console.log(error);
                })
        }
    }
})();