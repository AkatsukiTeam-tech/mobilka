package com.mobilka.mobilka.services.impl;

import com.mobilka.mobilka.entities.Directors;
import com.mobilka.mobilka.repositories.DirectorsRepository;
import com.mobilka.mobilka.services.DirectorsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectorsServiceImpl implements DirectorsServices {

    @Autowired
    private DirectorsRepository directorsRepository;

    @Override
    public List<Directors> getAllDirectors() {
        return directorsRepository.findAll();
    }

    @Override
    public Directors addDirector(Directors director) {
        return directorsRepository.save(director);
    }

    @Override
    public Directors getDirector(Long id) {
        return directorsRepository.findById(id).get();
    }

    @Override
    public Directors editDirector(Directors director) {
        return directorsRepository.save(director);
    }

    @Override
    public void deleteDirector(Directors director) {
        directorsRepository.delete(director);
    }
}
