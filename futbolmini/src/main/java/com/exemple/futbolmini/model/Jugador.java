package com.exemple.futbolmini.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Jugador {
    @Id @GeneratedValue
    private Long id;
    private String nom;
    private String posicio;

    @ManyToOne
    private Equip equip;
}
