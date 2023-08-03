package com.example.austinediary.services;

import com.example.austinediary.data.dto.request.LoginRequest;
import com.example.austinediary.data.dto.request.UserRegistrationRequest;
import com.example.austinediary.data.dto.response.Response;
import com.example.austinediary.data.dto.response.UserRegistrationResponse;

public interface AppUserService {
    UserRegistrationResponse registration(UserRegistrationRequest userRegistrationRequest);
    Response login(LoginRequest loginRequest);

}
