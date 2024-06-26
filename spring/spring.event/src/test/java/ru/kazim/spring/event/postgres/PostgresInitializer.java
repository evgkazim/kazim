package ru.kazim.spring.event.postgres;

import com.github.dockerjava.api.model.ExposedPort;
import com.github.dockerjava.api.model.HostConfig;
import com.github.dockerjava.api.model.PortBinding;
import com.github.dockerjava.api.model.Ports;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.testcontainers.containers.PostgreSQLContainer;

import static org.testcontainers.containers.PostgreSQLContainer.POSTGRESQL_PORT;

public class PostgresInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    private static PostgreSQLContainer postgresContainer;

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        if (PostgresInitializer.postgresContainer == null) {
            PostgresInitializer.postgresContainer = new PostgreSQLContainer<>("postgres:14.2")
                .withDatabaseName("test")
                .withCreateContainerCmdModifier(cmd -> cmd.withHostConfig(new HostConfig().withPortBindings(new PortBinding(Ports.Binding.bindPort(15432), new ExposedPort(5432)))));
            PostgresInitializer.postgresContainer.start();
        }
        System.setProperty("POSTGRES_HOST", PostgresInitializer.postgresContainer.getHost());
        System.setProperty("POSTGRES_PORT", PostgresInitializer.postgresContainer.getMappedPort(POSTGRESQL_PORT).toString());
        System.setProperty("POSTGRES_USERNAME", PostgresInitializer.postgresContainer.getUsername());
        System.setProperty("POSTGRES_PASSWORD", PostgresInitializer.postgresContainer.getPassword());
        System.out.printf("psql.exe postgresql://%s:%s@%s:%s/test%n",
            PostgresInitializer.postgresContainer.getUsername(),
            PostgresInitializer.postgresContainer.getPassword(),
            PostgresInitializer.postgresContainer.getHost(),
            PostgresInitializer.postgresContainer.getMappedPort(POSTGRESQL_PORT).toString());
}
}
