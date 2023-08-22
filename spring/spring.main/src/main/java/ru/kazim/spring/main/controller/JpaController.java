package ru.kazim.spring.main.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.kazim.spring.main.entity2.FlightsEntity;
import ru.kazim.spring.main.repository.FlightsRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping(path = "/jpa", produces = "application/json")
@RequiredArgsConstructor
public class JpaController {

    private final FlightsRepository flightsRepository;

    @GetMapping(path = "/flights")
    public Object read(@PathVariable(required = false) String id) {
        return flightsRepository.findAll().stream().filter(x -> x.getFlight_no().equals("PG0405")).collect(Collectors.toList());
//        flightsRepository.findAll().stream().parallel().
    }
}
