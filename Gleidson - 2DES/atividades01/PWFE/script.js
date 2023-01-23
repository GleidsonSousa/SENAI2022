
//Script funcional EX01 
var textoPlate = document.querySelector("#textoP");
var btValidarPlaca = document.querySelector("#validarPlaca");
var resposta1 = document.querySelector("#validaPlaca");

btValidarPlaca.addEventListener("click", validarPlaca);
textoPlate.addEventListener("keyup", validarPlaca);


// Exercicio 01;

function validarPlaca() {

  //console.log(textoPlate.value);

    resposta1.style.color="red"
    var Result = "ERRO [01], Placa inválida.";

    const VerifyPlates = /^[a-zA-Z]{3}[0-9]{4}$/;
    const VerifyNewFormat = /^[a-zA-Z]{3}[0-9]{1}[a-zA-Z]{1}[0-9]{2}$/;

    if (VerifyPlates.test(textoPlate.value)) {

        Result = "Placa válida no formato antigo.";
        resposta1.style.color="green"
    } else if (VerifyNewFormat.test(textoPlate.value)) {
      resposta1.style.color="green"
        Result = "Placa válida (Novo formato padrão Mercosul).";
    }
        
   resposta1.value = Result;
    

}

//Script funcional EX02
var textoCPF = document.querySelector("#textoCpf");
var btValidacpf = document.querySelector("#btnCPF");
var resposta2 = document.querySelector("#validacpf");

btValidacpf.addEventListener("click", validarCPF);
textoCPF.addEventListener("keyup", validarCPF);


// Exercicio 02;
function validarCPF() {

    //console.log(textoCPF.value);

    textoCPF.value = textoCPF.value.replace(/\D/g, '');
    resposta2.style.color="green"
    var result2 = "Esté CPF é inválido."; 
    var result = "Esté CPF é válido.";
    if (textoCPF.value.toString().length != 11 || /^(\d)\1{10}$/.test(textoCPF.value)){
      resposta2.value = result2;
    } 

    [9, 10].forEach(function (j) {
        var somar = 0, r;
        textoCPF.value.split(/(?=)/).splice(0, j).forEach(function (e, i) {
            somar += parseInt(e) * ((j + 2) - (i + 1));
        });
        r = somar % 11;
        r = (r < 2) ? 0 : 11 - r;
        if (r != textoCPF.value.substring(j, j + 1)){
          resposta2.value = result = result2;
          resposta2.style.color="red"
        } 

       
    });
    resposta2.value = result;
}
    // Exercicio 03; 

//Script funcional EX03

var textoTel = document.querySelector("#textoTelefone");
var textoTel1 = document.querySelector("#textoTelefone1");
var btGerarTel = document.querySelector("#btnTel");
var resposta3 = document.querySelector("#geratelefone");

btGerarTel.addEventListener("click", gerarTelefone);
//textoTel.addEventListener("keyup", gerarTelefone);
//textoTel1.addEventListener("keyup", gerarTelefone);

function gerarTelefone(){
  //console.log(textoTel1.value,textoTel.value);

    var retornar = [];
    for(i = 0; i < parseInt(textoTel1.value); i++){
        const number1 = aleatorio(); 
        const number2 = aleatorio();
       
        retornar [i] = `  (${parseInt(textoTel.value)}) 9${number1}-${number2}`;
    }
    resposta3.value = retornar;
}
      function aleatorio() {
        const aleat = Math.floor(Math.random() * 9999);
       
        return ("" + aleat).padStart(4,'0'); 
      }



//Script funcional EX03

var textoCPFS = document.querySelector("#textoCPFs");
var btGerarCPF = document.querySelector("#btnGeracpf");
var resposta4 = document.querySelector("#geracpf");

btGerarCPF.addEventListener("click", gerarCPF);
//textoTel.addEventListener("keyup", gerarTelefone);


//Exercicio04

      function gerarCPF() {
        var retorna = [];
    for(i = 0; i < parseInt(textoCPFS.value); i++){ const num1 = aleatorio2(); 
        const num2 = aleatorio2();
        const num3 = aleatorio2();
      
        const digito1 = dig(num1, num2, num3); 
        const digito2 = dig(num1, num2, num3, digito1); 
      
       
        retorna [i] =`  ${num1}.${num2}.${num3}-${digito1}${digito2}`;

    
    }
            resposta4.value = retorna;
      }

      function dig(numero, numero1, numero2, numero3) { 
        
       
        const numbers = numero.split("").concat(numero1.split(""), numero2.split(""));
        
        if (numero3 !== undefined){ 
          numbers[9] = numero3;
        }
        
        let x = 0;
         
       
      
        for (let i = (numero3 !== undefined ? 11:10), j = 0; i >= 2; i--, j++) {
          x += parseInt(numbers[j]) * i;
        }
        
        const y = x % 11;
    
        return y < 2 ? 0 : 11 - y; 

      }
      function aleatorio2() {
        const aleat = Math.floor(Math.random() * 999);
       
        return ("" + aleat).padStart(3, '0'); 
      }
    
