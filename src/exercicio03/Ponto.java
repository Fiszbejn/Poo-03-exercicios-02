package exercicio03;

public class Ponto {
    int x;
    int y;

    public double calcularDistancia(Ponto p) {
        double distancia = Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
        return distancia;
    }

    public double calcularDistanciaOrigem() {
        Ponto origem = new Ponto();
        return calcularDistancia(origem);
    }

    public static Ponto calcularMenorDistanciaOrigem(Ponto p1,Ponto p2) {
        double dp1 = p1.calcularDistanciaOrigem();
        double dp2 = p2.calcularDistanciaOrigem();
        if(dp1 < dp2){
            return p1;
        }else{
            return p2;
        }
    }

    public String formatarPonto() {
        return "(" + x + ", "+ y + ")";
    }
}
