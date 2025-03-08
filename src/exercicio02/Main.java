package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a matrícula do aluno: ");
        int matricula = sc.nextInt();
        System.out.println("Digite o nome do aluno: ");
        String nome = sc.next();
        System.out.println("Digite o nome de cada uma das três matérias e suas notas: ");
        Disciplina[] disciplinas = new Disciplina[3];

        for (int i = 0; i < disciplinas.length; i++) {
            String nomeDisciplina;
            double[] notas = new double[2];

            System.out.println("Digite o nome da " + (i + 1) + "a disciplina: ");
            nomeDisciplina = sc.next();

            for (int j = 0; j < notas.length; j++) {
                System.out.println("Digite a " + (j + 1) + "a nota de " + nomeDisciplina + ": ");
                notas[j] = sc.nextDouble();
            }

            Disciplina disciplina = new Disciplina(nomeDisciplina, notas);
            disciplinas[i] = disciplina;
        }

        Aluno aluno = new Aluno(matricula, nome, disciplinas);
        //saida
        System.out.println("\tSAÍDA:");
        System.out.println("");
        System.out.println("Matrícula do aluno: " + aluno.matricula);
        System.out.println("Nome do aluno: " + aluno.nome);
        for (int i = 0; i < disciplinas.length; i++) {
            System.out.println(disciplinas[i].nome + "\tMédia: " + disciplinas[i].calculaMedia() + "\tStatus: " + disciplinas[i].verificaAprovacao());
        }
    }
}
