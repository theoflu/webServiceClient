package com.theoflu.userdetail.repository;

import com.theoflu.userdetail.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailRepository extends JpaRepository<UserDetails,Long> {
    UserDetails findUserDetailsByIdentityId(String identityId);
}
