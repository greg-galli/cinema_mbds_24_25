package fr.mbds.cinema.repositories;

import fr.mbds.cinema.entities.Hall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallRepository extends JpaRepository<Hall, Long> {
}
