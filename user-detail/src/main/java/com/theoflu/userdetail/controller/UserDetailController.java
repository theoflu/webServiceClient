package com.theoflu.userdetail.controller;

import com.theoflu.userdetail.model.UserDetails;
import com.theoflu.userdetail.service.UserDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userdetail")
@RequiredArgsConstructor
public class UserDetailController {
    private final UserDetailService userDetailService;

    @GetMapping("/getUserIdentityIdNumber/{identityId}")
    public ResponseEntity<UserDetails> getUserIdentityIdNumber(@PathVariable String identityId){
     return ResponseEntity.ok(userDetailService.getUserIdentityIdNumber(identityId));
    }
}
