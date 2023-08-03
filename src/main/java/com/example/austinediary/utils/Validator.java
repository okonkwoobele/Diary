package com.example.austinediary.utils;

public class Validator {
    public static boolean isValidPassword(String password) {
        return password.matches("^(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
    }
}
