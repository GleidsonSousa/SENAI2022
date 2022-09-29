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
    id_cli integer not null,
    placa varchar(10) not null unique,
    marca varchar(50) not null,
    categoria varchar(30) not null
 
);

create table vagas(
    id_vaga integer auto_increment not null primary key,
    categoria_vaga varchar(30) not null,
    valor_h float(6,2) not null


);

create table registro_estac(
    id_registro integer auto_increment not null primary key,
    id_vag integer not null,
    id_car integer not null,
    id_cli integer not null, 
    data date not null,
    h_entrada time not null,
    h_saida time,
    valor_final float(10,2),
    forma_pagamento varchar(30),
    status_pag varchar(10) not null,
    foreign key (id_vag) references vagas(id_vaga),
    foreign key (id_cli) references clientes(id_cliente),
    foreign key (id_car) references carros(id_carro)
);

alter table carros add foreign key (id_cli) references clientes(id_cliente);

insert into clientes values(default,'80821611089','Tony Halls','19988430190','TonyH@gmail.com','Rua Joaquin Cardoso 400');
insert into clientes values(default,'44333810043','Juzyssara Monte','49937365429','JuzyMonte@hotmail.com','Rua São Bernado 600');
insert into clientes values(default,'07937014067','Renas Wellisson','19938382238','RenasWelli@yahoo.com','Rua dos Descolados 656');

insert into carros values(default,1,'MWK7015','Scania','Caminhão');
insert into carros values(default,3,'EDL3Z90','Ferrari','Carro');
insert into carros values(default,2,'CIZ8920','Honda','Moto');
insert into carros values(default,3,'HXW3364','BMW','Carro');

insert into vagas values(default,'Veículo Pequeno',5.00);
insert into vagas values(default,'Veículo Médio',10.00);
insert into vagas values(default,'Veículo Grande',20.00);

insert into registro_estac values(default,1,3,2,'2022-09-20','08:00',null,null,null,'Aberto');
insert into registro_estac values(default,3,1,1,'2022-09-20','09:30',null,null,null,'Aberto');
insert into registro_estac values(default,2,2,3,'2022-09-10','10:00',null,null,null,'Aberto');
insert into registro_estac values(default,2,4,3,'2022-09-18','08:30','12:30',40.00,'Cartão Débito','Pago');

select * from `clientes`;
select * from `carros`;
select * from `vagas`;
select * from `registro_estac`;

create view vw_estacionar as
select r.id_registro,v.id_vaga as vagas, c.id_cliente as clientes, v.categoria_vaga , v.valor_h , ca.placa as carros, r.forma_pagamento, r.status_pag from clientes c
inner join registro_estac r on c.id_cliente = r.id_cli
inner join vagas v on r.id_vag = v.id_vaga 
inner join carros ca on  r.id_car = ca.id_carro where r.h_saida is null;

select * from vw_estacionar;

create view estacionamento_pagos as
select *, (valor_final) as v_final from registro_estac where h_saida is not null; 

select * from estacionamento_pagos;






