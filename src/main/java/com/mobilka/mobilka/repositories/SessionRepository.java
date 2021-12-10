package com.mobilka.mobilka.repositories;

import com.mobilka.mobilka.entities.Sessions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Sessions, Long> {
}
