package com.mobilka.mobilka.entities;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

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

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Countries> countries;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Directors> directors;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Genres> genres;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Cinemas> cinemas;
}
