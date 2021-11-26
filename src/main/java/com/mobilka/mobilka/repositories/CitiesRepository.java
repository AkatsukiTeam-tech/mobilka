package com.mobilka.mobilka.repositories;

import com.mobilka.mobilka.entities.Cities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitiesRepository extends JpaRepository<Cities, Long> {
}
