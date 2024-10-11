package com.example.atv0410.service;

import com.example.atv0410.dto.ItensPedidoDto;
import com.example.atv0410.interfaces.IService;
import com.example.atv0410.repository.ItensPedidoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ItensPedidoService implements IService<ItensPedidoDto, Integer> {

    final ItensPedidoRepository itensPedidoRepository;
    public ItensPedidoService(ItensPedidoRepository itensPedidoRepository){
        this.itensPedidoRepository = itensPedidoRepository;
    }

    /**
     * esse metodo cria o ItensPedio
     * @param entity
     * @return
     */
    @Override
    public ItensPedidoDto create(ItensPedidoDto entity) {
        log.info("ItensPedidoService::create");
        return null;
    }

    /**
     * esse metodo lista um itenspedido especifico
     * @param id
     * @return
     */
    @Override
    public ItensPedidoDto read(Integer id) {
        log.info("ItensPedidoService::read(id)");
        return null;
    }

    /**
     * esse
     * @return
     */
    @Override
    public List<ItensPedidoDto> read() {
        log.info("ItensPedidoService::read()");
        return List.of();
    }

    @Override
    public ItensPedidoDto update(Integer id, ItensPedidoDto entity) {
        log.info("ItensPedidoService::update(id, entity)");
        return null;
    }

    @Override
    public void delete(Integer id) {
        log.info("ItensPedidoService::delete(id)");
    }
}
