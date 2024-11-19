package fr.mbds.cinema.dtos;

import fr.mbds.cinema.entities.Hall;
import fr.mbds.cinema.entities.Movie;
import lombok.Builder;
import lombok.Data;

@Data @Builder
public class SessionDto {
    private Long id;

    private String date;

    private String time;

    private Movie movie;

    private Hall hall;
}
