package com.dioeverisqa.api_cities.resource;

import com.dioeverisqa.api_cities.exception.CountryNotFoundException;
import com.dioeverisqa.api_cities.model.Country;
import com.dioeverisqa.api_cities.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public Page<Country> allCountries(Pageable page) {
        return countryService.allCountries(page);
    }

    @GetMapping("/{id}")
    public Country findById(@PathVariable Long id) throws CountryNotFoundException {
        return countryService.findById(id);
    }
}
