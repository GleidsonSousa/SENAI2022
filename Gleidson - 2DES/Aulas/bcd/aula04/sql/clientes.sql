drop database if exists lojadoZe;
create database lojadoZe charset=UTF8 collate utf8_general_ci;
use lojadoZe;

create table clientes(
    id_cliente integer not null primary key auto_increment,
    nome_cliente varchar(255) not null,
    nascimento  varchar(12) not null,
    genero  varchar(20) not null,
    peso  float(3,2) not null
);

create table telefones(
    id_cliente integer not null,
    telefone varchar(20) not null,
    foreign key (id_cliente) references clientes(id_cliente)
);