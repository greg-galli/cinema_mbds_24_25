package fr.mbds.cinema.services;

import fr.mbds.cinema.repositories.MovieRepository;
import fr.mbds.cinema.entities.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class MovieServiceImpl implements IMovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElse(null);
    }

    @Override
    public Movie saveMovie(Movie Movie) {
        return movieRepository.save(Movie);
    }

    @Override
    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }

    @Override
    public Movie updateMovie(Long id, Movie Movie) {
        return movieRepository.save(Movie);
    }
}
