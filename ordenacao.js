function quickSort(arr) {
    if (arr.length <= 1) {
        return arr;
    }

    const pivot = arr[0]; // Escolha um elemento como pivô (pode ser qualquer elemento do array)
    const left = [];
    const right = [];

    for (let i = 1; i < arr.length; i++) {
        if (arr[i] < pivot) {
            left.push(arr[i]); // Elementos menores que o pivô vão para a esquerda
        } else {
            right.push(arr[i]); // Elementos maiores ou iguais ao pivô vão para a direita
        }
    }

    return [...quickSort(left), pivot, ...quickSort(right)]; // Recursivamente ordena a esquerda e a direita e concatena com o pivô
}

const array = [4, 2, 7, 1, 9, 3];
const sortedArray = quickSort(array);

console.log(sortedArray);