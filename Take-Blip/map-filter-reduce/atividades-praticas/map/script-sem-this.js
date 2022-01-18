function mapSemThis(array) {
    return array.map(function(item) {
        return item * 2;
    });
}

const lista = [2, 4, 6, 8, 10];

console.log(mapSemThis(lista));
console.log(lista);