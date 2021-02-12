-- cria banco de dados
create database db_servico_rh;

-- acessa o banco de dados
use db_servico_rh;

-- criar tabela
create table tb_funcionarios(
id bigint auto_increment,
nome varchar (255) not null,
idade int not null,
salario float not null,
primary key(id)
);
-- busca das informações
select * from tb_funcionarios;
-- cadastra dados na tabela
insert into tb_funcionarios(nome,idade,salario) values("Raphael",00,10000);
insert into tb_funcionarios(nome,idade,salario) values("Rafao",00,10000);
-- alterar tabela
alter table tb_funcionarios
add descricao varchar(255);
update tb_funcionarios set nome = "Raphael" where id=1;

