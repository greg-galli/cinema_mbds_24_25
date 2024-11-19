package fr.mbds.cinema.mappers;

import fr.mbds.cinema.dtos.MovieDto;
import fr.mbds.cinema.dtos.SessionDto;
import fr.mbds.cinema.entities.Movie;
import fr.mbds.cinema.entities.Session;

import java.util.List;
import java.util.stream.Collectors;

public class MovieMapper {

    public static MovieDto toDto(Movie movie) {
        return MovieDto.builder()
                .visa(movie.getVisa())
                .title(movie.getTitle())
                .synopsis(movie.getSynopsis())
                .director(movie.getDirector())
                .releaseDate(movie.getReleaseDate())
                .posterFileName(movie.getPosterFileName())
                .sessions(movie.getSessions())
                .duration(movie.getDuration())
                .build();
    }

    public static Movie toEntity(MovieDto movieDto) {
        return Movie.builder()
                .visa(movieDto.getVisa())
                .title(movieDto.getTitle())
                .synopsis(movieDto.getSynopsis())
                .director(movieDto.getDirector())
                .releaseDate(movieDto.getReleaseDate())
                .posterFileName(movieDto.getPosterFileName())
                .sessions(movieDto.getSessions())
                .duration(movieDto.getDuration())
                .build();
    }

    public static List<Movie> toEntities(List<MovieDto> sessionDtos) {
        return sessionDtos
                .stream()
                .map(MovieMapper::toEntity)
                .collect(Collectors.toList());
    }

    public static List<MovieDto> toDtos(List<Movie> sessions) {
        return sessions
                .stream()
                .map(MovieMapper::toDto)
                .collect(Collectors.toList());
    }

}
