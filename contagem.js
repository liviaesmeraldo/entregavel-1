function contarInteirosNoIntervalo(primeiroDado, N, conjuntoDeDados) {
    let contador = 0;

    for (let i = 0; i < conjuntoDeDados.length; i++) {
        const dado = conjuntoDeDados[i];

        if (dado >= primeiroDado && dado <= N && Number.isInteger(dado)) {
            contador++;
        }
    }

    return contador;
}

const primeiroDado = 3; // Substitua pelo primeiro dado
const N = 10; // Substitua por N
const conjuntoDeDados = [2, 4, 6, 8, 10, 3.5, 7, 9]; // Substitua pelo seu conjunto de dados

const quantidadeDeInteiros = contarInteirosNoIntervalo(primeiroDado, N, conjuntoDeDados);

console.log("Quantidade de inteiros no intervalo:", quantidadeDeInteiros);