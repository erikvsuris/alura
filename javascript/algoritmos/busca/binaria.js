const arr = [];

for (let i = 1; i <= 1000; i++) {
    arr.push(i);
}

function buscaBinaria(arr, inicio, fim, busca) {
    const meio = Math.floor((inicio + fim) / 2);
    if (inicio > fim) return -1;
    if (busca === arr[meio]) 
        return meio;
    if (busca < arr[meio]) 
        return buscaBinaria(arr, inicio, meio - 1, busca);
    if (busca > arr[meio]) 
        return buscaBinaria(arr, meio + 1, fim, busca);
}

console.log(buscaBinaria(arr, 0, arr.length - 1, 678));