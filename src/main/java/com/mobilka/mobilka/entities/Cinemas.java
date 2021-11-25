package com.mobilka.mobilka.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "t_cinemas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cinemas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long cinema_id;

    @Column(name = "name")
    private String ciname_name;

    @Column(name = "address")
    private String ciname_address;
}
