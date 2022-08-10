-- Excluir o bdc se for existente;
drop database if exists pedidos;
-- Criar o bcd;
create database pedidos charset=UTF8 collate utf8_general_ci;
-- Usar bcd;
use pedidos;
-- DDL Criação da estrutura do Banco de dados;
create table clientes(
    id_cliente integer not null primary key auto_increment,
    pri_nome varchar(20) not null,
    sobrenome varchar(50) not null,
    endereco  varchar(100) not null
);
create table telefones(
    id_cliente integer not null,
    telefone varchar(15) not null,
    foreign key (id_cliente) references clientes(id_cliente)
);
 create table pedidos(
     num_pedido integer not null primary key auto_increment,
     id_cliente integer not null,
    data_pedido varchar(10) not null,
    valor_pedido varchar(255) not null,
    descricao_pedido varchar(255) not null,
    quatidade varchar(255) not null,
     foreign key (id_cliente) references clientes(id_cliente)

 );

describe clientes;
describe telefones;
describe pedidos;
show tables;
