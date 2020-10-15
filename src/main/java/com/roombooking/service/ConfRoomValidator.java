package com.roombooking.service;

import com.roombooking.exception.ModelValidationException;
import com.roombooking.model.ConfRoom;
import org.springframework.stereotype.Service;

@Service
public class ConfRoomValidator {
    public void validateRoom(ConfRoom room) throws ModelValidationException {
        if (room.getRoomName() == null) {
            throw new ModelValidationException("Room should have a name");
        }
        if (room.getRoomName().length() > 50) {
            throw new ModelValidationException("Room name should be shorter than 50 symbols");
        }
        if (room.getCapacityMax() < 3) {
            throw new ModelValidationException(
                    "A conference room should accommodate more than " + room.getCapacityMax() + "people");
        }
        if (room.getChairs() < 0) {
            throw new ModelValidationException("Number of chairs should be 0 or more");
        }
    }
}
