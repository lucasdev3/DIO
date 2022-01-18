const maca = {
    value: 2
}

const laranja = {
    value: 3
}

const lista = [2, 3, 4, 5];

function mapComThis(array, thisArg) {
    return array.map(function(item) {
        return item * this.value;
    }, thisArg);
}

console.log(mapComThis(lista, maca));
console.log(mapComThis(lista, laranja));