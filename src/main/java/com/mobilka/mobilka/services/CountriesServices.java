package com.mobilka.mobilka.services;

import com.mobilka.mobilka.entities.Countries;

import java.util.List;

public interface CountriesServices {
    List<Countries> getAllCountries();
    Countries addCountry(Countries country);
    Countries getCountry(Long id);
    Countries editCountry(Countries country);
    void deleteCountry(Long id);
}
