package com.mobilka.mobilka.services.impl;

import com.mobilka.mobilka.entities.Cadres;
import com.mobilka.mobilka.repositories.CadresRepository;
import com.mobilka.mobilka.services.CadresServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadresServiceImpl implements CadresServices {

    @Autowired
    private CadresRepository cadresRepository;

    @Override
    public List<Cadres> getAllCadres() {
        return cadresRepository.findAll();
    }

    @Override
    public Cadres addCadr(Cadres cadr) {
        return cadresRepository.save(cadr);
    }

    @Override
    public Cadres getCadr(Long id) {
        return cadresRepository.findById(id).get();
    }

    @Override
    public Cadres editCadr(Cadres cadr) {
        return cadresRepository.save(cadr);
    }

    @Override
    public void deleteCadr(Cadres cadr) {
        cadresRepository.delete(cadr);
    }
}
