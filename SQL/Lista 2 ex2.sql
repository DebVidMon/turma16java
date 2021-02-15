create database db_pizzaria_legal;
use db_pizzaria_legal;
create table tb_categoria(
id bigint auto_increment,
nome varchar(255) not null,
ativo boolean not null,
primary key(id)
);
create table tb_pizza(
id bigint auto_increment,
sabor varchar(255) not null,
preco double not null,
borda boolean not null,
categoria_id bigint,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)
);

insert into tb_categoria(nome,ativo) values("Salgada",true);
insert into tb_categoria(nome,ativo) values("Doce",true);
insert into tb_categoria(nome,ativo) values("Vegetariana",true);
insert into tb_categoria(nome,ativo) values("Calzone",true);
insert into tb_categoria(nome,ativo) values("Limitada",true);

insert into tb_pizza(sabor,preco,borda,categoria_id) value ("Mussarela",32.90,false,3);
insert into tb_pizza(sabor,preco,borda,categoria_id) value ("Calabresa",32.90,false,1);
insert into tb_pizza(sabor,preco,borda,categoria_id) value ("Castelões",35.10,true,1);
insert into tb_pizza(sabor,preco,borda,categoria_id) value ("Presunto di parma",40.80, false,4);
insert into tb_pizza(sabor,preco,borda,categoria_id) value ("Brócolis",35.10,true,3);
insert into tb_pizza(sabor,preco,borda,categoria_id) value ("Fungi",45.50,true,5);
insert into tb_pizza(sabor,preco,borda,categoria_id) value ("Banana e leite condensado",40.80,true,2);
insert into tb_pizza(sabor,preco,borda,categoria_id) value ("Prestígio",40.80,true,2);

select * from tb_pizza where preco>45;
select * from tb_pizza where preco between 29 and 60;
select * from tb_pizza where sabor like "%C%";
select tb_pizza.sabor, tb_pizza.preco, tb_categoria.nome from tb_pizza inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id;
select * from tb_pizza where categoria_id = 2;

