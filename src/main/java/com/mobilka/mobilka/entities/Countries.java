package com.mobilka.mobilka.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_countries")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Countries implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long country_id;

    @Column(name = "name")
    private String country_name;
}
