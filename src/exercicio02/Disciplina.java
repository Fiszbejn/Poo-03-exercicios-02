package exercicio02;

public class Disciplina {
    String nome;
    double[] notas = new double[2];

    public Disciplina(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public double calculaMedia() {
        return (notas[0] + notas[1]) / 2;
    }

    public String verificaAprovacao() {
        if (calculaMedia() >= 6) {
            return "Aprovado";
        }else {
            return "Reprovado";
        }
    }
}
