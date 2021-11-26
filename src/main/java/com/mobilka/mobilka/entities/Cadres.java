package com.mobilka.mobilka.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_cadres")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cadres implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long cadr_id;

    @Column(name = "url")
    private String cadr_url;

    @ManyToOne(fetch = FetchType.LAZY)
    private Films film;
}
