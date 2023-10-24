package com.theoflu.userservice.repository;

import com.theoflu.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
   // User findByIdentityId(String identityId);
    User findByIdentityId(String identityId);


}
