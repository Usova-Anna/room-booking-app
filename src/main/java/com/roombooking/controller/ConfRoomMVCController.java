package com.roombooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/room")
public class ConfRoomMVCController {

    @GetMapping("/showtable")
    String getAllRoomsTable() {

        return "index";
    }
}
