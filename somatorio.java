class Main {
    public static void main(String[] args) {
      int[] conjuntoNumerico = {1, 2, 7, 4, 5};
          int resultado = somatorio(conjuntoNumerico);
  
          System.out.println("O somatório é: " + resultado);
    }
  
        public static int somatorio(int[] numeros) {
          int soma = 0;
          for (int i = 0; i < numeros.length; i++) {
              soma += numeros[i];
          }
          return soma;
      }
  }