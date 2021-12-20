package com.mobilka.mobilka.repositories;

import com.mobilka.mobilka.entities.Films;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface FilmsRepository extends JpaRepository<Films, Long> {

    List<Films> findAllByDate(LocalDate date);
    List<Films> findAllByAnnounce(Boolean flag);

}
