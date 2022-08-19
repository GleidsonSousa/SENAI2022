drop database if exists academia;
create database academia  charset=UTF8 collate utf8_general_ci;;
use academia;

create table alunos(
    id_aluno integer not null primary key auto_increment,
    nome_aluno varchar(255) not null,
    nascimento varchar(12) not null,
    genero varchar(255) not null,
    peso float(3,2) not null
);
  
create table telefones(
    id_aluno integer not null,
    telefone varchar(20) not null,
    foreign key (id_aluno) references alunos(id_aluno)
);

create table aparelhos(
    id_aparelho integer not null primary key auto_increment,
    aparelho varchar(50) not null
);

create table exercicios(
    id_exercicio integer not null primary key auto_increment,
    descricao_exercicio varchar(255) not null,
    grupo_muscular varchar(20) not null,
    id_aparelho integer not null,
    foreign key (id_aparelho) references aparelhos(id_aparelho)
);

create table fichas(
    id_aluno integer not null,
    id_exercicio integer not null,
    data date not null,
    serie varchar(50) not null,
    foreign key (id_exercicio) references exercicios(id_exercicio),
    foreign key (id_aluno) references alunos(id_aluno)
);

