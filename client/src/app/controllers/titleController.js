/**
 * Created by akshatha on 7/21/2017.
 */
(function() {
    'use strict';

    angular
        .module('movieflix')
        .controller('titleController', TitleController);

    TitleController.$inject = ['titleService'];

    function TitleController(titleService) {
        var titleListVm = this;


        init();
        titleListVm.setFilter = setFilter;
        titleListVm.deleteDialog = deleteDialog;
        function init() {
            console.log('in TitleController');

            titleListVm.sorter = {
                sortBy: 'title',
                sortOrder: false
            };
            titleListVm.userType = 'Admin';

            titleService.getTitles()
                .then(function(data) {
                    titleListVm.titles = [{
                        "title": "Avengers: Age of Ultron",
                        "year": 2015,
                        "rated": "PG-13",
                        "released": "2015-05-01",
                        "runtime": "141 min",
                        "genre": "Action, Adventure, Sci-Fi",
                        "director": "Joss Whedon",
                        "writer": "Joss Whedon, Stan Lee (Marvel comics), Jack Kirby (Marvel comics)",
                        "actors": "Robert Downey Jr., Chris Hemsworth, Mark Ruffalo, Chris Evans",
                        "plot": "When Tony Stark and Bruce Banner try to jump-start a dormant peacekeeping program called Ultron, things go horribly wrong and it's up to Earth's Mightiest Heroes to stop the villainous Ultron from enacting his terrible plans.",
                        "language": "English",
                        "country": "USA",
                        "awards": "1 win & 12 nominations.",
                        "poster": "http://ia.media-imdb.com/images/M/MV5BMTU4MDU3NDQ5Ml5BMl5BanBnXkFtZTgwOTU5MDUxNTE@._V1_SX300.jpg",
                        "metaScore": 66,
                        "imdbRating": 7.6,
                        "imdbVotes": 370909,
                        "imdbId": "tt2395427",
                        "type": "movie"
                    },{
                        "title": "The Avengers",
                        "year": 2012,
                        "rated": "PG-13",
                        "released": "2012-05-04",
                        "runtime": "143 min",
                        "genre": "Action, Sci-Fi, Thriller",
                        "director": "Joss Whedon",
                        "writer": "Joss Whedon (screenplay), Zak Penn (story), Joss Whedon (story)",
                        "actors": "Robert Downey Jr., Chris Evans, Mark Ruffalo, Chris Hemsworth",
                        "plot": "Earth's mightiest heroes must come together and learn to fight as a team if they are to stop the mischievous Loki and his alien army from enslaving humanity.",
                        "language": "English, Russian",
                        "country": "USA",
                        "awards": "Nominated for 1 Oscar. Another 35 wins & 76 nominations.",
                        "poster": "http://ia.media-imdb.com/images/M/MV5BMTk2NTI1MTU4N15BMl5BanBnXkFtZTcwODg0OTY0Nw@@._V1_SX300.jpg",
                        "metaScore": 69,
                        "imdbRating": 8.1,
                        "imdbVotes": 920458,
                        "imdbId": "tt0848228",
                        "type": "movie"
                    },
                        {
                            "title": "How to Train Your Dragon",
                            "year": 2010,
                            "rated": "PG",
                            "released": "2010-03-26",
                            "runtime": "98 min",
                            "genre": "Animation, Adventure, Family",
                            "director": "Dean DeBlois, Chris Sanders",
                            "writer": "William Davies (screenplay), Dean DeBlois (screenplay), Chris Sanders (screenplay), Cressida Cowell (book)",
                            "actors": "Jay Baruchel, Gerard Butler, Craig Ferguson, America Ferrera",
                            "plot": "A hapless young Viking who aspires to hunt dragons, becomes the unlikely friend of a young dragon himself, and learns there may be more to the creatures than he assumed.",
                            "language": "English",
                            "country": "USA",
                            "awards": "Nominated for 2 Oscars. Another 24 wins & 57 nominations.",
                            "poster": "http://ia.media-imdb.com/images/M/MV5BMjA5NDQyMjc2NF5BMl5BanBnXkFtZTcwMjg5ODcyMw@@._V1_SX300.jpg",
                            "metaScore": 74,
                            "imdbRating": 8.2,
                            "imdbVotes": 450613,
                            "imdbId": "tt0892769",
                            "type": "movie"
                        },
                        {
                            "title": "12 Years a Slave",
                            "year": 2013,
                            "rated": "R",
                            "released": "2013-11-08",
                            "runtime": "134 min",
                            "genre": "Biography, Drama, History",
                            "director": "Steve McQueen",
                            "writer": "John Ridley (screenplay), Solomon Northup (based on \"Twelve Years a Slave\" by)",
                            "actors": "Chiwetel Ejiofor, Dwight Henry, Dickie Gravois, Bryan Batt",
                            "plot": "In the antebellum United States, Solomon Northup, a free black man from upstate New York, is abducted and sold into slavery.",
                            "language": "English",
                            "country": "USA, UK",
                            "awards": "Won 3 Oscars. Another 229 wins & 300 nominations.",
                            "poster": "http://ia.media-imdb.com/images/M/MV5BMjExMTEzODkyN15BMl5BanBnXkFtZTcwNTU4NTc4OQ@@._V1_SX300.jpg",
                            "metaScore": 97,
                            "imdbRating": 8.1,
                            "imdbVotes": 401573,
                            "imdbId": "tt2024544",
                            "type": "movie"
                        }];
                })
                .catch(function(error) {
                    console.log(error);
                });
            titleService.getTypes()
                .then(function(data){
                    titleListVm.types=['Movie','Series'];
                })
                .catch(function(error) {
                    console.log(error);
                });
            titleService.getYears()
                .then(function(data){
                    titleListVm.years=['2015','2014','2013','2012'];
                })
                .catch(function(error) {
                    console.log(error);
                });
            titleService.getGenres()
                .then(function(data){
                    titleListVm.genres=['Drama','Thriller','Romantic','Horror'];
                })
                .catch(function(error) {
                    console.log(error);
                });
        }
        function setFilter(filterName){
            titleListVm.searchText = filterName;
        }
       function deleteDialog() {
           console.log("here");
           titleListVm.showModal = !titleListVm.showModal;
        };

    }
})();
