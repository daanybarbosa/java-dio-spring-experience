package br.com.dio.Ex8_springbootTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /* ** Teste Unitario **
    @GetMapping("/test")
    public String saudacao(String nome){
        return String.format("Bem-vindo, %s", nome);
    }*/

    /* Usando a anotacao - @SpringBootTest*/
    @GetMapping("/test")
    public String saudacao(@RequestParam(name = "nome", defaultValue = "DIO") String nome){
        return String.format("Bem-vindo, %s", nome);
    }
}
