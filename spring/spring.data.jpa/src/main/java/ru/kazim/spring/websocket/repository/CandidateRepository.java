package ru.kazim.spring.websocket.repository;

import org.springframework.data.repository.CrudRepository;
import ru.kazim.spring.websocket.entity.Candidate;

import java.util.List;

public interface CandidateRepository extends CrudRepository<Candidate, Integer> {

    @Override
    List<Candidate> findAll();

    List<Candidate> findByStatusIsNull();
}
