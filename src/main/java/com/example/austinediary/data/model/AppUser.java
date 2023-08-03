package com.example.austinediary.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class AppUser {
    @Id private String userId;
     private String firstName;
     private String lastName;
     private String password;
     private String email;
     private String phoneNumber;
     private String address;
     @DBRef
     private Diary diary;
     private Role role;


}
