create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;
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
unidade varchar(255),
categoria_id bigint,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)
);

insert into tb_categoria(nome,ativo) values("Estrutural",true);
insert into tb_categoria(nome,ativo) values("Ceramico",true);
insert into tb_categoria(nome,ativo) values("Tintas",true);
insert into tb_categoria(nome,ativo) values("Madeiras",true);
insert into tb_categoria(nome,ativo) values("Elétrico",true);

insert into tb_produto(nome,unidade,preco,categoria_id) value ("Saco de cimento", "50Kg",25.90,1);
insert into tb_produto(nome,unidade,preco,categoria_id) value ("Piso hidráulico","m²",32.75,2);
insert into tb_produto(nome,unidade,preco,categoria_id) value ("Suvinil n4340","Lata",28.70,3);
insert into tb_produto(nome,unidade,preco,categoria_id) value ("Piso Parquete","m²",60.74,4);
insert into tb_produto(nome,unidade,preco,categoria_id) value ("Fiação n5","m",7.50,5);
insert into tb_produto(nome,unidade,preco,categoria_id) value ("Tomada","Unidade",32.40,5);
insert into tb_produto(nome,unidade,preco,categoria_id) value ("Brita n3","m³",80.75,1);
insert into tb_produto(nome,unidade,preco,categoria_id)  value ("Vaso Sanitário","Unidade",190.80,2);

select * from tb_produto where preco>50;
select * from tb_produto where preco between 3 and 60;
select * from tb_produto where nome like "%C%";
select tb_produto.nome, tb_produto.preco, tb_categoria.nome from tb_produto inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;
select * from tb_produto where categoria_id = 4;