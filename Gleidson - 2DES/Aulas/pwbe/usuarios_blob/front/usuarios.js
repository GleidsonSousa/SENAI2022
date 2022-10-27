const uri = 'http://localhost:4500/users';


function carregar(){
    const options = {method: 'GET'};

fetch(uri, options)
  .then(res => res.json())
  .then(res => {
    itens = res.items;

    preencherTela();
    })
  .catch(err => console.error(err));

}


const principal = document.querySelector('#principal');


function preencherTela(){
    itens.forEach(e =>{
      let info = document.querySelector("users").cloneNode(true);
      info.classList.remove("model");
      info.querySelector("#nome").innerHTML += e.nome;
      info.querySelector("#login").innerHTML += e.login;
      info.querySelector("#Nascimento").innerHTML += e.Nascimento;
      info.querySelector("#telefone").innerHTML += e.telefone;
      principal.appendChild(info);

    })
}