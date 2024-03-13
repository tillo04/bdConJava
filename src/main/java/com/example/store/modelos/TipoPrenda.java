package com.example.store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="tipo de prenda")
public class TipoPrenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
}
