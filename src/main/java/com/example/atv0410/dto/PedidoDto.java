package com.example.atv0410.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PedidoDto {

    private Integer id;
    private Long NroPedido;
    private LocalDate DatPedido;

}

