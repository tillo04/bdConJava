package com.example.store.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="marcas")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String nit;
    private LocalDate anoCreacion;
    private String sedePrincipal;
}
