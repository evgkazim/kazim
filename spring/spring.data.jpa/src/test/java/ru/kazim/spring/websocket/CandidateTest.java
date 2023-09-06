package ru.kazim.spring.websocket;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import ru.kazim.spring.websocket.entity.Candidate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CandidateTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Value("${local.server.port}")
    private int port;

    @Test
    void testAllCandidates() {
        ResponseEntity<Candidate[]> candidates = restTemplate.getForEntity("http://localhost:" + port + "/candidates", Candidate[].class);
        assertEquals(3, candidates.getBody().length);
    }
    @Test
    void testNullStatusCandidates() {
        ResponseEntity<Candidate[]> candidates = restTemplate.getForEntity("http://localhost:" + port + "/candidates-no-status", Candidate[].class);
        System.out.println(candidates);
        assertEquals(1, candidates.getBody().length);
    }
}
