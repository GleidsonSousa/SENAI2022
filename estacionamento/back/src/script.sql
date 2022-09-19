drop database if exists renasparking;
create database renasparking charset=UTF8 collate utf8_general_ci;

use renasparking;

create table clientes(
    id_cliente integer auto_increment not null primary key,
    cpf varchar(11) not null unique,
    nome varchar(50) not null,
    telefone varchar(15) not null,
    email varchar(50) not null,
    endereco varchar(100) not null 
);

create table carros(
    id_carro integer auto_increment not null primary key,
    id_cliente integer not null,
    placa varchar(10) not null unique,
    marca varchar(50) not null,
    tipo varchar(20) not null,
    descrição varchar(100),
    foreign key carros(id_cliente) references clientes(id_cliente)
);

create table vagas(
    id_vaga integer auto_increment not null primary key,
    tipo_vaga varchar(20) not null

);
create table registraTempo(
    id_registro integer auto_increment not null primary key,
    id_vaga integer not null,
    id_carro integer not null,
    id_cliente integer not null, 
    data date not null,
    h_entrada time not null,
    h_saida time,
    tipo_reg varchar(20) not null,
    valor_h float(6,2) not null,
    foreign key registraTempo(id_vaga) references vagas(id_vaga),
    foreign key registraTempo(id_cliente) references clientes(id_cliente),
    foreign key registraTempo(id_carro) references carros(id_carro)
);

LOAD DATA INFILE 'C:/Users/Meu Computador/Desktop/estacionamento/back/src/docs/clientes.csv'
INTO TABLE clientes
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

-- INSERT INTO carros VALUES (DEFAULT,2,'abc1212','Scania','Caminhão',null);
LOAD DATA INFILE 'C:/Users/Meu Computador/Desktop/estacionamento/back/src/docs/carros.csv'
INTO TABLE carros
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C:/Users/Meu Computador/Desktop/estacionamento/back/src/docs/vagas.csv'
INTO TABLE vagas
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS; 

-- LOAD DATA INFILE 'C:/Users/Meu Computador/Desktop/estacionamento/back/src/docs/registros.csv'
-- INTO TABLE registraTempo
-- FIELDS TERMINATED BY ';'
-- ENCLOSED BY '"'
-- LINES TERMINATED BY '\r\n'
-- IGNORE 1 ROWS; 
