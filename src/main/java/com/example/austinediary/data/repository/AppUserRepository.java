package com.example.austinediary.data.repository;

import com.example.austinediary.data.model.AppUser;
import com.example.austinediary.data.model.Entries;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AppUserRepository extends MongoRepository<AppUser, String> {
}
