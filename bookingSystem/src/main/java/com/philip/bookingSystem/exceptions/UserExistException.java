package com.philip.bookingSystem.exceptions;

public class UserExistException extends BookingAppException {
    public UserExistException(String message){
        super(message);
    }
}
