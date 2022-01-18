const lista = [
    {
        nome: 'sabao',
        preco: 30
    },
    {
        nome: 'cereal',
        preco: 12
    },
    {
        nome: 'toalha',
        preco: 30
    }
];

const saldo = 100;

function calculaSaldo(arrayPrecos, saldo) {
    return arrayPrecos.reduce(function(prev, current) {
        console.log('Saldo: ', prev);
        console.log('Desconto: ', current.preco);
        return prev - current.preco;
        
    }, saldo)
    
}

console.log(calculaSaldo(lista, saldo))