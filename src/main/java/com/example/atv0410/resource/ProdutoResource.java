package com.example.atv0410.resource;

import com.example.atv0410.dto.PedidoDto;
import com.example.atv0410.dto.ProdutoDto;
import com.example.atv0410.interfaces.IResource;
import com.example.atv0410.service.PedidoService;
import com.example.atv0410.service.ProdutoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/produto")
public class ProdutoResource implements IResource<ProdutoDto, Integer>{

    final ProdutoService produtoService;
    public ProdutoResource(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ProdutoDto create(@RequestBody ProdutoDto entity) {
        log.info("ProdutoResource::create");
        return null;
    }

    @Override
    @GetMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ProdutoDto get(@PathVariable Integer id) {
        log.info("ProdutoResource::get(id)");
        return null;
    }

    @Override
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<ProdutoDto> get() {
        log.info("ProdutoResource::get()");
        return List.of();
    }

    @Override
    @PutMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ProdutoDto update(@PathVariable Integer id,
                             @RequestBody ProdutoDto entity) {
        log.info("ProdutoResource::update(id,entity)");
        return null;
    }

    @Override
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("ProdutoResource::delete(id)");
    }
}
