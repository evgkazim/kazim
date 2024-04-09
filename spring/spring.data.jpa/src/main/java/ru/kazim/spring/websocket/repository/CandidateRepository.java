package ru.kazim.spring.websocket.repository;

import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.repository.CrudRepository;
import ru.kazim.spring.websocket.entity.Candidate;

import java.util.List;

public interface CandidateRepository extends CrudRepository<Candidate, Integer> {

    @Override
    @Lock(LockModeType.OPTIMISTIC)
    List<Candidate> findAll();

    List<Candidate> findByStatusIsNull();
}
