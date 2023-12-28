const arr = [];

for (let i = 1; i <= 100000000; i++) {
    arr.push(i);
}

function buscaLinear(arr, busca) {
    for (let i = 0; i < arr.length; i++)
        if (busca === arr[i]) return i;
}

console.log(buscaLinear(arr, 99999999));