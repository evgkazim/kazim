package ru.kazim.spring.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kazim.spring.main.entity2.FlightsEntity;

@Repository
public interface FlightsRepository extends JpaRepository<FlightsEntity, Long> {}
