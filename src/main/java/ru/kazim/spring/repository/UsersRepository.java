package ru.kazim.spring.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.kazim.spring.entity.UsersEntity;

import java.util.List;

@Repository
public interface UsersRepository extends CrudRepository<UsersEntity, Integer> {
    @EntityGraph(value = "users-entity-graph")
    List<UsersEntity> findAll();
}
