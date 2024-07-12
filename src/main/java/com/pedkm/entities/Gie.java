package com.pedkm.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Gie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String nomGie;
    private String commune;
    private String nomPresidente;
    private String nombre;
    private String formelOuinformel;
    private String contact;

}
