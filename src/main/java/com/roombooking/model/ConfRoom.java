package com.roombooking.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class ConfRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Integer roomId;
    @Column(name = "room_name")
    private String roomName;
    @Column(name = "capacity_max")
    private int capacityMax;
    @Column(name = "chairs")
    private int chairs;

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {

        this.roomName = roomName;
    }

    public int getCapacityMax() {
        return capacityMax;
    }

    public void setCapacityMax(int capacityMax) {

        this.capacityMax = capacityMax;
    }

    public int getChairs() {
        return chairs;
    }

    public void setChairs(int chairs) {

        this.chairs = chairs;
    }

    @Override
    public boolean equals(Object o) {
        if (this
            == o) return true;
        if (!(o instanceof ConfRoom)) return false;
        ConfRoom confRoom = (ConfRoom) o;
        return capacityMax
               == confRoom.capacityMax
               && chairs
                  == confRoom.chairs
               && roomId.equals(confRoom.roomId)
               && roomName.equals(confRoom.roomName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomId, roomName, capacityMax, chairs);
    }

    @Override
    public String toString() {
        return "Conference Room{"
               + "roomId="
               + roomId
               + ", roomName='"
               + roomName
               + '\''
               + ", capacityMax="
               + capacityMax
               + ", chairs="
               + chairs
               + '}';
    }
}
