package com.example.atv0410.repository;

import com.example.atv0410.model.ItensPedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ItensPedidoRepository extends JpaRepository<ItensPedidoModel, Integer>{
}
