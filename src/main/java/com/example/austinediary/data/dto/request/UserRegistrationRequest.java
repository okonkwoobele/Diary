package com.example.austinediary.data.dto.request;

import lombok.Data;
@Data
public class UserRegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
