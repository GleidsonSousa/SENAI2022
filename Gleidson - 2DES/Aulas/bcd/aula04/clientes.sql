drop database if exists lojadoZe;
create database lojadoZe charset=UTF8 collate utf8_general_ci;
use lojadoZe;

create table clientes(
    id_cliente integer not null primary key auto_increment,
    nome_cliente varchar(255) not null,
    nascimento  varchar(12) not null,
    genero  varchar(20) not null,
    peso  float(5,2) not null
);

create table telefones(
    id_cliente integer not null,
    telefone varchar(20) not null,
    foreign key (id_cliente) references clientes(id_cliente)
);

describe clientes;
describe telefones;
describe entregadores;
describe produtos;
describe pedidos;
describe itens;

show tables;

LOAD DATA INFILE 'C:\Users\Desenvolvimento\Desktop\Aulas\bcd\aula04\csv\lojadoZe\clientes.csv'
INTO TABLE clientes
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA INFILE 'C:\Users\Desenvolvimento\Desktop\Aulas\bcd\aula04\csv\lojadoZe\telefones.csv'
INTO TABLE telefones
FIELDS TERMINATED BY ';'
ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

select * from clientes;
select * from telefones;


-- insert into clientes values(null,"Ana de Souza de Oliveira","2000-05-22","M",65.5);							
-- insert into clientes values(null,"Ana Oliveira Oliveira","1990-08-23","T",88);							
-- insert into clientes values(null,"Lúcia da Silva de Souza","1988-06-14","F",45.5);							
-- insert into clientes values(null,"Marcos de Souza Castro","2002-07-13","M",98);							
-- insert into clientes values(null,"Maria Oliveira Castro","2005-08-14","T",101);							
-- insert into clientes values(null,"Jurema de Souza Castro","2007-06-15","F",80);							

-- insert into  telefones values(1,"(11)04023-4384");					
-- insert into  telefones values(1,"(14)3288-8530");					
-- insert into  telefones values(2,"(21)74746-1126");					
-- insert into  telefones values(2,"(14)64505-3435");					
-- insert into  telefones values(2,"(19)03086-1102");					
-- insert into  telefones values(3,"(14)64500-3435");					
-- insert into  telefones values(4,"(19)28260-0126");					
-- insert into  telefones values(5,"(21)34757-1544");					
-- insert into  telefones values(6,"(19)3030-4465");					
-- insert into  telefones values(6,"(19)93030-4460");					

