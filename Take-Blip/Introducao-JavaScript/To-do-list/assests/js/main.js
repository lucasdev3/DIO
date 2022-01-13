let banco = [
    {'tarefa': 'Estudar JS', 'status': ''},
    {'tarefa': 'netflix', 'status': 'checked'}
]



const criarItem = (tarefa, status) => {
    const item = document.createElement('label');
    item.classList.add('to-do-list');
    item.innerHTML = `
        <div class="container-tarefas">
            <input type="checkbox" ${status}>
            <div>${tarefa}</div>
            <input type="button" value="X">
        </div>
    
    `;
    document.getElementById('todoList').appendChild(item);
}

const atualizarTela = () => {
    banco.forEach(item => criarItem(item.tarefa, item.status));
}

atualizarTela();