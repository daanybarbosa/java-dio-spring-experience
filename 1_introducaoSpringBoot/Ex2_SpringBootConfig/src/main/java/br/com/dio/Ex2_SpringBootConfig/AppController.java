package br.com.dio.Ex2_SpringBootConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}") //anotacao indica injetar todos os valores, com o inicio seja app.message
    private String appMessage;

    @Value("${ENV_DB_URL:NENHUMA}") //ira exibir essa mensagem, caso nao tenha nenhuma variavel de ambiente
    private String dbEnvironmentVariable;

    @GetMapping("/") //localhost:8080
    public String getAppMessagee(){
        return appMessage;
    }

    @GetMapping("/envVariable") //localhost:8080/envVariable
    public String getEnvironmentVariable(){
        return "A seguinte variavel de ambiente foi passada: " + dbEnvironmentVariable;
    }
}
