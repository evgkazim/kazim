package ru.kazim.spring.event;

import ru.kazim.spring.event.config.TestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.web.servlet.MockMvc;
import ru.kazim.spring.event.postgres.PostgresInitializer;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
@ContextConfiguration(
        initializers = PostgresInitializer.class,
        classes = TestContext.class)
@AutoConfigureMockMvc
public class AbstractIntegrationTest extends AbstractTestNGSpringContextTests {
    @Autowired
    protected MockMvc mockMvc;
}
