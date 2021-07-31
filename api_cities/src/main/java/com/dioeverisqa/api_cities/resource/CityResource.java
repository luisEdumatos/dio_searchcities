package com.dioeverisqa.api_cities.resource;

import com.dioeverisqa.api_cities.exception.CityNotFoundException;
import com.dioeverisqa.api_cities.model.City;
import com.dioeverisqa.api_cities.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityResource {

    @Autowired
    private CityService cityService;

    @GetMapping
    public Page<City> allCities(Pageable page) {
        return cityService.allCities(page);
    }

    @GetMapping("/{id}")
    public City findById(@PathVariable Long id) throws CityNotFoundException {
        return cityService.findById(id);
    }
}
