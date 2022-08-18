package br.com.dio;

import br.com.dio.entity.Produto;
import br.com.dio.exception.ProductPriceException;
import br.com.dio.service.ProdutoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

// Exemplo 3 - Com @SpringBootTest
@SpringBootTest
public class ProdutoTest {

    @Autowired
    private ProdutoService produtoService;

    @Test
    public void verificaValorNegativoNoProduto() throws Exception {
        Produto produto = new Produto();

        produto.setNome("Teste");
        produto.setPreco(-10.0);

        assertThrows(ProductPriceException.class, () -> produtoService.save(produto));
    }
}


/* // Exemplo 2 - Sem @SpringBootTest
public class ProdutoTest {

    @Autowired
    private ProdutoService produtoService;

    @Test
    public void verificaValorNegativoNoProduto() throws Exception {
        Produto produto = new Produto();

        produto.setNome("Teste");
        produto.setPreco(-10.0);

        produtoService.save(produto);

        assertNull(produto.getId());
        assertEquals(produto.getId(), 1);
    }


    // Exemplo 1 - Teste unitario
    // @Test
    // public void testeFalso(){
    //     assertTrue(true);
    // }
}*/
