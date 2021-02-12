-- criar database ecommerce produtos
create database db_produtos;
use db_produtos;
-- criar tabela produtos com 5 atributos
create table tb_produtos(
id bigint auto_increment,
nome varchar (255) not null,
estoque int not null,
preco double not null,
descricao varchar(255) not null,
primary key(id)
);
-- popular a tabela com 8 produtos
insert into tb_produtos(nome,estoque,preco,descricao) values("Computador",10,7500,"computador");
insert into tb_produtos(nome,estoque,preco,descricao) values("Teclado",50,90,"teclado");
insert into tb_produtos(nome,estoque,preco,descricao) values("Mouse",110,40,"mouse");
insert into tb_produtos(nome,estoque,preco,descricao) values("Headset",38,120,"headset");
insert into tb_produtos(nome,estoque,preco,descricao) values("Cabo USB",204,50,"USB");
insert into tb_produtos(nome,estoque,preco,descricao) values("Cabo Ethernet",300,60,"cabo de rede");
insert into tb_produtos(nome,estoque,preco,descricao) values("Monitor",20,2500,"monitor");
insert into tb_produtos(nome,estoque,preco,descricao) values("Celular",80,3500,"android");
-- retornar produtos acima de 500
select * from tb_produtos where preco>500;
-- retornar produtos abaixo de 500
select * from tb_produtos where preco<500;
-- atualizar um dado
update tb_produtos set estoque=9 where id=1;
