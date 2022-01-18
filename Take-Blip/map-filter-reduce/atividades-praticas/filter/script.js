function filtraPares(array) {
    return array.filter(callback);
}

function callback(item) {
    return item % 2 === 0;
}

const lista = [1, 3, 8, 23, 24, 5, 18];

console.log(filtraPares(lista));