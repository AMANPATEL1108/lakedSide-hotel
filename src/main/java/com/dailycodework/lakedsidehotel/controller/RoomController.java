package com.dailycodework.lakedsidehotel.controller;


import java.math.BigDecimal;
import java.sql.SQLException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dailycodework.lakedsidehotel.model.Room;
import com.dailycodework.lakedsidehotel.response.RoomResponse;
import com.dailycodework.lakedsidehotel.service.IRoomService;

import io.jsonwebtoken.io.IOException;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author amanp
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/rooms")
public class RoomController {

    private final IRoomService roomService;

    @PostMapping("/add/new-room")
    public ResponseEntity<RoomResponse> addNewRoom(
            @RequestParam("photo") MultipartFile photo,
            @RequestParam("roomType") String roomType,
            @RequestParam("roomPrice") BigDecimal roomPrice) throws SQLException, IOException, java.io.IOException {

        Room savedRoom = roomService.addNewRoom(photo, roomType, roomPrice);

        RoomResponse response = new RoomResponse(savedRoom.getId(), savedRoom.getRoomType(), savedRoom.getRoomPrice());
        System.out.println(response);
        return ResponseEntity.ok(response);
    }


}