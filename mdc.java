class Main {
  public static void main(String[] args) {
        int numero1 = 100;
        int numero2 = 30;

        int resultado = calcularMDC(numero1, numero2);

        System.out.println("O MDC de " + numero1 + " e " + numero2 + " é: " + resultado);
  }

      public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // Retorna o valor absoluto do resultado
    }
}