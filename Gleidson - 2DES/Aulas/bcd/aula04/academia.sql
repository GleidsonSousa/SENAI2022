drop database if exists academia;
create database academia  charset=UTF8 collate utf8_general_ci;;
use academia;

create table alunos(
    id_aluno integer not null primary key auto_increment,
    nome_aluno varchar(255) not null,
    nascimento varchar(12) not null,
    genero varchar(255) not null,
    peso float(5,2) not null
);
  
create table telefones(
    id_aluno integer not null,
    telefone varchar(20) not null,
    foreign key (id_aluno) references alunos(id_aluno)
);

create table aparelhos(
    id_aparelho integer not null primary key auto_increment,
    aparelho varchar(50) not null
);

create table exercicios(
    id_exercicio integer not null primary key auto_increment,
    descricao_exercicio varchar(255) not null,
    grupo_muscular varchar(20) not null,
    id_aparelho integer not null,
    foreign key (id_aparelho) references aparelhos(id_aparelho)
);

create table fichas(
    id_aluno integer not null,
    id_exercicio integer not null,
    data date not null,
    serie varchar(50) not null,
    foreign key (id_exercicio) references exercicios(id_exercicio),
    foreign key (id_aluno) references alunos(id_aluno)
);

describe clientes;
describe telefones;
describe aparelhos;
describe exercicios;
describe fichas;

insert  into alunos values (null,"Marcos de Souza Castro","2000-05-22","M",65);							
insert  into alunos values (null,"Ana Oliveira Oliveira","1990-08-23","T",88);							
insert  into alunos values (null,"Lúcia da Silva de Souza","1988-06-14","F",45.5);							
insert  into alunos values (null,"Ana de Souza de Oliveira","2002-07-13","M",98);							
			
insert into telefones values (1,"(11)04023-4384");						
insert into telefones values (1," (19)03086-1102");						
insert into telefones values (2,"(14)3288-8530");						
insert into telefones values (3,"(21)74746-1126");						
insert into telefones values (3," (19)28260-0126");						
insert into telefones values (4,"(14)64505-3435");						

insert into aparelhos values (null,"prancha peito reto");						
insert into aparelhos values (null,"puxador movel costas");						
insert into aparelhos values (null,"alter 20k");						
insert into aparelhos values (null,"prancha ombro");						
insert into aparelhos values (null,"Esteira");						
insert into aparelhos values (null,"prancha peito invertido");						
insert into aparelhos values (null,"puxador fixo costas");						
insert into aparelhos values (null,"alter 30k");						
insert into aparelhos values (null,"Leg Press");						
insert into aparelhos values (null,"Bicicleta Ergométrica");						
insert into aparelhos values (null,"prancha peito inclinado");						
insert into aparelhos values (null,"puxador sentado costas");						
insert into aparelhos values (null,"alter 10k");						
insert into aparelhos values (null,"crucifixo");						


insert into exercicios values (null,"Supino Reto","Peito",1);									
insert into exercicios values (null,"Puxada Baixa","Costas",2);									
insert into exercicios values (null,"Elevação Frontal","Ombro",3);									
insert into exercicios values (null,"Maq. Posterior","Ombro",4);									
insert into exercicios values (null,"Corrida","Aquecimento",5);									
insert into exercicios values (null,"Supino declinado","Peito",6);									
insert into exercicios values (null,"Remada Alta","Costas",7);									
insert into exercicios values (null,"Empurrar Cochas","Perna",9);									
insert into exercicios values (null,"Pedalada","Aquecimento",10);									
insert into exercicios values (null,"Supino Inclinado","Peito",11);									
insert into exercicios values (null,"Cerrote","Costas",12);									
insert into exercicios values (null,"Biceps","Braço",13);									
insert into exercicios values (null,"Panturrilha","Perna",9);									
insert into exercicios values (null,"crucifixo","Peito",14);									
insert into exercicios values (null,"Elevação Lateral","Ombro",13);									
insert into exercicios values (null,"Triceps","Braço",13);									
insert into exercicios values (null,"Caminhada","Aquecimento",5);									

insert into fichas values (1,1,"2022-08-01","4R decrescente 12 10 8 6");
insert into fichas values (1,2,"2022-08-02","4R decrescente 12 10 8 6");
insert into fichas values (1,3,"2022-08-03","4R decrescente 12 10 8 6");
insert into fichas values (1,4,"2022-08-04","4R decrescente 12 10 8 6");
insert into fichas values (1,5,"2022-08-05","30 min");

insert into fichas values (2,6,"2022-08-01","4R constante 8 8 8 8");
insert into fichas values (2,7,"2022-08-02","4R constante 8 8 8 8");
insert into fichas values (2,4,"2022-08-03","4R constante 8 8 8 8");
insert into fichas values (2,8,"2022-08-04","4R constante 8 8 8 8");
insert into fichas values (2,9,"2022-08-05","30 min");

insert into fichas values (3,10,"2022-08-01","4R constante 6 6 6 6");
insert into fichas values (3,11,"2022-08-02","4R constante 6 6 6 6");
insert into fichas values (3,12,"2022-08-03","4R constante 6 6 6 6");
insert into fichas values (3,13,"2022-08-04","4R constante 15 15 15 15");
insert into fichas values (3,1,"2022-08-05","4R constante 6 6 6 6");

insert into fichas values (4,14,"2022-08-01","4R constante 6 6 6 6");
insert into fichas values (4,15,"2022-08-02","4R constante 6 6 6 6");
insert into fichas values (4,16,"2022-08-03","4R constante 6 6 6 6");
insert into fichas values (4,17,"2022-08-04","4R constante 15 15 15 15");
insert into fichas values (4,6,"2022-08-05","4R constante 6 6 6 6");

