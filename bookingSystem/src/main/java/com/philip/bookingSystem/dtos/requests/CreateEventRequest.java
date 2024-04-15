package com.philip.bookingSystem.dtos.requests;

import com.philip.bookingSystem.model.EventCategory;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class CreateEventRequest {
    private String name;
    private String date;
    private int availableAttendeesCount;
    private String description;
    private EventCategory category;

}
