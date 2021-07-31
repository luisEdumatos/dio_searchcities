package com.dioeverisqa.api_cities.repository;

import com.dioeverisqa.api_cities.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
