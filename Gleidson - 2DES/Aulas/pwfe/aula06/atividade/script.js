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
       
	tabela.forEach(funci =>{
            let novoItem =  itemLista.cloneNode(true);

            novoItem.classList.remove("modelo");

        novoItem.querySelector("#nome-fun").innerHTML = funci.funcionario;
        novoItem.querySelector("#cargo-fun").innerHTML = funci.cargo.nome;
        novoItem.querySelector("#nivel-fun").innerHTML = funci.cargo.nivel;
        novoItem.querySelector("#autorizacao-fun").innerHTML = funci.autorizado;

		if(funci.autorizado){
			novoItem.querySelector("#autorizacao-fun").innerHTML = "Autorizado";
		}else{
			novoItem.querySelector("#autorizacao-fun").innerHTML = "Não Autorizado";
		}

		if(funci.cargo.nivel >= 3){
			novoItem.querySelector("#btnDelete").disabled = true;
		}

var Analista = innerHTML = "Analista";
var Desenvolvedor = innerHTML = "Desenvolvedor";

		if(funci.cargo.nivel >= 3 && funci.cargo.nome == Analista ){
			novoItem.querySelector("#autorizacao-adm").innerHTML = "ADMIN";
		}

		if(funci.cargo.nivel >= 3 && funci.cargo.nome == Desenvolvedor ){
			novoItem.querySelector("#autorizacao-adm").innerHTML = "ADMIN";
		}

            document.querySelector(".tabela").appendChild(novoItem);       
        });

		
}


function removerItem(e) {

		e.parentNode.remove();
}