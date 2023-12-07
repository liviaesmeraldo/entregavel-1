function calcularMDC(a, b) {
    while (b !== 0) {
        let temp = b;
        b = a % b;
        a = temp;
    }
    return Math.abs(a); // Retorna o valor absoluto do resultado
}

// Exemplo de uso
let numero1 = 100;
let numero2 = 30;

let resultado = calcularMDC(numero1, numero2);

console.log(`O MDC de ${numero1} e ${numero2} é:`, resultado);