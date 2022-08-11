package com.springframework;


public class Condutor {

    public static void main(String[] args) {
        Condutor condutor1 = new Condutor(new Carro());
        condutor1.automovel();

        Condutor condutor2 = new Condutor(new Moto());
        condutor2.automovel();
    }

    private Veiculo veiculo;

    public Condutor(Veiculo obj){
        this.veiculo = obj;
    }

    //private Carro veiculo;

    /*
    public Condutor(Carro obj){
        this.veiculo = obj;
    }*/

    public void automovel(){
        veiculo.acao();
    }
}
