//package ru.kazim.spring.main.repository;
//
//import org.springframework.data.jpa.repository.EntityGraph;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
//import ru.kazim.spring.main.entity.UsersEntity;
//
//import java.util.List;
//
//@Repository
//public interface UsersRepository extends CrudRepository<UsersEntity, Integer> {
//    @EntityGraph(value = "users-entity-graph")
//    List<UsersEntity> findAll();
//}
