package com.sahil.projects.airBnbApp.service;

import ch.qos.logback.core.model.Model;
import com.sahil.projects.airBnbApp.dto.RoomDto;
import com.sahil.projects.airBnbApp.entity.Room;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class RoomServiceImpl implements  RoomService{

    private  final RoomService roomService;
    private  final ModelMapper modelMapper;

    @Override
    public RoomDto createNewRoom(Long hotelId, RoomDto roomDto) {
        log.info("Creating a new room in hotel with ID: {}", hotelId);
        Room room = modelMapper.map(roomDto, Room.class);
    }

    @Override
    public List<RoomDto> getAllRoomsInHotel(Long hotelId) {
        return List.of();
    }

    @Override
    public RoomDto getRoomById(Long roomId) {
        return null;
    }

    @Override
    public void deleteRoomById(Long roomId) {

    }
}
