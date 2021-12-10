package com.mobilka.mobilka.services;

import com.mobilka.mobilka.entities.Sessions;

import java.util.List;

public interface SessionServices {
    List<Sessions> getAllSessions();
    Sessions addSession(Sessions session);
    Sessions getSession(Long id);
    Sessions editSession(Sessions session);
    void deleteSession(Sessions session);

}
