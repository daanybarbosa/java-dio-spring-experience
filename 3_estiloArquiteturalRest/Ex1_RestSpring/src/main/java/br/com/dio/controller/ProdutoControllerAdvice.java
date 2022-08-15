package br.com.dio.controller;

import br.com.dio.exception.ProductNullException;
import br.com.dio.exception.ProductPriceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ProdutoControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> error(){
        Map<String, Object> body = new HashMap<String, Object>();
        body.put("message", "Ocorreu um erro generico");

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }

    @ExceptionHandler(ProductNullException.class)
    public ResponseEntity<Object> capturaErrorNull(){
        Map<String, Object> body = new HashMap<String, Object>();
        body.put("message", "Verifique os campos do produto");

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }

    @ExceptionHandler(ProductPriceException.class)
    public ResponseEntity<Object> capturaErrorPreco(){

        Map<String, Object> body = new HashMap<String, Object>();
        body.put("message", "Verifique o preço do produto");

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }
}
