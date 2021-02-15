create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;
create table tb_categoria(
id bigint auto_increment,
nome varchar(255) not null,
ativo boolean not null,
primary key(id)
);
create table tb_curso(
id bigint auto_increment,
nome varchar(255) not null,
preco double not null,
duracao int,
categoria_id bigint,
primary key(id),
foreign key(categoria_id) references tb_categoria(id)
);

insert into tb_categoria(nome,ativo) values("Línguas",true);
insert into tb_categoria(nome,ativo) values("Primeiros Socorros",true);
insert into tb_categoria(nome,ativo) values("Arte",true);
insert into tb_categoria(nome,ativo) values("Desenho Tecnico",true);
insert into tb_categoria(nome,ativo) values("Marketing",true);

insert into tb_curso(nome,preco,duracao,categoria_id) value ("Inglês Iniciante",125.90,100,1);
insert into tb_curso(nome,preco,duracao,categoria_id) value ("Mandarim Iniciante",212.75,150,1);
insert into tb_curso(nome,preco,duracao,categoria_id) value ("Brigadista Básico",328.70,500,2);
insert into tb_curso(nome,preco,duracao,categoria_id) value ("Mosaico Jamaicano",378.34, 300,3);
insert into tb_curso(nome,preco,duracao,categoria_id) value ("Desenho Livre",421.20,100,3);
insert into tb_curso(nome,preco,duracao,categoria_id) value ("Marketing Pessoal",312.40,200,5);
insert into tb_curso(nome,preco,duracao,categoria_id) value ("DT Automotivo",280.75,500,4);
insert into tb_curso(nome,preco,duracao,categoria_id)  value ("DT Construção",378.35,400,4);

select * from tb_curso where preco>50;
select * from tb_curso where preco between 3 and 60;
select * from tb_curso where nome like "%J%";
select tb_curso.nome, tb_curso.preco, tb_curso.duracao, tb_categoria.nome from tb_curso inner join tb_categoria on tb_categoria.id = tb_curso.categoria_id;
select * from tb_curso where categoria_id = 3;