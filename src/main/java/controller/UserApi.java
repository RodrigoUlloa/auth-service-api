package controller;

import entitites.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/users")
public interface UserApi {
    @GetMapping
    ResponseEntity<User> GetUser(@RequestParam long id);
    @PutMapping
    ResponseEntity<User> UpdateUser(@RequestHeader("userIdRequest") String userId, @RequestBody User email, @RequestBody User password);
}
