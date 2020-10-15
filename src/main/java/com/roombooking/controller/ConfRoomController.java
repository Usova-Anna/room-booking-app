package com.roombooking.controller;

import com.roombooking.model.ConfRoom;
import com.roombooking.service.ConfRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/rooms")
public class ConfRoomController {

    @Autowired
    private ConfRoomService confRoomService;

    @GetMapping("/show")
    List<ConfRoom> getAllRooms() {
        return confRoomService.findAll();
    }


    @PostMapping("/add")
    ResponseEntity<Void> createConfRoom(@RequestBody ConfRoom room) {
        confRoomService.save(room);
        return ResponseEntity.ok().build();
    }

}
