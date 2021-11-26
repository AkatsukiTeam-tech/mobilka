package com.mobilka.mobilka.repositories;

import com.mobilka.mobilka.entities.Countries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountriesRepository extends JpaRepository<Countries, Long> {
}
