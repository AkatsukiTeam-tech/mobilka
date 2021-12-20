package com.mobilka.mobilka.repositories;

import com.mobilka.mobilka.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlacesRepository extends JpaRepository<Place, Long> {
}
