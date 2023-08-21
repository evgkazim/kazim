package ru.kazim.spring.main.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kazim.spring.main.aspect.TestController;
import ru.kazim.spring.main.entity.GroupEntity;
import ru.kazim.spring.main.entity.UsersEntity;
import ru.kazim.spring.main.repository.UsersRepository;
import ru.kazim.spring.main.service.JpaService;

@RestController
@RequiredArgsConstructor
public class MainCont {

    private final JpaService jpaService;

    @TestController
    @GetMapping(path = "/test", produces = "application/json")
    public Object test() {
        return "testComp.toString();";
    }

    @GetMapping(path = "/users")
    public Object re() throws Exception  {
        jpaService.save(null);
        return "null";
    }

    @GetMapping(path = "/user1")
    public Object re1() throws JsonProcessingException {
//        for (UsersEntity ent : usersRepository.findAll())
//            System.out.println(ent.getId() + " " + ent.getName());
        return "user1";
    }
    @GetMapping(path = "/user2")
    public Object re2() throws JsonProcessingException {
//        for (UsersEntity ent : usersRepository.findAll())
//            System.out.println(ent.getId() + " " + ent.getName() + " " + ent.getGroup().getGroup());
        return "user2";
    }
}
