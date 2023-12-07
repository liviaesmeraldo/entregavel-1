import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    int N = 10; // Substitua 10 pelo número de termos que você deseja gerar
        List<Integer> resultado = fibonacci(N);

        System.out.println(resultado);
  }

  public static List<Integer> fibonacci(int N) {
        List<Integer> sequence = new ArrayList<>();

        if (N <= 0) {
            return sequence;
        } else if (N == 1) {
            sequence.add(0);
            return sequence;
        } else if (N == 2) {
            sequence.add(0);
            sequence.add(1);
            return sequence;
        }

        sequence.add(0);
        sequence.add(1);

        for (int i = 2; i < N; i++) {
            int nextTerm = sequence.get(i - 1) + sequence.get(i - 2);
            sequence.add(nextTerm);
        }

        return sequence;
    }
}