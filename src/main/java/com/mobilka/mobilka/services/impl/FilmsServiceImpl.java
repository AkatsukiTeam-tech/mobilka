package com.mobilka.mobilka.services.impl;

import com.mobilka.mobilka.entities.Films;
import com.mobilka.mobilka.repositories.CadresRepository;
import com.mobilka.mobilka.repositories.FilmsRepository;
import com.mobilka.mobilka.services.FilmsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class FilmsServiceImpl implements FilmsServices {

    @Autowired
    private FilmsRepository filmsRepository;

    @Override
    public List<Films> getAllFilms() {
        return filmsRepository.findAll();
    }

    @Override
    public List<Films> searchFilms() {
        return filmsRepository.findAll();
    }

    @Override
    public Films addFilm(Films film) {
        return filmsRepository.save(film);
    }

    @Override
    public Films getFilm(Long id) {
        return filmsRepository.findById(id).get();
    }

    @Override
    public Films editFilm(Films film) {
        return filmsRepository.save(film);
    }

    @Override
    public void deleteFilm(Films film) {
        filmsRepository.delete(film);
    }

    @Override
    public List<Films> findAllByDate(LocalDate date) {
        return filmsRepository.findAllByDate(date);
    }

    @Override
    public List<Films> findAllByAnnounce(Boolean flag) {
        return filmsRepository.findAllByAnnounce(flag);
    }
}
