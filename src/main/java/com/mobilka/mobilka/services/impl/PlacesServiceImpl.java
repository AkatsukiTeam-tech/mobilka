package com.mobilka.mobilka.services.impl;

import com.mobilka.mobilka.entities.Place;
import com.mobilka.mobilka.repositories.PlacesRepository;
import com.mobilka.mobilka.services.PlacesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacesServiceImpl implements PlacesServices {

    @Autowired
    private PlacesRepository repository;

    @Override
    public List<Place> getAllPlaces() {
        return repository.findAll();
    }

    @Override
    public Place addPlace(Place place) {
        return repository.save(place);
    }

    @Override
    public Place getPlace(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Place editPlace(Place place) {
        return repository.save(place);
    }

    @Override
    public void deletePlace(Place place) {
        repository.delete(place);
    }
}
