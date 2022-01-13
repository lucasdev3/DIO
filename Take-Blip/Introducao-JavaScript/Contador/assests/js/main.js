let numero = document.getElementById("numero");
let botaoSubtrair = document.getElementById("subtrair");
let botaoAdicionar = document.getElementById("adicionar");
let valorNumero = 0;


function subtrai() {
    console.log(valorNumero);
    if (valorNumero == 0) {
        console.log("Limite atingido");
        numero.style.color = "red";
        alert("Limite atingido");
        botaoSubtrair.disabled = true;
        botaoAdicionar.disabled = false;
        
    }
    else {
        valorNumero -= 1;
        numero.innerHTML = valorNumero;
        numero.style.color = "blue";
        botaoSubtrair.disabled = false;
        botaoAdicionar.disabled = false;
    }
}


function soma() {
    
    console.log(valorNumero);   
    if (valorNumero == 10) {
        console.log("Limite atingido");
        numero.style.color = "red";
        alert("Limite atingido");
        botaoSubtrair.disabled = false;
        botaoAdicionar.disabled = true;
    }
    else{
        valorNumero += 1;
        numero.innerHTML = valorNumero;
        numero.style.color = "blue";
        botaoAdicionar.disabled = false;
        botaoSubtrair.disabled = false;
    }
}

