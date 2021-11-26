package com.mobilka.mobilka.repositories;

import com.mobilka.mobilka.entities.Cinemas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CinemasRepository extends JpaRepository<Cinemas, Long> {
    List<Cinemas> findAll();
}
