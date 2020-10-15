package com.roombooking.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class RoomBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Integer bookingId;
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "room_id")
    private ConfRoom confRoom;
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "client_id")
    private Client client;
    @Column(name = "date_creation")
    private LocalDateTime dateCreation;
    @Column(name = "event_name")
    private String eventName;

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public ConfRoom getConfRoom() {
        return confRoom;
    }

    public void setConfRoom(ConfRoom confRoom) {
        this.confRoom = confRoom;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoomBooking)) return false;
        RoomBooking that = (RoomBooking) o;
        return bookingId.equals(that.bookingId) && confRoom.equals(that.confRoom) && client.equals(that.client)
               && dateCreation.equals(that.dateCreation) && eventName.equals(that.eventName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, confRoom, client, dateCreation, eventName);
    }

    @Override
    public String toString() {
        return "RoomBooking{" + "bookingId=" + bookingId + ", dateCreation=" + dateCreation + ", eventName='"
               + eventName + '\'' + '}';
    }
}
