-- criar database alunos
create database db_alunos;
use db_alunos;
-- criar tabela alunos com 5 atributos
create table tb_alunos(
id bigint auto_increment,
nome varchar (255) not null,
idade int not null,
curso varchar(255) not null,
nota float not null,
primary key(id)
);
-- popular a tabela com 8 dados
insert into tb_alunos(nome,idade,curso,nota) values("Julia Cintra",30,"Modelagem 3D",5.5);
insert into tb_alunos(nome,idade,curso,nota) values("Margareth Paiva",22,"Música",8.5);
insert into tb_alunos(nome,idade,curso,nota) values("Mônica Sousa",49,"Desenho",4.0);
insert into tb_alunos(nome,idade,curso,nota) values("Sebastião Salgado",58,"Fotografia",10);
insert into tb_alunos(nome,idade,curso,nota) values("Magali Carvalho",34,"Bordado",7.5);
insert into tb_alunos(nome,idade,curso,nota) values("Ana Maria Braga",70,"Culinária",9.5);
insert into tb_alunos(nome,idade,curso,nota) values("Sheila Mello",42,"Dança",10);
insert into tb_alunos(nome,idade,curso,nota) values("Jonathas Santiago",46,"Mosaico",3);
-- retornar nota acima de 7
select * from tb_alunos where nota>7;
-- retornar nota abaixo de 7
select * from tb_alunos where nota<7;
-- atualizar um dado
update tb_alunos set nota=9 where id=8;