package com.dioeverisqa.api_cities.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StateNotFoundException extends Exception{
    public StateNotFoundException(Long id) {
        super("State not found with ID: " + id);
    }
}
