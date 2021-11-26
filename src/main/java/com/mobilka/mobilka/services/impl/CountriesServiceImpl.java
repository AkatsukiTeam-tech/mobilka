package com.mobilka.mobilka.services.impl;

import com.mobilka.mobilka.entities.Countries;
import com.mobilka.mobilka.repositories.CountriesRepository;
import com.mobilka.mobilka.services.CountriesServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CountriesServiceImpl implements CountriesServices {

    @Autowired
    private CountriesRepository countriesRepository;

    @Override
    public List<Countries> getAllCountries() {
        return countriesRepository.findAll();
    }

    @Override
    public Countries addCountry(Countries country) {
        return countriesRepository.save(country);
    }

    @Override
    public Countries getCountry(Long id) {
        return countriesRepository.findById(id).get();
    }

    @Override
    public Countries editCountry(Countries country) {
        return countriesRepository.save(country);
    }

    @Override
    public void deleteCountry(Countries country) {
        countriesRepository.delete(country);
    }
}
