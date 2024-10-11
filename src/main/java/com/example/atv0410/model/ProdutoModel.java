package com.example.atv0410.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Entity
@Table(name = "produtomodel")
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "DesPro", length = 50)
    private String DesPro;

    @Column(name = "QtdeProduto")
    private Double QtdeProduto;

    @Column(name = "ValProduto")
    private Double ValProduto;
}

