package com.mobilka.mobilka.services;

import com.mobilka.mobilka.entities.Payments;
import com.mobilka.mobilka.entities.Place;

import java.util.List;

public interface PlacesServices {


    List<Place> getAllPlaces();
    Place addPlace(Place place);
    Place getPlace(Long id);
    Place editPlace(Place place);
    void deletePlace(Place place);
}
