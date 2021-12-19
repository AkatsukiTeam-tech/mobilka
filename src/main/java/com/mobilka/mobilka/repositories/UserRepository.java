package com.mobilka.mobilka.repositories;

import com.mobilka.mobilka.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User getUserByEmail(String email);
}
