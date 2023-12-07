import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
 int primeiroDado = 3; // Substitua pelo primeiro dado
        int N = 10; // Substitua por N
        List<Double> conjuntoDeDados = new ArrayList<>();
        conjuntoDeDados.add(2.0);
        conjuntoDeDados.add(4.0);
        conjuntoDeDados.add(6.0);
        conjuntoDeDados.add(8.0);
        conjuntoDeDados.add(10.0);
        conjuntoDeDados.add(3.5);
        conjuntoDeDados.add(7.0);
        conjuntoDeDados.add(9.0); // Substitua pelo seu conjunto de dados

        int quantidadeDeInteiros = contarInteirosNoIntervalo(primeiroDado, N, conjuntoDeDados);

        System.out.println("Quantidade de inteiros no intervalo: " + quantidadeDeInteiros);
    }

   public static int contarInteirosNoIntervalo(int primeiroDado, int N, List<Double> conjuntoDeDados) {
        int contador = 0;

        for (Double dado : conjuntoDeDados) {
            if (dado >= primeiroDado && dado <= N && dado == Math.floor(dado)) {
                contador++;
            }
        }

        return contador;
    }
  
}
