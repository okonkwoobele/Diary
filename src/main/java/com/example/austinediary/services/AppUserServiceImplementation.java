package com.example.austinediary.services;

import com.example.austinediary.data.dto.request.UserRegistrationRequest;
import com.example.austinediary.data.dto.response.UserRegistrationResponse;
import com.example.austinediary.data.model.AppUser;
import com.example.austinediary.data.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserServiceImplementation implements AppUserService {

    @Autowired
    private AppUserRepository appUserRepository;
    @Override
    public UserRegistrationResponse registration(UserRegistrationRequest userRegistrationRequest) {
        AppUser appUser = new AppUser();
        appUser.setFirstName(userRegistrationRequest.getFirstName());
        appUser.setLastName(userRegistrationRequest.getLastName());
        appUser.setEmail(userRegistrationRequest.getEmail());
        appUser.setPassword(userRegistrationRequest.getPassword());
        appUserRepository.save(appUser);
        return new UserRegistrationResponse(appUser.getUserId(), "User registration successful", 201);
    }
}
