package com.mobilka.mobilka.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name = "t_sessions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sessions implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long session_id;

    @Column(name = "start_time")
    private Time session_start_time;

    @Column(name = "end_time")
    private Time session_end_time;

    @Column(name = "session_price")
    private Integer session_price;

    @ManyToOne(fetch = FetchType.LAZY)
    private Films films;

    @ManyToOne(fetch = FetchType.LAZY)
    private Cinemas cinemas;
}
