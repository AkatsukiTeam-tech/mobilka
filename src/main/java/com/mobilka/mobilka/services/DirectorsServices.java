package com.mobilka.mobilka.services;

import com.mobilka.mobilka.entities.Directors;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DirectorsServices {
    List<Directors> getAllDirectors();
    Directors addDirector(Directors director);
    Directors getDirector(Long id);
    Directors editDirector(Directors director);
    void deleteDirector(Directors director);
}
