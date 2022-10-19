const uri='http://localhost:3000/patrimonio/itens/';
 
var itens = [];

const modalEditar = document.querySelector(".editar");
const btCadedit = document.querySelector("#cadedit");

const inputNi = document.querySelector("#inpNi");
const inputAquisicao = document.querySelector("#inpAquisicao");
const inputDenominacao= document.querySelector("#inpDenominacao");
const inputValor = document.querySelector("#inpValor");

function carregar(){
    const options = {method: 'GET'};

fetch(uri, options)
  .then(res => res.json())
  .then(res => {
    itens = res;
    preencherTela();
    })
  .catch(err => console.error(err));

}

const corpo = document.querySelector('#corpo');

function preencherTela(){
    itens.forEach(e =>{
      let card = document.querySelector(".card").cloneNode(true);
      card.classList.remove("model");
      card.querySelector("#ni").innerHTML += e.ni;
      card.querySelector("#aquisicao").innerHTML += e.aquisicao;
      card.querySelector("#denominacao").innerHTML += e.denominacao;
      card.querySelector("#valor").innerHTML += e.valor;
      card.querySelector("#img").src = '../docs/assets/' + e.img;
      card.querySelector("#del").setAttribute('onclick', `del(${e.ni})`);


    

      card.querySelector("#edit").addEventListener("click", () => {
        modalEditar.classList.remove("model"); 
        btCadedit.innerHTML = "Editar";
        btCadedit.onclick = () => { editarItem() }
        inputNi.value = e.ni;
        inputAquisicao.value = e.aquisicao;
        inputDenominacao.value = e.denominacao;
        inputValor.value = e.valor;
    });

      corpo.appendChild(card);

    })
}

const del = (ni) => {
    const options = {
        method: 'DELETE',
    };
    if( confirm("Confirma a exclusão do item" + ni)){
        fetch(uri + ni, options)
        .then(res => res.status)
        .then(res  => {
            window.location.reload();
                
                
        })
    }
}


function fecharModalEditar() {
  modalEditar.classList.add("model");
}


function abrirModalCadastro() {
  btCadedit.innerHTML = "Cadastrar";
  btCadedit.onclick = () => { cadastrarItem(); }
  inputNi.value = "";
  inputAquisicao.value = "";
  inputDenominacao.value = "";
  inputValor.value = "";
  modalEditar.classList.remove("model");
}

function editarItem() {
  let item = {
      "ni":inputNi.value,
      "aquisicao":inputAquisicao.value,
      "denominacao":inputDenominacao.value,
      "valor":inputValor.value,
  }

  fetch(uri, {
      "method":"PUT",
      "headers": {
          "Content-Type":"application/json"
      },
      "body":JSON.stringify(item)
  })
  .then(res => { return res.json() })
  .then(resp => {
      if(resp.ni !== undefined) {
          alert("Produto Alterado com Sucesso !");
          window.location.reload();
      }else {
          alert("Falha ao salvar alterações !");
      }
  })
}



function cadastrarItem() {
  let item = {
      "ni":inputNi.value,
      "aquisicao":inputAquisicao.value,
      "denominacao":inputDenominacao.value,
      "valor":inputValor.value,
  };

  fetch(uri, {
      "method":"POST",
      "headers": {
          "Content-Type": "application/json"
      },
      "body": JSON.stringify(item)
  })
  .then(res => {return res.json()})
  .then(resp => {
      if(resp.matricula !== undefined){
          alert("Funcionário Cadastrado Com Sucesso !");
          window.location.reload();
      }else {
          alert("Falha ao cadastrar funcionário");
      }
   })
}