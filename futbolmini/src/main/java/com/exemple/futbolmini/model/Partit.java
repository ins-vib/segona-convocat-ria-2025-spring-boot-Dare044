package com.exemple.futbolmini.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Partit {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private Equip equipLocal;

    @ManyToOne
    private Equip equipVisitant;

    private LocalDateTime data;
    private int golsLocal;
    private int golsVisitant;
    private int resultatLocal;
    private int resultatVisitant;
}
