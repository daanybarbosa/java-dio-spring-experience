package br.com.dio.modulo1.desafios;

import java.util.Scanner;

/**
 * Desafio - Médias ponderadas
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
 * Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
 * Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o
 * primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
 *
 * Entrada
 * O arquivo de entrada contém um valor inteiro N na primeira linha.
 * Cada N linha a seguir contém um caso de teste com três valores com uma casa decimal cada valor.
 *
 * Saída
 * Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.
 */

public class desafio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c;
        double media;

        System.out.println("Informe o numero de casos: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Informe a: ");
            a = Double.parseDouble(input.next());

            System.out.println("Informe b: ");
            b = Double.parseDouble(input.next());

            System.out.println("Informe c: ");
            c = Double.parseDouble(input.next());

            // TODO: complete os espaços em branco com sua solução para o problema
            media = ((a * 2) + (b * 3) + (c * 5)) / 10;
            System.out.println(String.format("Media: %.1f ", media));
        }
    }
}
