package com.mobilka.mobilka.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.mobilka.mobilka.entities.*;
import com.mobilka.mobilka.repositories.CadresRepository;
import com.mobilka.mobilka.repositories.FilmsRepository;
import com.mobilka.mobilka.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api")
public class MainRestController {

    @Autowired
    private CadresServices cadresServices;

    @Autowired
    private FilmsServices filmsServices;

    @Autowired
    private CinemasServices cinemasServices;

    @Autowired
    private CountriesServices countriesServices;

    @Autowired
    private DirectorsServices directorsServices;


    @GetMapping(value = "/allCadres")
    public ResponseEntity<?> getAllCadres() {
        List<Cadres> cadres = cadresServices.getAllCadres();
        return new ResponseEntity<>(cadres, HttpStatus.OK);
    }

    @GetMapping(value = "/allFilms")
    public ResponseEntity<?> getAllFilms() {
        List<Films> films = filmsServices.getAllFilms();
        return new ResponseEntity<>(films, HttpStatus.OK);
    }

    @GetMapping(value = "/getFilm/{id}")
    public ResponseEntity<?> getFilm(@PathVariable(name = "id")Long id) {
        Films film = filmsServices.getFilm(id);
        return new ResponseEntity<>(film, HttpStatus.OK);
    }

    @GetMapping(value = "/allCinemas")
    public ResponseEntity<?> getAllCinemas() {
        List<Cinemas> cinemas = cinemasServices.getAllCinemas();
        return new ResponseEntity<>(cinemas, HttpStatus.OK);
    }

    @GetMapping(value = "/allCountries")
    public ResponseEntity<?> getAllCountries() {
        List<Countries> countries = countriesServices.getAllCountries();
        return new ResponseEntity<>(countries, HttpStatus.OK);
    }

    @GetMapping(value = "/allDirectors")
    public ResponseEntity<?> getAllDirectors() {
        List<Directors> directors = directorsServices.getAllDirectors();
        return new ResponseEntity<>(directors, HttpStatus.OK);
    }
}