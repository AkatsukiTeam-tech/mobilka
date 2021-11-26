package com.mobilka.mobilka.services;

import com.mobilka.mobilka.entities.Films;

import java.util.List;

public interface FilmsServices {    List<Films> getAllFilms();
    List<Films> searchFilms();
    Films addFilm(Films film);
    Films getFilm(Long id);
    Films editFilm(Films film);
    void deleteFilm(Long id);

}
