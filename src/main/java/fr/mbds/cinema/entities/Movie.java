package fr.mbds.cinema.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Movie {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long visa;

    private String title;

    private String director;

    private int duration;

    private String synopsis;

    private String posterFileName;

    private String releaseDate;

    @OneToMany(mappedBy = "movie")
    private List<Session> sessions;
}
