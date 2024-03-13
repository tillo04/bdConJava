package com.example.store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String referencia;
    private Integer cantidadBodega;
    private Integer precioUnitario;
    private String descripcion;
    private String fotografia;
    private String talla;
}
