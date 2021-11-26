package com.mobilka.mobilka.services;

import com.mobilka.mobilka.entities.Cinemas;

import java.util.List;

public interface CinemasServices {
    List<Cinemas> getAllCinemas();
    Cinemas addCinema(Cinemas cinema);
    Cinemas getCinema(Long id);
    Cinemas editCinema(Cinemas cinema);
    void deleteCinema(Long id);
}
