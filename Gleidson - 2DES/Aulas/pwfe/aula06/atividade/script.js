//Apenas analistas e desenvolvedores podem possuir Admin os demais são apenas leitores;
//Apenas cargos de nível 3 ou superior podem ser Admin;
//Cargos inferiores a 3 podem ser removidos da lista de acesso;




var tabela =[
	
	{ 
		
		"funcionario":"Sancho Cedraz",
		"cargo":{
			"nome":"Analista",
			"nivel":2
		},
		
		"autorizado": true 
	},		
	{
		"funcionario":"Ionara Pederneiras",
		"cargo":{
			"nome":"Técnico",
			"nivel":2
		},
		"autorizado":true
	},
	{
		"funcionario":"Filipe Castanho",
		"cargo":{
			"nome":"Desenvolvedor",
			"nivel":1
		},
		"autorizado":false
	},
	{
		"funcionario":"Lívia Bicalho",
		"cargo":{
			"nome":"Analista",
			"nivel":3
		},
		"autorizado":true
	},
	{
		"funcionario":"Mauro Varanda",
		"cargo":{
			"nome":"Desenvolvedor",
			"nivel":3
		},
		"autorizado":true
	},	
	{
		"funcionario":"Sandro Rosário",
		"cargo":{
			"nome":"Técnico",
			"nivel":3
		},

		"autorizado":true
	}
]

var itemLista = document.querySelector(".Item-lista");

function carregar(){
       
	tabela.forEach(item =>{
            let novoItem =  itemLista.cloneNode(true);

            novoItem.classList.remove("modelo");

        novoItem.querySelector("#nome-fun").innerHTML = item.funcionario;
        novoItem.querySelector("#cargo-fun").innerHTML = item.cargo.nome;
        novoItem.querySelector("#nivel-fun").innerHTML = item.cargo.nivel;
        novoItem.querySelector("#autorizacao-fun").innerHTML = item.autorizado;

		if(item.autorizado){
			novoItem.querySelector("#autorizacao-fun").innerHTML = "Autorizado";
		}else{
			novoItem.querySelector("#autorizacao-fun").innerHTML = "Não Autorizado";
		}

            document.querySelector(".tabela").appendChild(novoItem);       
        });

		if(item.cargo.nivel){

		}
	
}


function removerItem(e) {

		e.parentNode.remove();
}