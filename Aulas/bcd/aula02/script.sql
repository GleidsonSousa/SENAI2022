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
    data timestamp not null,
    valor decimal(8,2) not null,
    descricao varchar(255) not null,
    quatidade integer(3) not null,
     foreign key (id_cliente) references clientes(id_cliente)

 );

describe clientes;
describe telefones;
describe pedidos;
show tables;
-- alter table alterar tabela;

-- Entrar no DML para alimentar o bcd com dados de teste;
    insert into clientes values
    (null, "Jorge", "Silva", "Rua Coisa Boeno - Jaguariúna -  SP"),
    (null, "Beca", "Sirva", "Rua Coisa Boena - Jaguariúna -  SP"),
    (null, "Caitano", "Kurupira", "Rua Rosa Dos Boeno - Jaguariúna -  SP"),
    (null, "Rock", "Pedrinha", "Rua Rosa Vermelha Carmesim - Jaguariúna -  SP");

    insert into clientes values
    (1,"(19) 94474-2527"),  
    (2,"(19) 91782-4693"),  
    (2,"(19) 96471-4696"),  
    (3,"(19) 92613-0895"),  
    (4,"(19) 95651-1984");

    insert into pedidos values
    (null, 1,null, 0.010, "Muito Foda Alek Vamu dançar",3);
    (null, 2,null, 0.10, "Muito Foda Alek Vamu dançar",1);
    (null, 3,null, 1.0, "Muito Foda Alek Vamu dançar",2);
    (null, 4,null, 10, "Muito Foda Alek Vamu dançar",3);
    (null, 4,null, 100, "Muito Foda Alek Vamu dançar",4);
    (null, 3,null, 1000, "Muito Foda Alek Vamu dançar",5);
    (null, 2,null, 10000, "Muito Foda Alek Vamu dançar",6);


    select * from clientes;
    select * from telefones;
     select * from pedidos;

