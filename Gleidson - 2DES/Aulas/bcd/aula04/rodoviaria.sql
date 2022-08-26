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
     id_linha  varchar(10) not null primary key,
    descricao varchar(100) not null
);

create table horarios(
    id_linha  varchar(10) not null primary key,
    horario varchar(10) not null,
    foreign key (id_linha) references linhas(id_linha)
);

create table motorista_linha(
        cpf_motorista varchar(14) not null,
         id_linha  varchar(10) not null,
        datas varchar(16) not null,
        foreign key (id_linha) references linhas(id_linha),
        foreign key (cpf_motorista) references motoristas(cpf_motorista)
);

insert into motoristas values("400:825:752-74","Ana de Souza de Oliveira");
insert into motoristas values("342:168:515-09","Ana Oliveira Oliveira");
insert into motoristas values("482:142:372-38","Lucia da Silva de Souza");
insert into motoristas values("050:663:437-09","Marcos de Souza Castro");
insert into motoristas values("052:102:852-35","Maria Oliveira Castro");

insert into telefones values("400:825:752-74","(11)04023-4384");
insert into telefones values("400:825:752-74","(11)94023-5587");
insert into telefones values("342:168:515-09","(14)3288-8530");
insert into telefones values("482:142:372-38","(21)74746-1126");
insert into telefones values("482:142:372-38","(11)94023-4454");
insert into telefones values("050:663:437-09","(14)64505-3435");
insert into telefones values("050:663:437-09","(11)84023-4444");
insert into telefones values("050:663:437-09","(11)84023-0084");
insert into telefones values("052:102:852-35","(19)03086-1102");

insert into linhas values("Linha1","Campinas x Pedreira");
insert into linhas values("Linha2","Campinas X Jaguariúna");
insert into linhas values("Linha3","Campinas X Jaguariúna FAJ");
insert into linhas values("Linha4","Campinas X Amparo");
insert into linhas values("Linha5","Campinas X Holambra");

insert into horarios values("Linha1","07:55:00");
insert into horarios values("Linha1","09:30:00");
insert into horarios values("Linha1","11:00:00");
insert into horarios values("Linha1","14:00:00");
insert into horarios values("Linha1","17:00:00");
insert into horarios values("Linha1","20:00:00");
insert into horarios values("Linha2","07:00:00");
insert into horarios values("Linha2","09:00:00");
insert into horarios values("Linha2","11:00:00");
insert into horarios values("Linha2","14:00:00");
insert into horarios values("Linha2","17:00:00");
insert into horarios values("Linha2","20:30:00");
insert into horarios values("Linha3","07:30:00");
insert into horarios values("Linha3","11:30:00");
insert into horarios values("Linha3","17:30:00");
insert into horarios values("Linha3","20:00:00");
insert into horarios values("Linha4","07:50:00");
insert into horarios values("Linha4","11:00:00");
insert into horarios values("Linha4","14:00:00");
insert into horarios values("Linha4","18:00:00");
insert into horarios values("Linha4","21:00:00");
insert into horarios values("Linha5","07:45:00");
insert into horarios values("Linha5","09:30:00");
insert into horarios values("Linha5","11:40:00");
insert into horarios values("Linha5","14:50:00");
insert into horarios values("Linha5","17:30:00");
insert into horarios values("Linha5","21:30:00");

insert into motorista_linha values("400.825.752-74","Linha1","2022-08-21");
insert into motorista_linha values("342.168.515-09","Linha2","2023-08-21");
insert into motorista_linha values("482.142.372-38","Linha3","2024-08-21");
insert into motorista_linha values("050.663.437-09","Linha4","2025-08-21");
insert into motorista_linha values("052.102.852-35","Linha5","2026-08-21");
insert into motorista_linha values("400.825.752-74","Linha1","2022-08-16");
insert into motorista_linha values("342.168.515-09","Linha4","2023-08-16");
insert into motorista_linha values("482.142.372-38","Linha3","2024-08-16");
insert into motorista_linha values("050.663.437-09","Linha2","2025-08-16");
insert into motorista_linha values("052.102.852-35","Linha5","2026-08-16");
insert into motorista_linha values("400.825.752-74","Linha3","2022-08-17");
insert into motorista_linha values("342.168.515-09","Linha2","2023-08-17");
insert into motorista_linha values("482.142.372-38","Linha1","2024-08-17");
insert into motorista_linha values("050.663.437-09","Linha4","2025-08-17");
insert into motorista_linha values("052.102.852-35","Linha5","2026-08-17");
