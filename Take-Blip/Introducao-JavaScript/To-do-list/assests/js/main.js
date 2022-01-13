let banco = [
    {'tarefa': 'Estudar JS', 'status': ''},
    {'tarefa': 'netflix', 'status': 'checked'},
    {'tarefa': 'teste', 'status': 'checked'},
    {'tarefa': 'teste4', 'status': 'checked'},
]

const getBanco = () => localStorage.getItem('todoList') ?? [];

const criarItem = (tarefa, status, indice) => {
    const item = document.createElement('label');
    item.classList.add('to-do-list');
    item.innerHTML = `
        <div class="container-tarefas">
            <input type="checkbox" ${status} data-indice=${indice}>
            <div>${tarefa}</div>
            <input type="button" value="X" data-indice=${indice}>
        </div>
    
    `;
    document.getElementById('todoList').appendChild(item);
}

// Limpando tarefas para que as informações não sejam duplicadas 
// ao atualizar tela varias vezes
const limparTarefas = () => {
    const todoList = document.getElementById('todoList');
    while (todoList.firstChild) {
        todoList.removeChild(todoList.lastChild);
    }
}

const atualizarTela = () => {
    limparTarefas();
    banco.forEach( (item, indice) => criarItem(item.tarefa, item.status, indice));
}

const inserirItem = (evento) => {
    const tecla = evento.key;
    const texto = evento.target.value;
    if (tecla === 'Enter') {
        banco.push({'tarefa': texto, 'status': 'unchecked'})
        atualizarTela();
        // limpar campo de digitar tarefa
        evento.target.value = ''; 
    }
}

const removerItem = (indice) => {
    banco.splice(indice, 1);
    atualizarTela();
}

const atualizarItem = (indice) => {
    banco[indice].status =  banco[indice].status === '' ? 'checked' : '';
    atualizarTela();
}

const clickItem = (evento) => {
    const elemento = evento.target;
    if (elemento.type === 'button') {
        const indice = elemento.dataset.indice;
        removerItem(indice);
    }
    else if (elemento.type === 'checkbox') {
        const indice = elemento.dataset.indice;
        atualizarItem(indice);
    }
}

document.getElementById('newItem').addEventListener('keypress', inserirItem)
document.getElementById('todoList').addEventListener('click', clickItem);

atualizarTela();