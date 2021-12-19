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

    @Autowired
    private SessionServices sessionServices;

    @Autowired
    private TrailerServices trailerServices;

    @Autowired
    private UserServices userServices;


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

    @GetMapping(value = "/allSessions")
    public ResponseEntity<?> getAllSessions() {
        List<Sessions> sessions = sessionServices.getAllSessions();
        System.out.println("Session: " + sessions.get(0).getSession_id());
        return new ResponseEntity<>(sessions, HttpStatus.OK);
    }

    @GetMapping(value = "/allDirectors")
    public ResponseEntity<?> getAllDirectors() {
        List<Directors> directors = directorsServices.getAllDirectors();
        return new ResponseEntity<>(directors, HttpStatus.OK);
    }

    @GetMapping(value = "/allTrailers")
    public ResponseEntity<?> getAllTrailers() {
        List<Trailers> trailers = trailerServices.getAllTrailers();
        return new ResponseEntity<>(trailers, HttpStatus.OK);
    }

    @GetMapping(value = "/allUsers")
    public ResponseEntity<?> getAllUsers() {
        List<User> users = userServices.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping(value = "/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        User check = userServices.getUserByEmail(user.getEmail());

        if (check != null && check.getPassword().equals(user.getPassword())){
            return new ResponseEntity<>(check, HttpStatus.OK);
        }

        else return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PostMapping(value = "/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        User check = userServices.getUserByEmail(user.getEmail());

        if (check == null){
            userServices.addUser(user);
            return new ResponseEntity<>(null, HttpStatus.OK);
        }
        else return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

    }
}