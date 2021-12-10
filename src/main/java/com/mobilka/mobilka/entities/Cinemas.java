package com.mobilka.mobilka.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "t_cinemas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cinemas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long cinema_id;

    @Column(name = "name")
    private String cinema_name;

    @Column(name = "address")
    private String cinema_address;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Cities> cities;
}
