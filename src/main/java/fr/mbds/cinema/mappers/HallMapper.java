package fr.mbds.cinema.mappers;

import fr.mbds.cinema.dtos.HallDto;
import fr.mbds.cinema.entities.Hall;

import java.util.List;
import java.util.stream.Collectors;

public class HallMapper {

    public static HallDto toDto(Hall hall) {
        return HallDto.builder()
                .id(hall.getId())
                .name(hall.getName())
                .capacity(hall.getCapacity())
                .sessions(hall.getSessions())
                .build();
    }

    public static Hall toEntity(HallDto hallDto) {
        return Hall.builder()
                .id(hallDto.getId())
                .name(hallDto.getName())
                .capacity(hallDto.getCapacity())
                .sessions(hallDto.getSessions())
                .build();
    }

    public static List<Hall> toEntities(List<HallDto> hallDtos) {
        return hallDtos
                .stream()
                .map(HallMapper::toEntity)
                .collect(Collectors.toList());
    }

    public static List<HallDto> toDtos(List<Hall> halls) {
        return halls
                .stream()
                .map(HallMapper::toDto)
                .collect(Collectors.toList());
    }
}
