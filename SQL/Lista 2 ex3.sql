create database db_farmacia_do_bem;
use db_farmacia_do_bem;
create table tb_categoria(
id bigint auto_increment,
nome varchar(255) not null,
ativo boolean not null,
primary key(id)
);
create table tb_produto(
id bigint auto_increment,
nome varchar(255) not null,
preco double not null,
exigeReceita boolean not null,
categoria_id bigint,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)
);

insert into tb_categoria(nome,ativo) values("Drogaria",true);
insert into tb_categoria(nome,ativo) values("Primeiros Socorros",true);
insert into tb_categoria(nome,ativo) values("Higiene",true);
insert into tb_categoria(nome,ativo) values("Geladeira",true);
insert into tb_categoria(nome,ativo) values("Perfumaria",true);

insert into tb_produto(nome,preco,exigeReceita,categoria_id) value ("Remédio Pressão",25.90,true,1);
insert into tb_produto(nome,preco,exigeReceita,categoria_id) value ("Remédio Gripe",12.75,false,1);
insert into tb_produto(nome,preco,exigeReceita,categoria_id) value ("kit Shampoo+Condicionador",28.70,false,3);
insert into tb_produto(nome,preco,exigeReceita,categoria_id) value ("Bandaid",8.34, false,2);
insert into tb_produto(nome,preco,exigeReceita,categoria_id) value ("Gatoraide",21.20,false,4);
insert into tb_produto(nome,preco,exigeReceita,categoria_id) value ("Baton Vult",12.40,false,5);
insert into tb_produto(nome,preco,exigeReceita,categoria_id) value ("Remédio tarja preta",180.75,true,1);
insert into tb_produto(nome,preco,exigeReceita,categoria_id)  value ("Bala dor de garganta",8.35,false,1);

select * from tb_produto where preco>50;
select * from tb_produto where preco between 3 and 60;
select * from tb_produto where nome like "%B%";
select tb_produto.nome, tb_produto.preco, tb_categoria.nome from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;
select * from tb_produto where categoria_id = 5;