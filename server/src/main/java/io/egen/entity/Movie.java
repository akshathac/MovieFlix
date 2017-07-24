package io.egen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table
@NamedQueries({
    @NamedQuery(name = "Movie.findAll",
                query = "SELECT emp FROM Movie emp ORDER BY emp.title DESC"),
    @NamedQuery(name = "Movie.findByEmail",
                query = "SELECT emp FROM Employee emp WHERE emp.email=:paramEmail")
})
public class Movie {
	@Id
    @Column(columnDefinition = "VARCHAR(36)")
	private String id;
	private String title;
	private String poster;
	private String plot;
	private String language;
	private String country;
	private String artistID;
	private String calenderID;
	private String movieGenreId;
	private String movieImdbId;
	private String movieType;

	public String getArtistID() {
		return artistID;
	}

	public void setArtistID(String artistID) {
		this.artistID = artistID;
	}

	public String getCalenderID() {
		return calenderID;
	}

	public void setCalenderID(String calenderID) {
		this.calenderID = calenderID;
	}

	public String getMovieGenreId() {
		return movieGenreId;
	}

	public void setMovieGenreId(String movieGenreId) {
		this.movieGenreId = movieGenreId;
	}

	public String getMovieImdbId() {
		return movieImdbId;
	}

	public void setMovieImdbId(String movieImdbId) {
		this.movieImdbId = movieImdbId;
	}

	public String getMovieType() {
		return movieType;
	}

	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}

	
	
	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

}
