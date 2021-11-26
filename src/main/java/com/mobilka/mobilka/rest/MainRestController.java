package com.mobilka.mobilka.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.mobilka.mobilka.entities.Cadres;
import com.mobilka.mobilka.entities.Cinemas;
import com.mobilka.mobilka.entities.Films;
import com.mobilka.mobilka.repositories.CadresRepository;
import com.mobilka.mobilka.repositories.FilmsRepository;
import com.mobilka.mobilka.services.CadresServices;
import com.mobilka.mobilka.services.CinemasServices;
import com.mobilka.mobilka.services.FilmsServices;
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


    @GetMapping(value = "/allCadres")
    public ResponseEntity<?> getAllCadres() {
        List<Cadres> cadres = cadresServices.getAllCadres();
        System.out.println(cadres.get(0).getFilm().toString());
        return new ResponseEntity<>(cadres, HttpStatus.OK);
    }

    @GetMapping(value = "/allFilms")
    public ResponseEntity<?> getAllFilms() {
        List<Films> films = filmsServices.getAllFilms();
        return new ResponseEntity<>(films, HttpStatus.OK);
    }

    @GetMapping(value = "/allCinemas")
    public ResponseEntity<?> getAllCinemas() {
        List<Cinemas> cinemas = cinemasServices.getAllCinemas();
        return new ResponseEntity<>(cinemas, HttpStatus.OK);
    }
}