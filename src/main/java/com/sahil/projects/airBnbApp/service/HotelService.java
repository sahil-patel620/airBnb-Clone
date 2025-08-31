package com.sahil.projects.airBnbApp.service;

import com.sahil.projects.airBnbApp.dto.HotelDto;

public interface HotelService {

    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

    HotelDto updateHotelById(Long id, HotelDto hotelDto);

    void deleteHotelById(Long id);

    void activateHotelById(Long hotelId);
}
