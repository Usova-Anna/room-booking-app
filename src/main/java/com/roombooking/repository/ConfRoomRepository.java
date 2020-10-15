package com.roombooking.repository;


import com.roombooking.model.ConfRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfRoomRepository extends JpaRepository<ConfRoom, Integer> {
}
