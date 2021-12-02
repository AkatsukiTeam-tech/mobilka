package com.mobilka.mobilka.services.impl;

import com.mobilka.mobilka.entities.Cities;
import com.mobilka.mobilka.repositories.CitiesRepository;
import com.mobilka.mobilka.services.CitiesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitiesServiceImpl implements CitiesServices {

    @Autowired
    private CitiesRepository citiesRepository;

    @Override
    public List<Cities> getAllCities() {
        return citiesRepository.findAll();
    }

    @Override
    public Cities addCity(Cities city) {
        return citiesRepository.save(city);
    }

    @Override
    public Cities getCity(Long id) {
        return citiesRepository.findById(id).get();
    }

    @Override
    public Cities editCity(Cities city) {
        return citiesRepository.save(city);
    }

    @Override
    public void deleteCity(Cities city) {
        citiesRepository.delete(city);
    }
}
