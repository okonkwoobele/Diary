package com.example.austinediary.data.dto.request;

import com.example.austinediary.utils.Validator;
import lombok.Data;
import org.mindrot.jbcrypt.BCrypt;

@Data
public class UserRegistrationRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;


    public String getPassword() {
        ///if(Validator.isValidPassword(password))
         return BCrypt.hashpw(password, BCrypt.gensalt());
       // else
          //  throw new RuntimeException("Password must contain a capital letter, a small letter," +
            //    " a number, and a character and must be between 8 - 20 characters!!!");
    }
}
