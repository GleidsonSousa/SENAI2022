drop database if exists lojinha_japa;
create database lojinha_japa charset=UTF8 collate utf8_general_ci;
use lojinha_japa;

create table caixa_lancamentos(
    n_lancamentos integer not null primary key auto_increment,
    datas varchar(10) not null,
    descricao varchar(50) not null,
    valor float(6,2) not null,
    tipo varchar(10) not null

);
show tables;
describe caixa_lancamentos;

LOAD DATA INFILE 'C:/Users/Desenvolvimento/Desktop/GITHUB/LOJINHA/japones/backend/docs/csv/loja.csv'
INTO TABLE caixa_lancamentos
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;
