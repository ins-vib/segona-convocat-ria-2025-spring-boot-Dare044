package com.exemple.futbolmini.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Equip {
    @Id @GeneratedValue
    private Long id;
    private String nom;

    @OneToMany(mappedBy = "equip")
    private List<Jugador> jugadors;
}
