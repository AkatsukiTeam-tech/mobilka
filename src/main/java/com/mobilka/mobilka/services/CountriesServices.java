package com.mobilka.mobilka.services;

import com.mobilka.mobilka.entities.Countries;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CountriesServices {
    List<Countries> getAllCountries();
    Countries addCountry(Countries country);
    Countries getCountry(Long id);
    Countries editCountry(Countries country);
    void deleteCountry(Countries country);
}
