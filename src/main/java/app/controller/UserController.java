package app.controller;

import app.entity.User;
import app.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {
    private UserRepository repository;

    @GetMapping("/user/{name}")
    public void save(@PathVariable String name) {
        repository.save(new User(name));
    }

    @GetMapping("/user")
    public List<User> getAll() {
        return repository.findAll();
    }

}
