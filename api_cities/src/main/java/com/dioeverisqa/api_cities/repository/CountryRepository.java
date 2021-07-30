package com.dioeverisqa.api_cities.repository;

import com.dioeverisqa.api_cities.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
