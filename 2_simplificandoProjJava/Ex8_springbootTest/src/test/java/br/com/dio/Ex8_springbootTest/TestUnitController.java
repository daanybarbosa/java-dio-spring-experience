package br.com.dio.Ex8_springbootTest;

import br.com.dio.Ex8_springbootTest.controller.TestController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUnitController {

    @Test
    public void testUnit(){

        TestController controller = new TestController();
        String resultado = controller.saudacao("DIO");

        assertEquals("Bem-vindo, DIO", resultado);
    }
}
