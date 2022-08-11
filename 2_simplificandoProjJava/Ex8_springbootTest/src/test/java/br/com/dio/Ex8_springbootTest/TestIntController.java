package br.com.dio.Ex8_springbootTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest //usada para realizar testes de requisição de controller ou de REST
@ExtendWith(SpringExtension.class)
public class TestIntController {

    @Autowired
    private MockMvc mvc;

    @Test
    //teste de integracao
    public void testInt() throws Exception {
        RequestBuilder requisicao = get("/test");
        MvcResult resultado = mvc.perform(requisicao).andReturn();
        assertEquals("Bem-vindo, DIO", resultado.getResponse().getContentAsString());
    }

    @Test
    public void testIntComArgumento() throws Exception {
        mvc.perform(get("/test?nome=Daniele"))
                .andExpect(content().string("Bem-vindo, Daniele"));
    }
}
