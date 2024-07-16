package com.dailycodework.lakedsidehotel.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_booked", nullable = false)
    private boolean isBooked = false;

    @Lob
    @Column(name = "photo")
    private byte[] photo;

    @Column(name = "room_price", nullable = false)
    private BigDecimal roomPrice;

    @Column(name = "room_type", nullable = false)
    private String roomType;
}