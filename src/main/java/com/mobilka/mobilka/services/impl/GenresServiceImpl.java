package com.mobilka.mobilka.services.impl;

import com.mobilka.mobilka.entities.Genres;
import com.mobilka.mobilka.repositories.GenresRepository;
import com.mobilka.mobilka.services.GenresServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GenresServiceImpl implements GenresServices {

    @Autowired
    private GenresRepository genresRepository;

    @Override
    public List<Genres> getAllGenres() {
        return genresRepository.findAll();
    }

    @Override
    public Genres addGenre(Genres genres) {
        return genresRepository.save(genres);
    }

    @Override
    public Genres getGenre(Long id) {
        return genresRepository.findById(id).get();
    }

    @Override
    public Genres editGenre(Genres genres) {
        return genresRepository.save(genres);
    }

    @Override
    public void deleteGenre(Genres genre) {
        genresRepository.delete(genre);
    }
}
