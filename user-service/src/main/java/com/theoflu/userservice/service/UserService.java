package com.theoflu.userservice.service;

import com.theoflu.userservice.client.UserDetail;
import com.theoflu.userservice.model.User;
import com.theoflu.userservice.model.UserDetails;
import com.theoflu.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserDetail userDetailClient;

    public User addUser(User user){
        return userRepository.save(user);
    }

    public User getUserandDetail (String IdentityId){
        UserDetails userDetail=userDetailClient.getUserIdentityIdNumber(IdentityId).getBody();
        User user=userRepository.findByIdentityId(IdentityId);
        user.setUserDetails(userDetail);
        return user;
    }
}
