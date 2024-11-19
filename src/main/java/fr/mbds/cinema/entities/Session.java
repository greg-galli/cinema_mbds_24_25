package fr.mbds.cinema.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Session {
    @Id
    private Long id;

    private String date;

    private String time;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Hall hall;
}
