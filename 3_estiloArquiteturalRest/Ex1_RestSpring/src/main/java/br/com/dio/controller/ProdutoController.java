package br.com.dio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.dio.entity.Produto;
import br.com.dio.service.ProdutoService;

@RestController
@RequestMapping(value = "/produto") //endpoint base
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    /*
    @PostMapping(value = "/save") //maneira mais pratica de transformar em um metodo POST
    public ResponseEntity salvaProduto(@RequestBody Produto produto) { //ira retornar o id do produto
        try {
            produto = service.save(produto);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

        return ResponseEntity.ok().body(produto);
    } */

    @PostMapping(value = "/save") //maneira mais pratica de transformar em um metodo POST
    public ResponseEntity<Produto> salvaProduto(@RequestBody Produto produto) throws Exception { //ira retornar o id do produto

        produto = service.save(produto);
        return ResponseEntity.ok().body(produto);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Produto> buscaProduto(@PathVariable Long id) {
        Produto produto = service.findById(id);
        return ResponseEntity.ok().body(produto);
    }

    @GetMapping(value = "/busca-todos")
    public ResponseEntity<List<Produto>> buscaTodosProdutos() {
        List<Produto> produtos = service.findAll();
        return ResponseEntity.ok().body(produtos);
    }
}
