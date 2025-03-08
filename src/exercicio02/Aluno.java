package exercicio02;

public class Aluno {
    int matricula;
    String nome;
    Disciplina[] disciplinas = new Disciplina[3];

    public Aluno(int matricula, String nome, Disciplina[] disciplinas) {
        this.matricula = matricula;
        this.nome = nome;
        this.disciplinas = disciplinas;
    }
}
