drop database if exists rodoviaria;
create database rodoviaria  charset=UTF8 collate utf8_general_ci;;
use rodoviaria;

create table motoristas(
    cpf_motorista varchar(14) not null primary key,
    nome_motorista varchar(100) not null
);

create table telefones(
     cpf_motorista varchar(14) not null,
     telefone varchar(20) not null,
     foreign key (cpf_motorista) references motoristas(cpf_motorista)
);

create table linhas(
    id_linha integer not null primary key auto_increment,
    descricao varchar(100) not null
);

create table horaios(
    id_linha integer not null,
    horario varchar(5) not null,
    foreign key (id_linha) references linhas(id_linha)
);

create table motorista_linha(
        cpf_motorista varchar(14) not null,
        id_linha integer not null,
       data date not null,
        foreign key (id_linha) references linhas(id_linha),
        foreign key (cpf_motorista) references motoristas(cpf_motorista)
);
