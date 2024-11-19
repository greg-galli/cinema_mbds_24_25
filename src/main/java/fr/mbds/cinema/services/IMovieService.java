package fr.mbds.cinema.services;

import fr.mbds.cinema.entities.Movie;

import java.util.List;

public interface IMovieService {
    public List<Movie> getAllMovies();
    public Movie getMovieById(Long id);
    public Movie saveMovie(Movie movie);
    public void deleteMovie(Long id);
    public Movie updateMovie(Long id, Movie movie);
}
