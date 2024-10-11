package com.example.atv0410.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "pedido")
public class PedidoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "NroPedido")
    private Long NroPedido;

    @Column(name ="DatPedido")
    private LocalDate DatPedido;
}
