package com.example.store.modelos;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="tipo de prenda")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDateTime fechaYHora;
}
