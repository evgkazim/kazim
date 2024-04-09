package ru.kazim.spring.event.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.RequiredArgsConstructor;
import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DelegatingDataSource;

import javax.sql.DataSource;

@Configuration
@RequiredArgsConstructor
public class FlywayConfig {
    @Value("${jdbc.driver.class.name}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.user}")
    private String user;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    DataSource dataSource() {
        final HikariConfig config = new HikariConfig();
        config.setAutoCommit(true);
        config.setJdbcUrl(url);
        config.setPassword(password);
        config.setUsername(user);
        config.setDriverClassName(driverClassName);
        config.setMaximumPoolSize(10);
        config.setRegisterMbeans(true);
        return new DelegatingDataSource(new HikariDataSource(config));
    }

    @Bean(initMethod = "migrate")
    Flyway flyway() {
        return Flyway.configure()
                .dataSource(dataSource())
                .schemas("test")
                .baselineOnMigrate(true)
                .locations("classpath:migration")
                .mixed(true)
                .group(true)
                .load();
    }
}
