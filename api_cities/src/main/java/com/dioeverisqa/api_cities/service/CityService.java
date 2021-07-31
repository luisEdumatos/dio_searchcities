package com.dioeverisqa.api_cities.service;

import com.dioeverisqa.api_cities.exception.CityNotFoundException;
import com.dioeverisqa.api_cities.model.City;
import com.dioeverisqa.api_cities.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public Page<City> allCities(Pageable page) {
        return cityRepository.findAll(page);
    }

    public City findById(Long id) throws CityNotFoundException {
        Optional<City> optionalCity = cityRepository.findById(id);
        if (optionalCity.isEmpty()) {
            throw new CityNotFoundException(id);
        } else {
            return optionalCity.get();
        }
    }
}
