package com.mobilka.mobilka.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name = "t_cinemas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cinemas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long cinema_id;

    @Column(name = "name")
    private String cinema_name;

    @Column(name = "address")
    private String cinema_address;

    @Column(name = "start_time")
    private Time cinema_start_time;

    @Column(name = "end_time")
    private Time cinema_end_time;

    @Column(name = "cinema_price")
    private Integer cinema_price;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Cities> cities;
}
