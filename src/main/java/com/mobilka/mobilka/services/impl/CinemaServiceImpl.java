package com.mobilka.mobilka.services.impl;

import com.mobilka.mobilka.entities.Cinemas;
import com.mobilka.mobilka.repositories.CinemasRepository;
import com.mobilka.mobilka.services.CinemasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaServiceImpl implements CinemasServices {

    @Autowired
    private CinemasRepository cinemasRepository;

    @Override
    public List<Cinemas> getAllCinemas() {
        return cinemasRepository.findAll();
    }

    @Override
    public Cinemas addCinema(Cinemas cinema) {
        return cinemasRepository.save(cinema);
    }

    @Override
    public Cinemas getCinema(Long id) {
        return cinemasRepository.findById(id).get();
    }

    @Override
    public Cinemas editCinema(Cinemas cinema) {
        return cinemasRepository.save(cinema);
    }

    @Override
    public void deleteCinema(Cinemas cinema) {
        cinemasRepository.delete(cinema);
    }
}
