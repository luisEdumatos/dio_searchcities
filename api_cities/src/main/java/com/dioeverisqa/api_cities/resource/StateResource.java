package com.dioeverisqa.api_cities.resource;

import com.dioeverisqa.api_cities.exception.StateNotFoundException;
import com.dioeverisqa.api_cities.model.State;
import com.dioeverisqa.api_cities.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StateResource {

    @Autowired
    private StateService stateService;

    @GetMapping
    public Page<State> allStaties(Pageable page) {
        return stateService.allStaties(page);
    }

    @GetMapping("/{id}")
    public State findById(@PathVariable Long id) throws StateNotFoundException {
        return stateService.findById(id);
    }
}
