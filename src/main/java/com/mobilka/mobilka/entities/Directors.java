package com.mobilka.mobilka.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "t_directors")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Directors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long director_id;

    @Column(name = "name")
    private String full_name;
}
