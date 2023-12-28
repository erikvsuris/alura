const arr = [4,5,2,3,1];

for (let i = 0; i < arr.length - 1; i++) {
    indiceMenor = i;

	for (let j = i + 1; j < arr.length; j++)
        if (arr[j] < arr[indiceMenor])
            indiceMenor = j;

    let aux = arr[indiceMenor];
    arr[indiceMenor] = arr[i];
    arr[i] = aux;
}

console.log(arr);