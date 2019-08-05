package com.kanika.knowyourshow.app.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchResponse {

    @JsonProperty("Title")
    private  String title;

    @JsonProperty("Year")
    private  String year;

    @JsonProperty("Rated")
    private  String rated;

    @JsonProperty("Released")
    private  String released;

    @JsonProperty("Runtime")
    private  String runtime;

    @JsonProperty("Genre")
    private  String genre;

    @JsonProperty("Director")
    private  String director;

    @JsonProperty("Writer")
    private  String writer;

    @JsonProperty("Actors")
    private  String actors;

    @JsonProperty("Plot")
    private  String plot;

    @JsonProperty("Language")
    private  String language;

    @JsonProperty("Country")
    private  String country;

    @JsonProperty("Awards")
    private  String awards;

    @JsonProperty("Poster")
    private  String poster;

    @JsonProperty("Ratings")
    private List<Rating> ratings;

    @JsonProperty("Metascore")
    private  String metaScore;

    private  String imdbRating;

    private  String imdbVotes;

    private  String imdbID;

    @JsonProperty("Type")
    private  String type;

    private  String totalSeasons;

    @JsonProperty("Response")
    private  String response;

    @JsonProperty("Error")
    private String error;
}
