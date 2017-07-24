/**
 * Created by akshatha on 7/20/2017.
 */
(function() {
    'use strict';

    angular
        .module('movieflix')
        .controller('authorizeUserController', AuthorizeUserController);

    AuthorizeUserController.$inject = ['userService','$location'];

    function AuthorizeUserController(userService, $location) {
        var loginVm = this;

        loginVm.getUser = getUser;
        loginVm.signUp = signUp;
        init();

        function init() {
            console.log('in LoginController');
        }

        function getUser() {
            userService
                .authorizeUser(loginVm.setUser)
                .then(function(data) {
                    $location.path('/title');
                }, function(error) {
                    console.log(error);
                })
        }
        function signUp(){
            $location.path('#/sign-up');
        }
    }

})();