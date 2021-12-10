package com.mobilka.mobilka.services.impl;

import com.mobilka.mobilka.entities.Trailers;
import com.mobilka.mobilka.repositories.TrailersRepository;
import com.mobilka.mobilka.services.TrailerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrailersServicesImpl implements TrailerServices {

    @Autowired
    private TrailersRepository trailersRepository;

    @Override
    public List<Trailers> getAllTrailers() {
        return trailersRepository.findAll();
    }

    @Override
    public Trailers addTrailer(Trailers trailer) {
        return trailersRepository.save(trailer);
    }

    @Override
    public Trailers getTrailer(Long id) {
        return trailersRepository.findById(id).get();
    }

    @Override
    public Trailers editTrailer(Trailers trailer) {
        return trailersRepository.save(trailer);
    }

    @Override
    public void deleteTrailer(Trailers trailer) {
        trailersRepository.delete(trailer);
    }
}
