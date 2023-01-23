drop database if exists projeto01;
create database projeto01 charset=UTF8 collate utf8_general_ci;
use projeto01;

create table  entregadores(
    id_entregador integer auto_increment not null primary key,
    nome varchar(100) not null,
    email varchar(100) not null,
    senha varchar(25) not null,
    veiculo varchar(50) not null
);
create table pedidos(
    id_pedido integer  auto_increment not null primary key,
    cliente varchar(100) not null,
    endereco varchar(150) not null,
    produto varchar(100) not null,
    data date not null,
    hora_pedido time not null,
    hora_entrega time varchar(8),
    hora_fim time varchar(8),
    entregador varchar(100)
);

LOAD DATA INFILE 'C:/Users/Desenvolvimento/Desktop/GITHUB/opa/SENAI2022/Gleidson - 3DES/projetos/aula01/docs/dados/entregadores.csv'
INTO TABLE entregadores
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C:/Users/Desenvolvimento/Desktop/GITHUB/opa/SENAI2022/Gleidson - 3DES/projetos/aula01/docs/dados/pedidos.csv'
INTO TABLE pedidos
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

select * from entregadores;
select * from pedidos;