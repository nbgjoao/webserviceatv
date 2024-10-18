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

    /**
     * Cria um novo produto no sistema.
     * @param entity
     * @return
     */
    @Override
    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ProdutoDto create(@RequestBody ProdutoDto entity) {
        log.info("ProdutoResource::create");
        return null;
    }

    /**
     * Retorna os detalhes de um produto específico pelo seu ID.
     * @param id
     * @return
     */
    @Override
    @GetMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ProdutoDto get(@PathVariable Integer id) {
        log.info("ProdutoResource::get(id)");
        return null;
    }

    /**
     * Retorna a lista de todos os produtos.
     * @return
     */
    @Override
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<ProdutoDto> get() {
        log.info("ProdutoResource::get()");
        return List.of();
    }

    /**
     * Atualiza os detalhes de um produto pelo seu ID.
     * @param id
     * @param entity
     * @return
     */
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

    /**
     * Remove um produto do sistema pelo seu ID.
     * @param id
     */
    @Override
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Integer id) {
        log.info("ProdutoResource::delete(id)");
    }
}
