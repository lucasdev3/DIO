const soma = () => {
    var num1 = parseInt(document.getElementById('num1').value);
    var num2 = parseInt(document.getElementById('num2').value);
    const item = document.createElement('label');

    if ((num1 + num2) < 10)  {
        item.innerHTML = `
        <p>O resultado da soma de ${num1} + ${num2} = ${num1 + num2}, que é menor que 10 e menor que 20</p>
    `;
    }
    else if ((num1 + num2) > 10 && (num1 + num2) < 20) {
        item.innerHTML = `
        <p>O resultado da soma de ${num1} + ${num2} = ${num1 + num2}, que é maior que 10 e menor que 20</p>
    `;
    }
    else if ((num1 + num2) === 10) {
        item.innerHTML = `
        <p>O resultado da soma de ${num1} + ${num2} = ${num1 + num2} que é igual 10 e menor que 20</p>
    `;
    }
    else if ((num1 + num2) === 20) {
        item.innerHTML = `
        <p>O resultado da soma de ${num1} + ${num2} = ${num1 + num2} que é igual 20 e menor que 20</p>
    `;
    }
    else{
        item.innerHTML = `
        <p>O resultado da soma de ${num1} + ${num2} = ${num1 + num2} que é maior que 10 e  20</p>
    `;
    }

    document.getElementById("resultado").appendChild(item);
}