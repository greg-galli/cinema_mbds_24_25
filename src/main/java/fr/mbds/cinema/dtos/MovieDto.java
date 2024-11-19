package fr.mbds.cinema.dtos;

import fr.mbds.cinema.entities.Session;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data @Builder
@Component
public class MovieDto {
    private Long visa;

    private String title;

    private String director;

    private int duration;

    private String synopsis;

    private String posterFileName;

    private String releaseDate;

    private List<Session> sessions;
}
