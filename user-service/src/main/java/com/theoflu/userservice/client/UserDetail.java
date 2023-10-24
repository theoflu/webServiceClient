package com.theoflu.userservice.client;

import com.theoflu.userservice.model.UserDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8081/userdetail",name = "user-detail")
@FeignClient(url = "http://userdetail.default.svc.cluster.local:8081/userdetail",name = "user-detail")
public interface UserDetail {
    @GetMapping("/getUserIdentityIdNumber/{identityId}")
    ResponseEntity<UserDetails> getUserIdentityIdNumber(@PathVariable String identityId);
}
