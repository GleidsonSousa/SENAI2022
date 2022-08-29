fetch("http://localhost:5000/academia/alunos")
.then((response) => {
    return response.json();
})

.then((data) => {
    var Alunos = document.querySelector(".Alunos")
    data.forEach(alunos => {
        let novoAluno =  Alunos.cloneNode(true)

        novoAluno.classList.remove("modelo")

    novoAluno.querySelector("#nome-aluno").innerHTML = alunos.nome;
    novoAluno.querySelector("#id-aluno").innerHTML = alunos.id_aluno;
    novoAluno.querySelector("#nome-aluno").innerHTML = alunos.nome;
    novoAluno.querySelector("#nascimento-aluno").innerHTML = alunos.nascimento;
    novoAluno.querySelector("#genero-aluno").innerHTML = alunos.sexo;
    novoAluno.querySelector("#peso-aluno").innerHTML = alunos.peso;
    novoAluno.querySelector("#telefone-aluno").innerHTML = alunos.telefones;
    document.querySelector(".mother").appendChild(novoAluno);
    })
})



fetch("http://localhost:5000/academia/aparelhos")
.then((response) => {
    return response.json();
})

.then((data) => {
    var Aparelhos = document.querySelector(".aparelhos");
    data.forEach(alunos => {
        let novoAp =  Aparelhos.cloneNode(true)
        
       novoAp.classList.remove("modelo")

   novoAp.querySelector("#nome-ap").innerHTML = alunos.nome;
   novoAp.querySelector("#id-ap").innerHTML = alunos.id_aparelho;
    document.querySelector(".mother2").appendChild(novoAp);
    })
})