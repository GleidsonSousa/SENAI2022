
// var nome = "Cutuvelo de Camelo";
// //alert(`Meu nome é ${nome}`);

//LISTA 01 EXERCICIO 01
// let a = 5, b = 8, c = 3;
// let rest = (a+b)/c;
// alert (rest);

//LISTA 02 EXERCICIO 01
// let a = 1, b = 0, c = 0;

// if(a == b && c == b)(
//     alert("O triangulo é equilatero")
// ) 
//  if(a != b && c != b)(
//     alert("O triangulo é escaleno")
// )
//  if(a == b && c != b)
//     alert("O triangulo é isóceles")


// LISTA 02 EXERCICIO 02

var salarios = [3250, 2280, 4100, 1800]
salarios.forEach(salario =>{ 

    if(salario < 190398)
     result = salario * 0
    console.log(`seu salario é de R$ ${salario} o valor descontado será ${result}` )

     else if(salario > 190399)
     result = salario * (7.5/100)
    console.log(`seu salario é de R$ ${salario} o valor descontado será ${result}` )

})