package br.com.dio.modulo1.desafios;

import java.util.Scanner;

/**
 * Desafio - Jogadores Viciados
 *
 * Sabemos que você adora passar horas jogando jogos como Liga of Legendas (LOL)
 * e Contra-Strike (CS). LOL pode ser o seu queridinho, mas você também gosta de usar
 * todas suas grandes habilidades no Contra-Strike!
 *
 * Com tanto treinamento, você começpu a fazer vídeos das suas jogadas, e eles estão sempre
 * sendo exibidos na JC - Jogadores Viciados, uma página na internet que publica gameplays
 * dos alunos da universidade.
 *
 * Como a página têm muitos acessos, está sempre publicando material novo, isso pode dificultar
 * na hora de tentar encontrar algum vídeo específico. Entretanto, como você é programador e
 * domina a artes de conseguir o que quer por meio do código, você decidiu escrever um programa
 * para encontrar os seus vídeos na página. Dada a lista de gameplays publicados na página,
 * determine quantos gameplays seus de Contra-Strike foram publicados.
 *
 * Entrada
 * A entrada contém vários casos de teste. A primeira linha de cada caso contém dois inteiros N e I
 * (1 ≤ N ≤ 104, 1000 ≤ I ≤ 9999), o número de gameplays publicados na página e o seu identificador
 * na universidade, respectivamente.
 *
 * As próximas N linhas descrevem os gameplays publicados. Cada gameplay é descrito por dois
 * inteiros i e j (1000 ≤ i ≤ 9999, j=0 ou 1), onde i é o identificador na universidade do autor do
 * gameplay, e j=0 se o gameplay é de Contra-Strike, ou j=1 se é de Liga of Legendas.
 *
 * A entrada termina com fim-de-arquivo (EOF).
 *
 * Saída
 * Para cada caso de teste, imprima uma única linha com um número indicando quantos gameplays seus de Contra-Strike foram publicados na página.
 */
public class desafio03 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //1 linha
        int number, id;

        System.out.println("Informe o numero de gameplayes da pagina: ");
        number = sc.nextInt();

        System.out.println("Informe o indicador da universidade: ");
        id = sc.nextInt();

        int count = 0;

        while(number > 0){
            int id1, num;

            //2 linha
            System.out.println("Informe o indicador da universidade: ");
            id1 = sc.nextInt();
            System.out.println("Informe o indicador do jogo - 0 para Contra-Strike e 1 para LOL: ");
            num = sc.nextInt();

            if(id == id1 && num == 0 ){
                count++;
            }
            number--;
        }
        System.out.println(count);
    }
}