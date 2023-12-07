function somatorio(numeros) {
    let soma = 0;
    for (let i = 0; i < numeros.length; i++) {
        soma += numeros[i];
    }
    return soma;
}

// Exemplo de uso
let conjuntoNumerico = [1, 2, 7, 4, 5];
let resultado = somatorio(conjuntoNumerico);

console.log("O somatório é:", resultado);