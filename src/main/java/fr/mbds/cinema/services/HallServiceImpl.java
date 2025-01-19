package fr.mbds.cinema.services;

import fr.mbds.cinema.repositories.HallRepository;
import fr.mbds.cinema.entities.Hall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class HallServiceImpl implements IHallService {

    @Autowired
    private HallRepository hallRepository;

    @Override
    public List<Hall> getAllHalls() {
        return hallRepository.findAll();
    }

    @Override
    public Hall getHallById(Long id) {
        return hallRepository.findById(id).orElse(null);
    }

    @Override
    public Hall saveHall(Hall Hall) {
        return hallRepository.save(Hall);
    }

    @Override
    public void deleteHall(Long id) {
        hallRepository.deleteById(id);
    }

    @Override
    public Hall updateHall(Long id, Hall Hall) {
        return hallRepository.save(Hall);
    }
}
