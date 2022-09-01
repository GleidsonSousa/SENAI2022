

var tbody = document.querySelector("#tlbody")

function addFuncionario(){
    let tr = document.createElement("tr")

    let nomeValue = document.createElement("td")
    nomeValue.innerHTML = nome.value 
    
    let cargoValue = document.createElement("td")
    cargoValue.innerHTML = cargo.value

    let salarioValue = document.createElement("td")
    salarioValue.innerHTML = salario.value

    tr.appendChild(nomeValue)
    tr.appendChild(cargoValue)
    tr.appendChild(salarioValue)

    tbody.appendChild(tr);
}