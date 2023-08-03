package com.example.austinediary.controller;

import com.example.austinediary.data.dto.request.UserRegistrationRequest;
import com.example.austinediary.data.dto.response.UserRegistrationResponse;
import com.example.austinediary.services.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/appUser")
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    @PostMapping("/registration")
    public UserRegistrationResponse register(@RequestBody UserRegistrationRequest userRegistrationRequest) {
        return appUserService.registration(userRegistrationRequest);
    }
}
