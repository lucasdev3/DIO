let arrayAuxiliar = [];

function verificaAprovados(array, media) {
    
    for (let i=0; i < array.length; i++){
        let aluno = array[i]
        if (aluno['mediaFinal'] > media) {
            arrayAuxiliar.push(array[i]);
        }
    }
    return arrayAuxiliar;
}
alunos = [
    {
        'nome': 'lucas',
        'mediaFinal': 8
    },
    {
        'nome': 'tiago',
        'mediaFinal': 6
    },
    {
        'nome': 'caio',
        'mediaFinal': 3
    },
    {
        'nome': 'amanda',
        'mediaFinal': 9
    }
    ];

verificaAprovados(alunos, 5);
console.log(arrayAuxiliar)