function fibonacci(N) {
    if (N <= 0) {
        return [];
    } else if (N === 1) {
        return [0];
    } else if (N === 2) {
        return [0, 1];
    }

    const sequence = [0, 1];
    for (let i = 2; i < N; i++) {
        const nextTerm = sequence[i - 1] + sequence[i - 2];
        sequence.push(nextTerm);
    }

    return sequence;
}

const N = 10; // Substitua 10 pelo número de termos que você deseja gerar
const resultado = fibonacci(N);

console.log(resultado);