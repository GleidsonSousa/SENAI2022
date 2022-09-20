drop database if exists pizzaria; 

create database pizzaria charset=UTF8 collate utf8_general_ci;

use pizzaria;

create table cliente(
    cliente_id integer not null auto_increment primary key,
    telefone varchar(15) not null,
    nome varchar(50) not null,
    logradouro varchar(50) not null,
    numero decimal(5,0) not null,
    complemento varchar(20) not null,
    bairro varchar(20) not null,
    referencia varchar(50)
); 

create table pedido(
    pedido_id integer not null auto_increment primary key,
    cliente_id integer not null,
    date datetime not null,
    valor decimal(6,2) not null,
    foreign key (cliente_id) references cliente(cliente_id)
);

create table pizza(
    pizza_id integer not null auto_increment primary key,
    nome varchar(50) not null,
    descricao varchar(100) not null,
    valor decimal(5,2) not null

);

create table item_pedido(
    pedido_id integer not null,
    pizza_id integer not null,
    quantidade decimal(2,0),
    valor decimal(6,2),
    foreign key (pedido_id) references pedido(pedido_id),
    foreign key (pizza_id) references pizza(pizza_id)
);

INSERT INTO cliente VALUES(default,'(19)97656-0312','Charles da Cunha Silva','Rua José Alves',55,'Casa','Vila das Flores','Ao lado do Pão de Açúcar');
INSERT INTO cliente VALUES(default,'(19)92847-5285','Carlos de Lima Hortolan','Rua Amauri Marechal',102,'Apartamento bloco B2','General Volibal','Nenhuma');
INSERT INTO cliente VALUES(default,'(19)93346-5175','Mayla Golsalves da Salsa','Rua Jardim de Ouro',80,'Casa','Vale do Fim','Casa laranja portão roxo');
INSERT INTO cliente VALUES(default,'(19)92776-1916','Jucimara Satunino Limeira','Rua Joaquin Azevedo',23,'Apartamento C','Vila das Codornas','Nenhuma');
INSERT INTO cliente VALUES(default,'(19)92308-5281','Alex Dias de Souza','Rua João Roberto',864,'Casa','Tubarão Rosa','Morro da Serra Del Macho');

INSERT INTO pedido VALUES(default,1,'2022-09-17',95);
INSERT INTO pedido VALUES(default,2,'2022-09-18',30);
INSERT INTO pedido VALUES(default,3,'2022-09-18',80);
INSERT INTO pedido VALUES(default,4,'2022-09-19',75);
INSERT INTO pedido VALUES(default,5,'2022-09-19',260);

INSERT INTO pizza VALUES(default,'Calabresa','Calabresa, cebola e muçarela',25);
INSERT INTO pizza VALUES(default,'Portuguesa','Ovos, cebola, azeitona, ervilha, queijo e presunto',40);
INSERT INTO pizza VALUES(default,'Marguerita','molho, muçarela, tomate e manjericão',25);
INSERT INTO pizza VALUES(default,'Frango com catupiry','Frango, catupiry impotado e milho(Opcional)',30);
INSERT INTO pizza VALUES(default,'Muçarela','Muçarela e orégano ',25);
INSERT INTO pizza VALUES(default,'Napolitana','Muçarela, rodelas de tomate, queijo parmesão e orégano',35);
INSERT INTO pizza VALUES(default,'Siciliana','Muçarela, bacon e champignon ao molho rose',30);
INSERT INTO pizza VALUES(default,'Palmito','Muçaarela, palmito e orégano',30);
INSERT INTO pizza VALUES(default,'Vegetariana','Muçarela, pimentão, cebola, azeitona, ervilha, tomate, palmito, milho e orégano',50);
INSERT INTO pizza VALUES(default,'Carne Seca','Carne seca, mussarela, cebola, parmesão, tomate, orégano e azeitonas',55);

INSERT INTO item_pedido VALUES(1,2,1,40);
INSERT INTO item_pedido VALUES(1,10,1,55);
INSERT INTO item_pedido VALUES(2,8,1,30);
INSERT INTO item_pedido VALUES(3,5,1,25);
INSERT INTO item_pedido VALUES(3,10,1,55);
INSERT INTO item_pedido VALUES(4,1,1,25);
INSERT INTO item_pedido VALUES(4,3,1,25);
INSERT INTO item_pedido VALUES(4,5,1,25);

INSERT INTO item_pedido VALUES(5,10,2,110);
INSERT INTO item_pedido VALUES(5,9,3,150);



select * from cliente;
