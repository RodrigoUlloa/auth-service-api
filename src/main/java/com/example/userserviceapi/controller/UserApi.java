package com.example.userserviceapi.controller;

import com.example.userserviceapi.common.constants.ApiPathConstants;
import com.example.userserviceapi.common.entitites.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(ApiPathConstants.V1_ROUTE + ApiPathConstants.USER_ROUTE)
public interface UserApi {
    @GetMapping
    ResponseEntity<User> GetUser(@RequestParam Long id);

    @PutMapping
    ResponseEntity<User> UpdateUser(@RequestHeader("userIdRequest") String userId, @RequestBody User email, @RequestBody User password);
}
