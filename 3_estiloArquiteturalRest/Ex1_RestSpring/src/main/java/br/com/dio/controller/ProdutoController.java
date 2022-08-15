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

    @PostMapping(value = "/save") //maneira mais pratica de transformar em um metodo POST
    public ResponseEntity<Produto> salvaProduto(@RequestBody Produto produto) { //ira retornar o id do produto
        produto = service.save(produto);
        return ResponseEntity.ok().body(produto);
    }

    /* Exemplo 1
    //@RequestMapping(method = RequestMethod.GET, value = "/produto/save")
    @RequestMapping(method = RequestMethod.GET, value = "/save") //ira obter o endpoint base "/produto/save"
    public void salvaProduto(Produto produto) {

        service.save(produto);
    }

    // Exemplo 1
    @RequestMapping(method = RequestMethod.PUT, value = "/produto/update")
    public void salvaProduto(Produto produto) {

        service.save(produto);
    }*/

    // Exemplo 2
    /*
    @PostMapping //POST - cada metodo é usada para uma finalidade
    public ResponseEntity<Produto> salvaProduto1(@RequestBody Produto produto) { //ira retornar o id do produto
        produto = service.save(produto);
        return ResponseEntity.ok().body(produto);
    }

    @PatchMapping //PATCH
    public ResponseEntity<Produto> salvaProduto2(@RequestBody Produto produto) { //ira retornar o id do produto
        produto = service.save(produto);
        return ResponseEntity.ok().body(produto);
    }*/

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
