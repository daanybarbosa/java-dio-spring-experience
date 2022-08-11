package br.com.dio.modulo2.introducaoSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//anotação basica do Spring
@RestController
public class HelloController {

    //ira mapear o caminho "/" (raiz)
    @GetMapping("/")
    public String helloMessage(){
        return "Hello, Digital Innovation One!";
    }
}
