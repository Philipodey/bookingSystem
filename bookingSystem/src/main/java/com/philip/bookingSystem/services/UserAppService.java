package com.philip.bookingSystem.services;

import com.philip.bookingSystem.dtos.requests.CreateEventRequest;
import com.philip.bookingSystem.dtos.response.EventRegisterResponse;
import com.philip.bookingSystem.exceptions.InvalidDetailsException;
import com.philip.bookingSystem.exceptions.InvalidEventDetail;
import com.philip.bookingSystem.exceptions.UserExistException;
import com.philip.bookingSystem.model.Event;
import com.philip.bookingSystem.model.EventCategory;
import com.philip.bookingSystem.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.philip.bookingSystem.utils.Verification.VerifyDetails.verifyEmail;
import static com.philip.bookingSystem.utils.Verification.VerifyDetails.verifyPassword;

@Service
public class UserAppService implements UserService{

    @Autowired
    UserRepository userRepository;
    @Autowired
    EventService eventService;

    ModelMapper modelMapper = new ModelMapper();

    @Override
    public RegisterResponse registerUser(UserRegistrationRequest request) throws InvalidDetailsException, UserExistException {
        User user = new User();
        if(userExist(request.getEmail())) throw new UserExistException(request.getEmail()+" already exist");
        if(!verifyEmail(request.getEmail())) throw new InvalidDetailsException("Invalid email format input email with the right format");
        if (!verifyPassword(request.getPassword())) throw new InvalidDetailsException("Invalid password format\nInput password with character letters and numbers");
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setName(request.getName());
        User newUser = modelMapper.map(user, User.class);
        userRepository.save(newUser);
//        user.setReadingList(readingListService.create());
        RegisterResponse response = new RegisterResponse();
        response.setId(user.getId());
        return response;
    }

    @Override
    public void createEvent(CreateEventRequest eventRequest) {
        eventService.createEvent(eventRequest);
    }

    @Override
    public void reserveTicket(String eventName, String eventCategory) throws InvalidEventDetail {
        Optional<Event>  foundEvent = eventService.findEvent(eventName);
        String category;
        for (EventCategory event: ) {

        }
        if(eventCategory.matches(EventCategory.values().toString()))

    }

    private boolean eventExist(String eventName) {
        Optional<Event> event = eventService.findEvent(eventName);
        return event.isPresent();
    }

    private boolean userExist(String email) {
        Optional<User> client = userRepository.findUserByEmail(email);
        return client.isPresent();
    }
}
