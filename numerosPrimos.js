function verificaPrimo(n) {
    if (n <= 1) {
      return false;
    }
  
    for (let i = 2; i < n; i++) {
      if (n % i === 0) {
        return false;
      }
    }
  
    return true;
  }
  
  const numero = 14; // Substitua 13 pelo número que você deseja verificar
  const ePrimo = verificaPrimo(numero);
  
  if (ePrimo) {
    console.log(numero + " é um número primo.");
  } else {
    console.log(numero + " não é um número primo.");
  }