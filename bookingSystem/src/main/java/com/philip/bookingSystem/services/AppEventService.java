package com.philip.bookingSystem.services;

import com.philip.bookingSystem.dtos.requests.CreateEventRequest;
import com.philip.bookingSystem.model.Event;
import com.philip.bookingSystem.repositories.EventRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AppEventService implements EventService{
    @Autowired
    private EventRepository repository;
    ModelMapper modelMapper = new ModelMapper();
    @Override
    public void createEvent(CreateEventRequest eventRequest) {
        Event event = new Event();
        event.setName(eventRequest.getName());
        event.setDate(eventRequest.getDate());
        event.setAvailableAttendeeCount(eventRequest.getAvailableAttendeesCount());
        event.setCategory(eventRequest.getCategory());
        event.setEventDescription(eventRequest.getDescription());
        repository.save(event);
        modelMapper.map(event, Event.class);

    }

    @Override
    public Optional<Event> findEvent(String eventName) {
        return repository.findByName(eventName);
    }

    @Override
    public List<Event> findAll() {
        return repository.findAll();
    }
}
