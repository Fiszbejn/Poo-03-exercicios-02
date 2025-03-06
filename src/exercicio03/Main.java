package exercicio03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat dF = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();

        System.out.println("Informe as coordenadas do ponto 1: ");
        p1.x = sc.nextInt();
        p1.y = sc.nextInt();

        System.out.println("Informe as coordenadas do ponto 2: ");
        p2.x = sc.nextInt();
        p2.y = sc.nextInt();

        System.out.println();
        System.out.println("Distância de p1 para p2: " + dF.format(p1.calcularDistancia(p2)));
        System.out.println("Distância de p2 para p1: " + dF.format(p2.calcularDistancia(p1)));

        //impressao distancia até origem
        System.out.println("Distância de p1 a origem: "+ dF.format(p1.calcularDistanciaOrigem()));
        System.out.println("Distância de p2 a origem: "+ dF.format(p2.calcularDistanciaOrigem()));

        //impressao ponto mais proximo da origem
        System.out.println();
        Ponto aux = Ponto.calcularMenorDistanciaOrigem(p1, p2);
        System.out.println("Menor distância até a origem entre p1 e p2: "+ aux.formatarPonto());

    }
}
