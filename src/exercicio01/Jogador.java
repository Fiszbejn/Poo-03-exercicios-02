package exercicio01;

public class Jogador {
    String nome;
    int[] score = new int[3];

    public int calculaPontuacaoTotal() {
        int total = 0;
        for (int i : score) {
            total += i;
        }
        return total;
    }
}


