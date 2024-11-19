package fr.mbds.cinema.dtos;

import fr.mbds.cinema.entities.Session;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data @Builder
public class HallDto {
    private Long id;

    private String name;

    private int capacity;

    private List<Session> sessions;
}
