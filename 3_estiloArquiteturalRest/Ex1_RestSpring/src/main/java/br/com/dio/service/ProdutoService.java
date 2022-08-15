package br.com.dio.service;

import java.util.List;

import br.com.dio.exception.ProductNullException;
import br.com.dio.exception.ProductPriceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dio.entity.Produto;
import br.com.dio.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto save(Produto produto) throws Exception {
        //exception - nao ira salvar o produto, caso o nome venha nulo
        if (produto.getNome() == null || produto.getPreco() == null)
            throw new ProductNullException();

        //exception - noa ira salvar o produto, caso o preço for 0
        if (produto.getPreco() < 0)
            throw new ProductPriceException();
        return repository.save(produto);
    }

    public Produto findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Produto> findAll() {
        return repository.findAll();
    }
}
