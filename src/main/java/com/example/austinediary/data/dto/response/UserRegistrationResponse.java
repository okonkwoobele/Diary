package com.example.austinediary.data.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class UserRegistrationResponse {
    private String id;
    private String message;
    private int statusCode;
}
