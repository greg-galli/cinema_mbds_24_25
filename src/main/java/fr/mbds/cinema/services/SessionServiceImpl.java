package fr.mbds.cinema.services;

import fr.mbds.cinema.repositories.SessionRepository;
import fr.mbds.cinema.entities.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class SessionServiceImpl implements ISessionService {

    @Autowired
    private SessionRepository sessionRepository;

    @Override
    public List<Session> getAllSessions() {
        return sessionRepository.findAll();
    }

    @Override
    public Session getSessionById(Long id) {
        return sessionRepository.findById(id).orElse(null);
    }

    @Override
    public Session saveSession(Session Session) {
        return sessionRepository.save(Session);
    }

    @Override
    public void deleteSession(Long id) {
        sessionRepository.deleteById(id);
    }

    @Override
    public Session updateSession(Long id, Session Session) {
        return sessionRepository.save(Session);
    }
}
