drop database if exists onibus;
drop database if exists rodoviaria;
create database rodoviaria charset=UTF8 collate utf8_general_ci;
use rodoviaria;

create table motoristas(
    cpf varchar(11) not null primary key,
    nome varchar(50) not null
);
create table telefones(
    cpf varchar(11) not null,
    numero varchar(15) not null,
    foreign key (cpf) references motoristas(cpf)
);
create table linhas(
    id_linha varchar(10) not null primary key,
    descricao varchar(50) not null
);
create table horarios(
    id_linha varchar(10) not null,
    horario time not null,
    foreign key (id_linha) references linhas(id_linha)
);
create table mot_linhas(
    cpf varchar(11) not null,
    id_linha varchar(10) not null,
    data date not null,
    foreign key (cpf) references motoristas(cpf),
    foreign key (id_linha) references linhas(id_linha)
);

describe motoristas;
describe telefones;
describe linhas;
describe horarios;
describe mot_linhas;

show tables;

LOAD DATA INFILE 'C:/Users/Desenvolvimento/Desktop/Aulas/pwbe/aula05/rodoviaria/docs/csv/motoristas.csv'
INTO TABLE motoristas
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C:/Users/Desenvolvimento/Desktop/Aulas/pwbe/aula05/rodoviaria/docs/csv/telefones.csv'
INTO TABLE telefones
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C:/Users/Desenvolvimento/Desktop/Aulas/pwbe/aula05/rodoviaria/docs/csv/linhas.csv'
INTO TABLE linhas
FIELDS TERMINATED BY ';'    
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C:/Users/Desenvolvimento/Desktop/Aulas/pwbe/aula05/rodoviaria/docs/csv/horarios.csv'
INTO TABLE horarios
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C:/Users/Desenvolvimento/Desktop/Aulas/pwbe/aula05/rodoviaria/docs/csv/mot_linhas.csv'
INTO TABLE mot_linhas
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

select * from motoristas;
select * from telefones;
select * from linhas;
select * from horarios;
select * from mot_linhas;

create view vw_motoristas as
select m.cpf, m.nome,  t.numero as telefones from motoristas m 
inner join telefones t
on m.cpf = t.cpf;

select * from vw_motoristas;
