package com.mobilka.mobilka.repositories;

import com.mobilka.mobilka.entities.Genres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenresRepository extends JpaRepository<Genres, Long> {
}
