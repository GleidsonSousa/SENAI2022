// // tagname, id, class

// // Exemplo tagname

// var texto = document.getElementsByTagName("h1");
// // console.log(texto);

// //Exemplo id
// var titulo = document.getElementById("titulo");
 
// var aluno = {
//     nome: "Gonzaga",
//     matricula:00001,  
// };


// titulo.innerHTML=`Nome: ${aluno.nome} </br> Matricula: ${aluno.matricula}`;

// titulo.style.color = "green";
// // titulo.style.margin = "200px"

// var mensagem = document.getElementById("mensagem");

// mensagem.style.display = "block";

// //Eemplo class

// var divisao =  document.getElementsByClassName("divisao");
// // console.log(divisao);

// // document.querySelector();
// // document.querySelectorAll();

// var  titulo2 =  document.querySelector("#titulo");   //id
// var  div =  document.querySelectorAll(".divisao");   //class
// var  msg =  document.querySelector("h1");   //tagname
// console.log(msg);

var busca = document.querySelector("#busca");

var linhas = document.querySelectorAll("tr");

var btBusca = document.querySelector("button");

btBusca.addEventListener("click", buscarNome);

busca.addEventListener("keyup", buscarNome);

function buscarNome(){

    console.log(busca.value);

    let encontrei = false;

    linhas.forEach((Linha) => {
        let temp = Linha.querySelector("td");
        if(temp != null){
            

        //     if(temp.innerHTML.toLowerCase() == busca.value.toLowerCase()) {
        //    alert("encontrei");
        //    encontrei = true;
        //    Linha.style.frontWeigth = "bold";
        //    Linha.style.color = "pink";

            //  }  

            if(temp.innerHTML.toLowerCase().includes(busca.value.toLowerCase())){
                Linha.style.display = "table-row";
            }  else{
                Linha.style,display = "none";
            }
        }
    });

    // if(!encontrei) alert("Não encontrei");
}


// let v1 = 1;
// let v2 = "1";

// if(v1 !== v2){
//      console.log("Não somos iguais");
// }

