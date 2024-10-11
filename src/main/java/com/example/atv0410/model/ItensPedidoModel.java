package com.example.atv0410.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "itenspedido")
public class ItensPedidoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "QtdeItem")
    private Double QtdeItem;

    @Column(name = "ValUnidade")
    private Double ValUnidade;
}
