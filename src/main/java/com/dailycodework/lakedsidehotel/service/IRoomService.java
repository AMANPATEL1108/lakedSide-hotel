package com.dailycodework.lakedsidehotel.service;

import com.dailycodework.lakedsidehotel.model.Room;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public interface IRoomService {
    Room addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice) throws IOException;

    List<String> getAllRoomTypes();
}
