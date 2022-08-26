drop database if exists cobrancas;
create database cobrancas  charset=UTF8 collate utf8_general_ci;;
use cobrancas;

create table clientes(
    id_cliente integer not null primary key  auto_increment ,
    nome_cliente varchar(100) not null,
    endereco  varchar(100) not null,
    bairro varchar(50) not null,
    cidade varchar(50) not null,
    uf varchar(2) not null
);

create table telefones(
    id_cliente integer not null,
    tipo varchar(50) not null,
    telefone varchar(20) not null,
    foreign key (id_cliente) references clientes(id_cliente)
);

create table  duplicadas(
    id_duplicada integer not null  primary key  auto_increment ,
    id_cliente integer not null,
    datacompra date not null,
    vecimento date not null,
    pagamento date not null,
    valor float(10,2) not null,
    diferenca varchar(255) not null,
    final varchar(255) not null,
    status_fatura  varchar(25) not null,
    foreign key (id_cliente) references clientes(id_cliente)
);

