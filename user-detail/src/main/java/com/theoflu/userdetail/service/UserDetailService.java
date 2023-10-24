package com.theoflu.userdetail.service;

import com.theoflu.userdetail.model.UserDetails;
import com.theoflu.userdetail.repository.UserDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailService {
    private final UserDetailRepository userDetailRepository;

    public UserDetails getUserIdentityIdNumber(String identityId){
       return userDetailRepository.findUserDetailsByIdentityId(identityId);
    }
}
