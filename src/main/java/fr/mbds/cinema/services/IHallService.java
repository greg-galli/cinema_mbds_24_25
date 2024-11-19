package fr.mbds.cinema.services;

import fr.mbds.cinema.entities.Hall;

import java.util.List;

public interface IHallService {
    public List<Hall> getAllHalls();
    public Hall getHallById(Long id);
    public Hall saveHall(Hall Hall);
    public void deleteHall(Long id);
    public Hall updateHall(Long id, Hall Hall);
}
