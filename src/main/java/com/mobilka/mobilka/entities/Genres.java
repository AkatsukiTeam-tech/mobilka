package com.mobilka.mobilka.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "t_genres")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Genres implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long genre_id;

    @Column(name = "name")
    private String genre_name;
}
