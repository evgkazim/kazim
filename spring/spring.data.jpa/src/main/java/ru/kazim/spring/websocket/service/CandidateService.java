package ru.kazim.spring.websocket.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kazim.spring.websocket.entity.Candidate;
import ru.kazim.spring.websocket.repository.CandidateRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CandidateService {

    private final CandidateRepository candidateRepository;

    @Transactional
    public List<Candidate> getAllCandidates() {
        return candidateRepository.findAll();
    }

    public List<Candidate> getAllCandidatesWithNoStatus() {
        return candidateRepository.findByStatusIsNull();
    }
}
