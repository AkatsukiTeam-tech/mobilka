package com.mobilka.mobilka.repositories;

import com.mobilka.mobilka.entities.Cinemas;
import com.mobilka.mobilka.entities.Films;
import com.mobilka.mobilka.entities.Sessions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Sessions, Long> {
    Sessions findByCinemasAndAndFilms(Cinemas cinema_id, Films film_id);
}
