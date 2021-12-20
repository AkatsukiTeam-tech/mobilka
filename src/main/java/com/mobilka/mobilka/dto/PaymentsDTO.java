package com.mobilka.mobilka.dto;

import com.mobilka.mobilka.entities.Cinemas;
import com.mobilka.mobilka.entities.Films;
import com.mobilka.mobilka.entities.Place;
import com.mobilka.mobilka.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentsDTO {

    private List<Place> places;
    private Films films;
    private Cinemas cinemas;
    private User user;
    private Integer price;


}
