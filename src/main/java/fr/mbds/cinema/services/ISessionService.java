package fr.mbds.cinema.services;

import fr.mbds.cinema.entities.Session;

import java.util.List;

public interface ISessionService {
    public List<Session> getAllSessions();
    public Session getSessionById(Long id);
    public Session saveSession(Session Session);
    public void deleteSession(Long id);
    public Session updateSession(Long id, Session Session);
}
