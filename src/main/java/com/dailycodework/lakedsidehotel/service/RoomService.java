package com.dailycodework.lakedsidehotel.service;

import com.dailycodework.lakedsidehotel.model.Room;
import com.dailycodework.lakedsidehotel.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class RoomService implements IRoomService {

    private final RoomRepository roomRepository;

    @Override
    public Room addNewRoom(MultipartFile file, String roomType, BigDecimal roomPrice) throws IOException {
        Room room = new Room();
        room.setRoomType(roomType);
        room.setRoomPrice(roomPrice);
        if (file != null && !file.isEmpty()) {
            room.setPhoto(file.getBytes());
        }
        return roomRepository.save(room);
    }
}
