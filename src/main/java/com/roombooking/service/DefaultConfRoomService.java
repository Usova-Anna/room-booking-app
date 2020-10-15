package com.roombooking.service;

import com.roombooking.model.ConfRoom;
import com.roombooking.repository.ConfRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultConfRoomService implements ConfRoomService {

    private ConfRoomRepository confRoomRepository;

    private ConfRoomValidator confRoomValidator;

    @Autowired
    public DefaultConfRoomService(ConfRoomRepository confRoomRepository, ConfRoomValidator confRoomValidator) {
        this.confRoomRepository = confRoomRepository;
        this.confRoomValidator = confRoomValidator;
    }

    @Override
    public void save(ConfRoom confRoom) {
        System.out.println("Saving to Data Base (DefaultConfRoomService)");
        confRoomRepository.save(confRoom);
    }

    @Override
    public List<ConfRoom> findAll() {
        System.out.println("Finding all (DefaultConfRoomService)");
        return confRoomRepository.findAll();
    }
}
