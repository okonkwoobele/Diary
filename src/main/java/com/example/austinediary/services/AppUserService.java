package com.example.austinediary.services;

import com.example.austinediary.data.dto.request.UserRegistrationRequest;
import com.example.austinediary.data.dto.response.UserRegistrationResponse;

public interface AppUserService {
    UserRegistrationResponse registration(UserRegistrationRequest userRegistrationRequest);

}
