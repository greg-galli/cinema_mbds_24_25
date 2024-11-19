package fr.mbds.cinema.mappers;

import fr.mbds.cinema.dtos.SessionDto;
import fr.mbds.cinema.entities.Session;

import java.util.List;
import java.util.stream.Collectors;

public class SessionMapper {
    public static SessionDto toDto(Session session) {
        return SessionDto.builder()
                .id(session.getId())
                .date(session.getDate())
                .time(session.getTime())
                .movie(session.getMovie())
                .hall(session.getHall())
                .build();
    }

    public static Session toEntity(SessionDto sessionDto) {
        return Session.builder()
                .id(sessionDto.getId())
                .date(sessionDto.getDate())
                .time(sessionDto.getTime())
                .movie(sessionDto.getMovie())
                .hall(sessionDto.getHall())
                .build();
    }

    public static List<Session> toEntities(List<SessionDto> sessionDtos) {
        return sessionDtos
                .stream()
                .map(SessionMapper::toEntity)
                .collect(Collectors.toList());
    }

    public static List<SessionDto> toDtos(List<Session> sessions) {
        return sessions
                .stream()
                .map(SessionMapper::toDto)
                .collect(Collectors.toList());
    }
}

