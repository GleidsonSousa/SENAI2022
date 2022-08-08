var inpNome = document.querySelectorAll0("#nome");
var inpCargo = document.querySelectorAll("#cargo");
var inpSalario = document.querySelectorAll("#salario");


var tbody = document.querySelector("#table-body");

function cadastro(){

 let tr = document.createElement("tr");
 
 let tdNome = document.createElement("td");
 tdNome.innerHTML = inpNome.Value;
 let tdCaego = document.createElement("td");
 tdCargo.innerHTML = inpNome.Value;
 let tdSalario = document.createElement("td");
 tdSalario.innerHTML = inpNome.Value;
  
    tr.appendChild(tdNome);
    tr.appendChild(tdCaego);
    tr.appendChild(tdSalario);   

    tbody.appendChild(tr);
}

