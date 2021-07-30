package com.dioeverisqa.api_cities.repository;

import com.dioeverisqa.api_cities.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
