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

    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ItensPedidoDto create(@RequestBody ItensPedidoDto entity) {
        log.info("ItensPedidoResource::create");
        return null;
    }

    @Override
    @GetMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ItensPedidoDto get(@PathVariable Integer id) {
        log.info("ItensPedidoResource::get(id)");
        return null;
    }

    @Override
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<ItensPedidoDto> get() {
        log.info("ItensPedidoResource::get()");
        return List.of();
    }

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

    @Override
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("ItensPedidoResource::delete(id)");
    }
}
