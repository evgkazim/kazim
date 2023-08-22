//package ru.kazim.spring.main.service;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//import ru.kazim.spring.main.entity.GroupEntity;
//import ru.kazim.spring.main.entity.UsersEntity;
//import ru.kazim.spring.main.repository.UsersRepository;
//
//import java.sql.SQLException;
//
//@Service
//@RequiredArgsConstructor
//public class JpaService {
//
//    private final UsersRepository usersRepository;
//
//    @Transactional(rollbackFor = SQLException.class)
//    public void save(String t) {
//        try {
//            usersRepository.save(new UsersEntity("one1", "one", new GroupEntity(1, "user"), 1500));
//            if (t == null)
//                throw new SQLException("NULL");
//            usersRepository.save(new UsersEntity("one2", "one", new GroupEntity(1, "user"), 1500));
//            usersRepository.save(new UsersEntity("one3", "one", new GroupEntity(1, "user"), 1500));
//        } catch (SQLException ex) {
//
//        }
//    }
//}
