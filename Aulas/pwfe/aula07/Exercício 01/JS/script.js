
var tabela =[
	
	{ 	
		"img":"../assets/banana.jpg",
        "nome":"Cacho de banana",
        "preco": "R$ 5,99 kg"
	},
	{ 	
		"img":"../assets/batatas.jpg",
        "nome":"Batata",
        "preco": "R$ 3,99 kg"
	},
	{ 	
		"img":"../assets/feijaoKnorr.png",
        "nome":"Feijão carioca Knorr ",
        "preco": "R$ 13,99 "
	},
	{ 	
		"img":"../assets/manga.jpg",
        "nome":"Manga",
        "preco": "R$ 7,99 kg"
	},
	{ 	
		"img":"../assets/poparroz.jpg",
        "nome":"Arroz POP",
        "preco": "R$ 11,99"
	},
	{ 	
		"img":"../assets/arrozRei.png",
        "nome":"Arroz Rei da Panela",
        "preco": "R$ 21.50"
	},
]


var backend = [
    
    {
		"usuarios":"Admin",
		"passwords":{
			"senha":"adm123",
		},
    },

    {
		"usuarios":"ppp",
		"passwords":{
			"senha":"ppp123",
		},
    },
]
var Login = document.querySelector(".login");
var Usuario = document.querySelector("#username");
var Senha = document.querySelector("#password");


function validarLogin(){
	backend.forEach(user =>{
		if(user.usuarios == Usuario.value && user.passwords.senha == Senha.value ){
			console.log("oi")
			window.location.href = "./home.html"
		} else{	
			Login.querySelector("#resposta").innerHTML= "Usuário ou Senha inválidos";
			Login.querySelector("#resposta").style.color = "red";
		}
		
		// if(Usuario.value == null && Senha.value == null){}else{
		// 	Login.querySelector("#resposta").innerHTML= "Por favor preencher Usuário e Senha";
		// 	Login.querySelector("#resposta").style.color = "red";
		// }	
			
	});
    
}

function voltar(){
			window.location.href = "./login.html"
		}
var itemCarrinho = document.querySelector(".Item-lista");

function carregar() { 

	// backend.forEach(user =>{
	// 	Login.querySelector("#nomeUser").innerHTML= user.usuarios;
	// }),


    tabela.forEach(item => {
        let novoItem = itemCarrinho.cloneNode(true);

        novoItem.classList.remove("modelo");

        novoItem.querySelector("#produto").src = item.img;
        novoItem.querySelector("#nome-pro").innerHTML = item.nome;
        novoItem.querySelector("#preco-pro").innerHTML = item.preco;

        document.querySelector(".tabela").appendChild(novoItem);
    });
}
