package com.theoflu.userservice.model;

import lombok.Data;

@Data

public class UserDetails {
    private String identityId;
    private String address;
    private String email;
    private String phoneNumber;
}
