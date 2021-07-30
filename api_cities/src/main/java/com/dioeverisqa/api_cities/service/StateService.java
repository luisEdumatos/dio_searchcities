package com.dioeverisqa.api_cities.service;

import com.dioeverisqa.api_cities.exception.StateNotFoundException;
import com.dioeverisqa.api_cities.model.State;
import com.dioeverisqa.api_cities.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public Page<State> allStaties(Pageable page) {
        return stateRepository.findAll(page);
    }

    public State findById(Long id) throws StateNotFoundException {
        Optional<State> optionalState = stateRepository.findById(id);
        if (optionalState.isEmpty()) {
            throw new StateNotFoundException(id);
        } else {
            return optionalState.get();
        }
    }
}
