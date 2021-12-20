package com.mobilka.mobilka.services.impl;

import com.mobilka.mobilka.entities.Cinemas;
import com.mobilka.mobilka.entities.Films;
import com.mobilka.mobilka.entities.Sessions;
import com.mobilka.mobilka.repositories.SessionRepository;
import com.mobilka.mobilka.services.SessionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionServiceImpl implements SessionServices {

    @Autowired
    private SessionRepository sessionRepository;

    @Override
    public List<Sessions> getAllSessions() {
        return sessionRepository.findAll();
    }

    @Override
    public Sessions addSession(Sessions session) {
        return sessionRepository.save(session);
    }

    @Override
    public Sessions getSession(Long id) {
        return sessionRepository.findById(id).get();
    }

    @Override
    public Sessions editSession(Sessions session) {
        return sessionRepository.save(session);
    }

    @Override
    public void deleteSession(Sessions session) {
        sessionRepository.delete(session);
    }

    @Override
    public Sessions findByCinemasAndAndFilms(Cinemas cinema_id, Films film_id) {
        return sessionRepository.findByCinemasAndAndFilms(cinema_id, film_id);
    }
}
