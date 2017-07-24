/**
 * Created by akshatha on 7/22/2017.
 */
(function() {
    'use strict';

    angular
        .module('movieflix')
        .controller('titleDetailController', TitleDetailController);

    TitleDetailController.$inject = ['userService', '$routeParams'];

    function TitleDetailController(userService, $routeParams) {
        var titleVm = this;
        titileVm.addComments = addComments();
        titleVm.addRatings = addRatings();

        init();

        function init() {
            userService
                .getUser($routeParams.id)
                .then(function(data) {
                    titleVm.title = {
                        title: "Goodfellas",
                        year: 1990,
                        rated: "R",
                        released: "1990-09-21",
                        runtime: "146 min",
                        genre: "Biography, Crime, Drama",
                        director: "Martin Scorsese",
                        writer: "Nicholas Pileggi (book), Nicholas Pileggi (screenplay), Martin Scorsese (screenplay)",
                        actors: "Robert De Niro, Ray Liotta, Joe Pesci, Lorraine Bracco",
                        plot: "Henry Hill and his friends work their way up through the mob hierarchy.",
                        language: "English, Italian",
                        country: "USA",
                        awards: "Won 1 Oscar. Another 37 wins & 31 nominations.",
                        poster: "http://ia.media-imdb.com/images/M/MV5BMTY2OTE5MzQ3MV5BMl5BanBnXkFtZTgwMTY2NTYxMTE@._V1_SX300.jpg",
                        metaScore: 89,
                        imdbRating: 8.7,
                        imdbVotes: 682729,
                        imdbId: "tt0099685",
                        type: "movie",
                        other:[{
                                userName:"User1",
                                comments:"Test comment 1",
                                ratings:"4.5"
                                },{
                                userName:"User2",
                                comments:"Test comment 3",
                                ratings:"4"
                                }],
                        averageOtherRatings:"3.5"
                    }
                }, function(error) {
                    console.log(error);
                });
        }
        function addComments(){
            var data = {user_id:titleVm.user_id ,title_id:titleVm.title_id,comments:titleVm.userComments};
            userService
                .getUser(data)
                .then(function(data) {
                    titleVm.title = {
                        title: "Goodfellas",
                        year: 1990,
                        rated: "R",
                        released: "1990-09-21",
                        runtime: "146 min",
                        genre: "Biography, Crime, Drama",
                        director: "Martin Scorsese",
                        writer: "Nicholas Pileggi (book), Nicholas Pileggi (screenplay), Martin Scorsese (screenplay)",
                        actors: "Robert De Niro, Ray Liotta, Joe Pesci, Lorraine Bracco",
                        plot: "Henry Hill and his friends work their way up through the mob hierarchy.",
                        language: "English, Italian",
                        country: "USA",
                        awards: "Won 1 Oscar. Another 37 wins & 31 nominations.",
                        poster: "http://ia.media-imdb.com/images/M/MV5BMTY2OTE5MzQ3MV5BMl5BanBnXkFtZTgwMTY2NTYxMTE@._V1_SX300.jpg",
                        metaScore: 89,
                        imdbRating: 8.7,
                        imdbVotes: 682729,
                        imdbId: "tt0099685",
                        type: "movie",
                        other:[{
                            userName:"User1",
                            comments:"Test comment 1",
                            ratings:"4.5"
                        },{
                            userName:"User2",
                            comments:"Test comment 3",
                            ratings:"4"
                        }],
                        averageOtherRatings:"3.5"
                    }
                }, function(error) {
                    console.log(error);
                });

        }
        function addRatings(){
            var data = {user_id:titleVm.user_id ,title_id:titleVm.title_id,ratings:titleVm.userRatings};
            userService
                .getUser(data)
                .then(function(data) {
                    titleVm.title = {
                        title: "Goodfellas",
                        year: 1990,
                        rated: "R",
                        released: "1990-09-21",
                        runtime: "146 min",
                        genre: "Biography, Crime, Drama",
                        director: "Martin Scorsese",
                        writer: "Nicholas Pileggi (book), Nicholas Pileggi (screenplay), Martin Scorsese (screenplay)",
                        actors: "Robert De Niro, Ray Liotta, Joe Pesci, Lorraine Bracco",
                        plot: "Henry Hill and his friends work their way up through the mob hierarchy.",
                        language: "English, Italian",
                        country: "USA",
                        awards: "Won 1 Oscar. Another 37 wins & 31 nominations.",
                        poster: "http://ia.media-imdb.com/images/M/MV5BMTY2OTE5MzQ3MV5BMl5BanBnXkFtZTgwMTY2NTYxMTE@._V1_SX300.jpg",
                        metaScore: 89,
                        imdbRating: 8.7,
                        imdbVotes: 682729,
                        imdbId: "tt0099685",
                        type: "movie",
                        other:[{
                            userName:"User1",
                            comments:"Test comment 1",
                            ratings:"4.5"
                        },{
                            userName:"User2",
                            comments:"Test comment 3",
                            ratings:"4"
                        }],
                        averageOtherRatings:"3.5"
                    }
                }, function(error) {
                    console.log(error);
                });
        }
    }
})();