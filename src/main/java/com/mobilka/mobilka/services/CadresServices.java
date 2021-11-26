package com.mobilka.mobilka.services;

import com.mobilka.mobilka.entities.Cadres;

import java.util.List;

public interface CadresServices {
    List<Cadres> getAllCadres();
    Cadres addCadr(Cadres cadr);
    Cadres getCadr(Long id);
    Cadres editCadr(Cadres cadr);
    void deleteCadr(Cadres cadr);
}
