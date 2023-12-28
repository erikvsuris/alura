const arr = [7,4,6,5,9,2,3,8,1];

function mergeSort(arr) {
    if (arr.length > 1) {
        const meio = Math.floor(arr.length / 2);
        const par1 = mergeSort(arr.slice(0, meio));
        const par2 = mergeSort(arr.slice(meio, arr.length));
        arr = merge(par1, par2);
    }
    
    return arr;
}

function merge(arr1, arr2) {
    const arrFinal = [];
    let pos1 = 0;
    let pos2 = 0;

    while (pos1 < arr1.length && pos2 < arr2.length) {
        if (arr1[pos1] < arr2[pos2]) {
            arrFinal.push(arr1[pos1]);
            pos1++;
        } else {
            arrFinal.push(arr2[pos2]);
            pos2++;
        }
    }

    return arrFinal.concat(pos1 < arr1.length ? arr1.slice(pos1) : arr2.slice(pos2));
}

console.log(mergeSort(arr));