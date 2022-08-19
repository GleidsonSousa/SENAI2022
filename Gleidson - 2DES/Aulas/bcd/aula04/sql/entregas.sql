drop database if exists entregas;
create database entregas charset=UTF8 collate utf8_general_ci;;
use entregas;

create table clientes (
    id_cliente integer not null primary key  auto_increment,
    cpf_motorista varchar(14) not null,
    nome_cliente varchar(50) not null,
    cep varchar(12) not null,
    numero integer not null,
    complemento varchar(50) not null
);

create table telefones(
    id_cliente integer not null,
    telefone varchar(20) not null,
    foreign key (id_cliente) references clientes(id_cliente)
);

create table entregadores(
    id_entregador  integer not null primary key auto_increment,
    nome_entregador varchar(50) not null,
    veiculo varchar(50) not null
);

create table produto(
    id_produto integer not null primary key auto_increment,
    nome_produto varchar(50) not null,
    preco_unitario float(8,2) not null
);

create table pedidos(
    id_cliente integer not null,
    id_pedido integer not null primary key auto_increment,
    id_entregador integer not null,
    data_entrega date not null,
    hora_pedido  time,
    hora_entrega time,
    hora_receba   time,
     foreign key (id_cliente) references clientes(id_cliente),
      foreign key (id_entregador) references entregadores(id_entregador)
);

create table itens (
    id_pedido integer not null,
    id_produto integer not null,
    quantidade integer not null,
    foreign key (id_pedido) references pedidos(id_pedido),
    foreign key (id_produto) references produto(id_produto)

);