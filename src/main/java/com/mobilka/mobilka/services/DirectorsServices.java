package com.mobilka.mobilka.services;

import com.mobilka.mobilka.entities.Directors;

import java.util.List;

public interface DirectorsServices {
    List<Directors> getAllDirectors();
    Directors addDirector(Directors director);
    Directors getDirector(Long id);
    Directors editDirector(Directors director);
    void deleteDirector(Long id);
}
