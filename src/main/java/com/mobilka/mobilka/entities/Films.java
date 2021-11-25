package com.mobilka.mobilka.entities;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "t_films")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Films {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long film_id;

    @Column(name = "name")
    private String film_name;

    @Column(name = "duration")
    private Time film_duration;

    @Column(name = "date")
    private Date film_date;
}
