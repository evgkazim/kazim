package ru.kazim.spring.data.jpa.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ru.kazim.spring.data.jpa.entity.Candidate;

import java.util.List;

public interface CandidateRepository extends CrudRepository<Candidate, Integer> {

    @Override
    List<Candidate> findAll();

    List<Candidate> findByStatusIsNull();
}
