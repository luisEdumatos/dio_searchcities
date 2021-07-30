package com.dioeverisqa.api_cities.service;

import com.dioeverisqa.api_cities.model.Country;
import com.dioeverisqa.api_cities.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Page<Country> allCountries(Pageable page) {
        return countryRepository.findAll(page);
    }
}
