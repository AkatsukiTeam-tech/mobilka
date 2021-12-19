package com.mobilka.mobilka.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "t_payments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payments implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long payment_id;

    @Column(name = "added_date")
    private Date date;

    @OneToOne(fetch = FetchType.LAZY)
    private Films film;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
