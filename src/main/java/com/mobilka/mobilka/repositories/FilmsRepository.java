package com.mobilka.mobilka.repositories;

import com.mobilka.mobilka.entities.Cinemas;
import com.mobilka.mobilka.entities.Films;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmsRepository extends JpaRepository<Films, Long> {
}
