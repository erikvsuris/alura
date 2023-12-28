const arr = [7,4,6,5,9,2,3,8,1];

function quickSort(arr, esq, dir) {
    if (esq < dir) {
        let i = particionar(arr, esq, dir);

        if (esq < i - 1)
            quickSort(arr, esq, i - 1);
        if (i < dir)
            quickSort(arr, i, dir);
    }
    return arr;
}

function particionar(arr, esq, dir) {
    let pivo = arr[Math.floor((esq + dir) / 2)];
    let atualEsq = esq;
    let atualDir = dir;

    while (atualEsq <= atualDir) {
        while(arr[atualEsq] < pivo) {
            atualEsq++;
        }

        while(arr[atualDir] > pivo) {
            atualDir--;
        }

        if (atualEsq <= atualDir) {
            troca(arr, atualEsq, atualDir);
            atualEsq++;
            atualDir--;
        }
    }

    return atualEsq;
}

function troca(arr, de, para) {
    const temp = arr[de];
    arr[de] = arr[para];
    arr[para] = temp;
}

console.log(quickSort(arr, 0, arr.length - 1));