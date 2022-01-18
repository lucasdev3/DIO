const botao = document.getElementById('mode-selector');
const titulo = document.getElementById('page-title');
const body = document.getElementsByTagName('body')[0];
const footer = document.getElementsByTagName('footer')[0];

function trocaModo() {
    if (body.className === "dark-mode"){
        body.classList.remove("dark-mode");
        footer.classList.remove("dark-mode");
        titulo.innerHTML = "Light Mode On";
        botao.innerHTML = "Dark Mode";
    }
    else if (!body.className){
        body.classList.add("dark-mode");
        footer.classList.add("dark-mode");
        titulo.innerHTML = "Dark Mode On";
        botao.innerHTML = "Light Mode";
    }
    else {
        console.log("Classe inválida...")
    }
}

botao.addEventListener('click', trocaModo)