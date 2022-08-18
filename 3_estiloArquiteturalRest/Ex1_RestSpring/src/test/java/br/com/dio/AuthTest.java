package br.com.dio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.net.URI;

@SpringBootTest
@AutoConfigureMockMvc
public class AuthTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void deveRetornarSucessoComCredenciaisValidas() throws Exception {

        URI uri = new URI("/auth/signin");

        // corpo em json - será o conteudo que o mockMvc ira receber e enviar para a requisição.
        // Teste com credenciais invalidas
        String content = "{ \"username\" : \"danielebsilva\" , \"senha\" : \"123456\" }";

        mockMvc.perform(MockMvcRequestBuilders
                        .post(uri)
                        .content(content)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers
                        .status()
                        .is(200)); //status 200 - OK
    }

    @Test
    public void deveRetornarErroComCredenciaisInvalidas() throws Exception {

        URI uri = new URI("/auth/signin");

        //corpo em json - será o conteudo que o mockMvc ira receber e enviar para a requisição.
        String content = "{ \"username\" : \"danielebsilva\" , \"senha\" : \"123456789\" }";

        mockMvc.perform(MockMvcRequestBuilders
                        .post(uri)
                        .content(content)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers
                        .status()
                        .is(200)); //Error - Bad Credentials
    }
}
