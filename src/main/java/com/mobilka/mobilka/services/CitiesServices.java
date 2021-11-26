package com.mobilka.mobilka.services;

import com.mobilka.mobilka.entities.Cities;

import java.util.List;

public interface CitiesServices {
    List<Cities> getAllCities();
    Cities addCity(Cities city);
    Cities getCity(Long id);
    Cities editCity(Cities city);
    void deleteCity(Long id);
}
