package com.dioeverisqa.api_cities.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CountryNotFoundException extends Exception{
    public CountryNotFoundException(Long id) {
        super("Country not found with ID " + id);
    }
}
