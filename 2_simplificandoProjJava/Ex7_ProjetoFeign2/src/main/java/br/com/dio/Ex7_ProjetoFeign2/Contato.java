package br.com.dio.Ex7_ProjetoFeign2;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Contato {

    private Long id;
    private String nome;
    private String telefone;

}
