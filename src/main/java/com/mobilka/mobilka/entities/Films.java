package com.mobilka.mobilka.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name = "t_films")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Films implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long film_id;

    @Column(name = "ru_name")
    private String film_ru_name;

    @Column(name = "orig_name")
    private String film_orig_name;

    @Column(name = "image_url")
    private String image_url;

    @Column(name = "description")
    private String description;

    @Column(name = "restriction")
    private int restriction;

    @Column(name = "duration")
    private Time film_duration;

    @Column(name = "date")
    private Date film_date;

    @Column(name = "announce")
    private boolean announce;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Countries> countries;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Directors> directors;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Genres> genres;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Cinemas> cinema;

}
