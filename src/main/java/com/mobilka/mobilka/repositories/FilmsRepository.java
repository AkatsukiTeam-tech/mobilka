package com.mobilka.mobilka.repositories;

import com.mobilka.mobilka.entities.Films;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmsRepository extends JpaRepository<Films, Long> {
}
