//Apenas analistas e desenvolvedores podem possuir Admin os demais são apenas leitores;
//Apenas cargos de nível 3 ou superior podem ser Admin;
//Cargos inferiores a 3 podem ser removidos da lista de acesso;



[
	{
		"funcionario":"Sancho Cedraz",
		"cargo":{
			"nome":"Analista",
			"nível":2
		},
		"autorizado": Positivo
	},		
	{
		"funcionario":"Ionara Pederneiras",
		"cargo":{
			"nome":"Técnico",
			"nível":2
		},
		"autorizado":Negativo
	},
	{
		"funcionario":"Filipe Castanho",
		"cargo":{
			"nome":"Desenvolvedor",
			"nível":1
		},
		"autorizado":Negativo
	},
	{
		"funcionario":"Lívia Bicalho",
		"cargo":{
			"nome":"Analista",
			"nível":3
		},
		"autorizado":Positivo
	},
	{
		"funcionario":"Mauro Varanda",
		"cargo":{
			"nome":"Desenvolvedor",
			"nível":3
		},
		"autorizado":Negativo
	},	
	{
		"funcionario":"Sandro Rosário",
		"cargo":{
			"nome":"Técnico",
			"nível":3
		},
		"autorizado":Positivo
	}
]

var itemLista = document.querySelector(".item-lista");
function carregar(){
       
        carrinho.forEach(item =>{
            let novoItem =  itemLista.cloneNode(true);

            novoItem.classList.remove("modelo");

        novoItem.querySelector("#nome-fun").innerHTML = item.funcionario;
        novoItem.querySelector("#cargo-fun").innerHTML = item.cargo.nome;
        novoItem.querySelector("#nivel-fun").value = item.cargo.nível;
        novoItem.querySelector("#autorizacao-fun").innerHTML = item.autorizado;

            document.querySelector(".tabeliha").appendChild(novoItem);       
        });
}

function removerItem(e) {
    e.parentNode.remove();
}