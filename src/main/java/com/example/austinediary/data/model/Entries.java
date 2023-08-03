package com.example.austinediary.data.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
public class Entries {
    @Id
    private String id;
    private String title;
    private LocalDateTime date;
    private String body;


}
