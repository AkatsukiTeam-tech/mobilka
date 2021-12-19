package com.mobilka.mobilka.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_place")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Place implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long place_id;

    @Column(name = "place_x")
    private Integer placeX;

    @Column(name = "place_y")
    private Integer placeY;

    @ManyToOne(fetch = FetchType.EAGER)
    private Payments payments;
}
