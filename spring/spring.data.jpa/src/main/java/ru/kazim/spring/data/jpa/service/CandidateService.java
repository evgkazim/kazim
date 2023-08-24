package ru.kazim.spring.data.jpa.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kazim.spring.data.jpa.entity.Candidate;
import ru.kazim.spring.data.jpa.repository.CandidateRepository;
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
