package controller.impl;

import controller.UserApi;
import entitites.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.UserService;

@RestController

public class UserController implements UserApi {

    private final UserService userService;

    public UserController(UserService userService) { this.userService = userService; }

    @GetMapping
    public ResponseEntity<User> GetUser(@RequestParam long id) {
        User getList = this.userService.getUser(id);
        return ResponseEntity.ok(getList);
    }

    @PutMapping
    public ResponseEntity<User> UpdateUser(@RequestHeader("userIdRequest") String userId, @RequestBody User email, @RequestBody User password) {
        User userUpdate = this.userService.saveUser(userId, email, password);
        return ResponseEntity.ok(userUpdate);
    }
}
