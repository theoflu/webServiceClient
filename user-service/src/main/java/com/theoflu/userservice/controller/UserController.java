package com.theoflu.userservice.controller;

import com.theoflu.userservice.model.User;
import com.theoflu.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("/userAdd")
    public ResponseEntity<User> addUser(@RequestBody User user){
        return ResponseEntity.ok(userService.addUser(user));
    }
    @GetMapping("/getUserAndDetail/{IdentityId}")
    public ResponseEntity<User> getUserAndDetail(@PathVariable String IdentityId){
        return ResponseEntity.ok(userService.getUserandDetail(IdentityId));
    }

}
