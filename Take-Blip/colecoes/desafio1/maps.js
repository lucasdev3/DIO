function getAdmins(map) {
    for (users of usuarios) {
        if (users[1] === 'Admin'){
            console.log(users[0]);
        }
    }
}

const usuarios =  new Map();

usuarios.set('Luiz', 'Admin')
usuarios.set('Stephany', 'Convidado')
usuarios.set('Lucas', 'Admin')

getAdmins(usuarios);