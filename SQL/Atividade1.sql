-- criar banco de dados
create database db_rh_funcionarios;
-- acessa o banco de dados
use db_servico_rh;
-- criar tabela com 5 atributos
create table tb_rh_funcionarios(
id bigint auto_increment,
nome varchar (255) not null,
idade int not null,
setor varchar(255) not null,
salario float not null,
primary key(id)
);
-- popular a tabela com 5 dados
insert into tb_rh_funcionarios(nome,idade,setor,salario) values("Julia Cintra",30,"ADM",5000);
insert into tb_rh_funcionarios(nome,idade,setor,salario) values("Margareth Paiva",22,"RH",2500);
insert into tb_rh_funcionarios(nome,idade,setor,salario) values("Mônica Sousa",49,"Arte",3500);
insert into tb_rh_funcionarios(nome,idade,setor,salario) values("Sebastiao Salgado",58,"Arte",3500);
insert into tb_rh_funcionarios(nome,idade,setor,salario) values("Magali Carvalho",34,"Limpeza",1500);
-- retornar funcionarios com salario maior que 2000
select * from tb_rh_funcionarios; -- mostrar todos
select nome,salario from tb_rh_funcionarios where salario>2000;
-- retornar funcionarios com salario menor que 2000
select nome,salario from tb_rh_funcionarios where salario<2000;
-- atualizar um dado da tabela
update tb_rh_funcionarios set salario=4000 where id=4;


 
