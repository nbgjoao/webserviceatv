package com.example.atv0410.resource;

import com.example.atv0410.dto.ItensPedidoDto;
import com.example.atv0410.interfaces.IResource;
import com.example.atv0410.service.ItensPedidoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/itenspedido")
public class ItensPedidoResource implements IResource<ItensPedidoDto, Integer> {

    final ItensPedidoService itensPedidoService;

    public ItensPedidoResource(ItensPedidoService itensPedidoService){
        this.itensPedidoService = itensPedidoService;
    }

    /**
     * Cria um novo item de pedido no sistema.
     * @param entity
     * @return
     */
    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ItensPedidoDto create(@RequestBody ItensPedidoDto entity) {
        log.info("ItensPedidoResource::create");
        return null;
    }

    /**
     * Retorna os detalhes de um item de pedido específico pelo seu ID.
     * @param id
     * @return
     */
    @Override
    @GetMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ItensPedidoDto get(@PathVariable Integer id) {
        log.info("ItensPedidoResource::get(id)");
        return null;
    }

    /**
     * Retorna a lista de todos os itens de pedido.
     * @return
     */
    @Override
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<ItensPedidoDto> get() {
        log.info("ItensPedidoResource::get()");
        return List.of();
    }

    /**
     * Atualiza os detalhes de um item de pedido pelo seu ID.
     * @param id
     * @param entity
     * @return
     */
    @Override
    @PutMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ItensPedidoDto update(@PathVariable Integer id,
                                 @RequestBody ItensPedidoDto entity) {
        log.info("ItensPedidoResource::update(id, entity)");
        return null;
    }

    /**
     * Remove um item de pedido do sistema pelo seu ID.
     * @param id
     */
    @Override
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("ItensPedidoResource::delete(id)");
    }
}
