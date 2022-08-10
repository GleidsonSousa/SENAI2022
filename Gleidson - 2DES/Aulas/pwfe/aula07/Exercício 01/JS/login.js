var backend = [
    
    {
		"usuarios":"ADM",
		"passwords":{
			"senha":"adm123",
		},
    },

    {
		"usuarios":"alexandrin",
		"passwords":{
			"senha":"ale123",
		},
    },
]

var Usuario = document.querySelector("#username");
var Senha = document.querySelector("#password");
var Result = document.querySelector("#resposta");

Usuario.addEventListener("keyup", validarLogin);

// function validarLogin(){
//     if( Usuario.value == backend.usuarios.value ){
//         window.location.href = "./home"

//     }
    
// }

