package com.mobilka.mobilka.services;

import com.mobilka.mobilka.entities.Sessions;
import com.mobilka.mobilka.entities.Trailers;

import java.util.List;

public interface TrailerServices {
    List<Trailers> getAllTrailers();
    Trailers addTrailer(Trailers trailer);
    Trailers getTrailer(Long id);
    Trailers editTrailer(Trailers trailer);
    void deleteTrailer(Trailers trailer);
}
