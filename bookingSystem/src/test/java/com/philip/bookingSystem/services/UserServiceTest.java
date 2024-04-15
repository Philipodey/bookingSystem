package com.philip.bookingSystem.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.philip.bookingSystem.dtos.requests.CreateEventRequest;
import com.philip.bookingSystem.exceptions.InvalidDetailsException;
import com.philip.bookingSystem.exceptions.InvalidEventDetail;
import com.philip.bookingSystem.exceptions.UserExistException;
import com.philip.bookingSystem.model.EventCategory;
import com.philip.bookingSystem.repositories.EventRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    UserService userService;
    @Autowired
    EventRepository eventRepository;
    private static final ObjectMapper mapper = new ObjectMapper();

    UserRegistrationRequest request = new UserRegistrationRequest();

    @BeforeEach
    public void doThisBeforeEachTest(){
        request.setEmail("test@gmail.com");
        request.setPassword("Password@%1234");



    }

    @Test
    public void createAccountTest() throws Exception {
        RegisterResponse response =
                userService.registerUser(request);
        assertNotNull(response);
        assertNotNull(response.getId());
    }

    @Test
    public void createEventTest() throws UserExistException, InvalidDetailsException {
        RegisterResponse response =
                userService.registerUser(request);
        assertNotNull(response.getId());

        CreateEventRequest eventRequest = new CreateEventRequest();
        eventRequest.setName("pray till the devil answer");
        eventRequest.setDate("02-04-2024");
        eventRequest.setDescription("The event will be very nice");
        eventRequest.setAvailableAttendeesCount(45);
        eventRequest.setCategory(EventCategory.CONFERENCE);
        userService.createEvent(eventRequest);
        assertEquals(eventRepository.count(), 1);
    }

    @Test
    public void searchTest() throws InvalidEventDetail {
        userService.reserveTicket("pray till the devil answer", "Concert");
    }

}
