package com.example.store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="detalles")
public class Detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer costoTotal;
    private Integer cantidadProducto;

}
