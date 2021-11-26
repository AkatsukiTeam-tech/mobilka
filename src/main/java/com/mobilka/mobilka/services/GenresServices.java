package com.mobilka.mobilka.services;

import com.mobilka.mobilka.entities.Genres;

import java.util.List;

public interface GenresServices {
    List<Genres> getAllGenres();
    Genres addGenre(Genres genres);
    Genres getGenre(Long id);
    Genres editGenre(Genres genres);
    void deleteGenre(Genres genre);
}
