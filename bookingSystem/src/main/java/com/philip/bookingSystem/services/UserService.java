package com.philip.bookingSystem.services;

import com.philip.bookingSystem.dtos.requests.CreateEventRequest;
import com.philip.bookingSystem.exceptions.InvalidDetailsException;
import com.philip.bookingSystem.exceptions.InvalidEventDetail;
import com.philip.bookingSystem.exceptions.UserExistException;

public interface UserService {

    RegisterResponse registerUser(UserRegistrationRequest request) throws InvalidDetailsException, UserExistException;

    void createEvent(CreateEventRequest eventRequest);

    void reserveTicket(String eventName, String eventCategory) throws InvalidEventDetail;
}
