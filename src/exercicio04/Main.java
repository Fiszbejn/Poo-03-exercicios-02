package exercicio04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, cargo;
        double salario, porcentagem;

        System.out.println("Nome do Funcionário: ");
        nome = sc.next();
        System.out.println("Cargo do Funcionário: ");
        cargo = sc.next();
        System.out.println("Salário do Funcionário: ");
        salario = sc.nextDouble();

        Funcionario f1 = new Funcionario(nome, cargo, salario);

        //aumentar o salario de acordo com uma porcentagem
        System.out.println("Digite a porcentagem de aumento (0 - 100): ");
        porcentagem = sc.nextDouble();
        System.out.println();
        f1.aumentarSalario(porcentagem);
        System.out.println("Novo salário R$ " + f1.salario);

        //aumentar o salario de acordo com uma porcentagem e cargo
        System.out.println("Digite o cargo do funcionário: ");
        String cargoAlvo = sc.next();
        System.out.println("Digite a porcentagem de aumento (0 - 100): ");
        porcentagem = sc.nextDouble();
        System.out.println();
        f1.aumentarSalario(cargo, porcentagem);
        System.out.println("Cargo: " + f1.cargo + " Novo Salário R$ " + f1.salario);


    }

}
