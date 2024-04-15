package com.philip.bookingSystem.services;

import com.philip.bookingSystem.dtos.requests.CreateEventRequest;
import com.philip.bookingSystem.model.Event;

import java.util.List;
import java.util.Optional;

public interface EventService {

    void createEvent(CreateEventRequest eventRequest);

    Optional<Event> findEvent(String eventName);

    List<Event> findAll();
}
