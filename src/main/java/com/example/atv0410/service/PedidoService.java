package com.example.atv0410.service;

import com.example.atv0410.dto.PedidoDto;
import com.example.atv0410.interfaces.IService;
import com.example.atv0410.model.PedidoModel;
import com.example.atv0410.repository.PedidoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class PedidoService implements IService<PedidoDto, Integer> {


    final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    /**
     * esse metodo cria o pedido
     * @param entity
     * @return
     */
    @Override
    public PedidoDto create(PedidoDto entity) {
        log.info("PedidoService::create");
        return null;
    }

    /**
     * esse metodo cria lista um pedido especifico
     * @param id
     * @return
     */
    @Override
    public PedidoDto read(Integer id) {
        log.info("PedidoService::read(id)");
        return null;
    }

    /**
     * esse metodo lista todos os pedidos
     * @return
     */
    @Override
    public List<PedidoDto> read() {
        log.info("UserService::read()");
        return List.of();
    }

    /**
     * esse metodo atualiza as informações de um pedido
     * @param id
     * @param entity
     * @return
     */
    @Override
    public PedidoDto update(Integer id, PedidoDto entity) {
        log.info("PedidoService::update(id,entity)");
        return null;
    }

    /**
     * esse metodo deleta um pedido
     * @param id
     */
    @Override
    public void delete(Integer id) {
        log.info("PedidoService::delete(id)");
    }
}
