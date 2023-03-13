package by.brel.cassandra.cluster.controller;

import by.brel.cassandra.cluster.model.User;
import by.brel.cassandra.cluster.repository.DefaultRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class DefaultController {

    private final DefaultRepository repository;

    @GetMapping("/users")
    public List<User> getInfo() {
        return repository.findAll();
    }
}
