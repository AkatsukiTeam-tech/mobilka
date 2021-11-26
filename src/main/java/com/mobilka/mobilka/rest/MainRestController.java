package com.mobilka.mobilka.rest;

import com.mobilka.mobilka.entities.Cadres;
import com.mobilka.mobilka.repositories.CadresRepository;
import com.mobilka.mobilka.services.CadresServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/api")
public class MainRestController {

    @Autowired
    private CadresServices cadresServices;

    @Autowired
    private CadresRepository cadresRepository;

    @GetMapping(value = "/allCadres")
    public ResponseEntity<?> getAllCadres(@RequestParam(name = "id") Long id) {
        List<Cadres> cadres = cadresServices.getAllCadres();
        return new ResponseEntity<>(cadres, HttpStatus.OK);
    }
}
