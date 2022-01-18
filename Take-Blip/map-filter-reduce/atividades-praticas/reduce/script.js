function somaNumeros(array) {
    return array.reduce(function(prev, current) {
        console.log('Previus: ', prev);
        console.log('Current: ', current);
        return prev + current;
    })
}

const lista = [1, 2, 3];

console.log(somaNumeros(lista));