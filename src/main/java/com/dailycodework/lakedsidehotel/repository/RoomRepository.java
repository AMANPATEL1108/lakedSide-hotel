package com.dailycodework.lakedsidehotel.repository;

import com.dailycodework.lakedsidehotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
