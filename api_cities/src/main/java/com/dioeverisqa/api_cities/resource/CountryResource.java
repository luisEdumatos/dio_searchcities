package com.dioeverisqa.api_cities.resource;

import com.dioeverisqa.api_cities.model.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @GetMapping
    public List<Country> allCountries() {
        return null;
    }
}
