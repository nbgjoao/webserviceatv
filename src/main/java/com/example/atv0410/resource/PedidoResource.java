package com.example.atv0410.resource;

import com.example.atv0410.dto.PedidoDto;
import com.example.atv0410.interfaces.IResource;
import com.example.atv0410.service.PedidoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/pedido")
public class PedidoResource implements IResource<PedidoDto, Integer>{

    final PedidoService pedidoService;
    public PedidoResource(PedidoService pedidoService){
        this.pedidoService = pedidoService;
    }

    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public PedidoDto create(@RequestBody PedidoDto entity) {
        log.info("PedidoResource::create");
        return null;
    }

    @Override
    @GetMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public PedidoDto get(@PathVariable Integer id) {
        log.info("PedidoResource::get(id)");
        return null;
    }

    @Override
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<PedidoDto> get() {
        log.info("PedidoResource::get()");
        return List.of();
    }

    @Override
    @PutMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )

    public PedidoDto update(@PathVariable Integer id,
                            @RequestBody PedidoDto entity) {
        log.info("PedidoResource::update(id,entity)");
        return null;
    }

    @Override
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("PedidoResource::delete(id)");
    }
}
