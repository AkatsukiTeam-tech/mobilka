package com.mobilka.mobilka.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "t_trailers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trailers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long trailer_id;

    @Column(name = "url")
    private String trailer_url;

    @ManyToOne(fetch = FetchType.LAZY)
    private Films films;
}
