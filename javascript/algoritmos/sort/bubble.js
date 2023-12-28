const arr = [4,5,2,3,1];

for (let i = 0; i < arr.length - 1; i++) {
	for (let j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
            let aux = arr[j];
            arr[j] = arr[j + 1];
            arr[j+1] = aux;
        }
    }
}