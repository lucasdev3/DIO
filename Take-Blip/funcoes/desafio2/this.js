function calculaIdade(anos) {
    return `Daqui a ${anos} anos, ${this.nome} terá ${this.idade + anos} anos de idade`; 
}

const pessoa1 = {
    nome: "Maria",
    idade: 30
}

const pessoa2 = {
    nome: "lucas",
    idade: 25
}

console.log(calculaIdade.call(pessoa2, 30))
console.log(calculaIdade.apply(pessoa1, [7]))