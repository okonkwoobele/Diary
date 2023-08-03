package com.example.austinediary.services;

import com.example.austinediary.data.dto.request.UserRegistrationRequest;
import com.example.austinediary.data.dto.response.UserRegistrationResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AppUserServiceImplementationTest {

    @Autowired
    private AppUserService appUserService;
    @Test
    void testThatAppUserCanRegister() {
        UserRegistrationRequest registrationRequest = new UserRegistrationRequest();
        registrationRequest.setFirstName("yemishola");
        registrationRequest.setLastName("Glory");
        registrationRequest.setEmail("wertdfgrdss@gmail.com");
        registrationRequest.setPassword("Austinthebigman!34");
        UserRegistrationResponse response = appUserService.registration(registrationRequest);
        assertEquals("User registration successful", response.getMessage());
    }


}