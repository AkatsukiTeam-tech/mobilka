package com.mobilka.mobilka.repositories;

import com.mobilka.mobilka.entities.Cadres;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CadresRepository extends JpaRepository<Cadres, Long> {
    List<Cadres> findAll();
}
