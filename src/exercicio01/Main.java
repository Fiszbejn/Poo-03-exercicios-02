package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogador jogador = new Jogador();

        System.out.print("Digite seu nome: ");
        jogador.nome = sc.nextLine();

        for (int i = 0; i < jogador.score.length; i++) {
            System.out.print("Digite a pontuação do jogador na "+(i+1)+"a rodada: ");
            jogador.score[i] = sc.nextInt();
        }
        System.out.println("Jogador: "+jogador.nome+"\nPontuação Total: "+jogador.calculaPontuacaoTotal());
    }
}
