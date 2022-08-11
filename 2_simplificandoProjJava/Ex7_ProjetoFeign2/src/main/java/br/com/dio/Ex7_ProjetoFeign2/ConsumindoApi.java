package br.com.dio.Ex7_ProjetoFeign2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "agenda", url = "http://localhost:8080/contato") //passar a url que iremos alimentar a API
public interface ConsumindoApi {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    Contato retornaContato();
}
