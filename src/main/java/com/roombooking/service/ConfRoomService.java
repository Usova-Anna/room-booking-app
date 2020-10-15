package com.roombooking.service;

import com.roombooking.model.ConfRoom;


import java.util.List;

public interface ConfRoomService {
    void save(ConfRoom confRoom);
    List<ConfRoom> findAll();
}
