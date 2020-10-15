package com.roombooking;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class RoomBookingAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoomBookingAppApplication.class, args);
    }

}
