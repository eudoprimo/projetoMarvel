insert into `characters` (ID,NOME,DESCRICAO) values(1,'Hulk','Famoso Bruce Benner');
insert into `characters`(ID,NOME,DESCRICAO) values(2,'Capitao America','Codinome Steves Rogers');
insert into `characters`(ID,NOME,DESCRICAO) values(3,'Viuva Negra','Espiã');
insert into `characters`(ID,NOME,DESCRICAO) values(4,'Homen de Ferro','Rico Tony Stark');
insert into `characters`(ID,NOME,DESCRICAO) values(5,'Homem Aranha','Fotografo Peter Parker');
insert into `characters`(ID,NOME,DESCRICAO) values(6,'Dr. Estranho','Protetor entre os mundos');
insert into `characters`(ID,NOME,DESCRICAO) values(7,'Pantera Negra','Rei de Wakanda');
insert into `characters`(ID,NOME,DESCRICAO) values(8,'Capitã Marvel','Piloto de Avião');
insert into `characters`(ID,NOME,DESCRICAO) values(9,'Thor','Deus do Trovão');
insert into `characters`(ID,NOME,DESCRICAO) values(10,'Visão','Um vingador Android');


insert into `comics`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(1,'Hulk contrea o mundo','Hulk contra a marvel',1);
insert into `comics`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(2,'Planeta Hulk','Planeta Hulk',1);
insert into `comics`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(3,'Viuva Negra em Moscou','Espiã',3);
insert into `comics`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(4,'Homen de Ferro contra Capitao America','Luta entre Homem de ferro e capitao america', 2);
insert into `comics`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(5,'Homem Aranha no aranhaverso','homem aranha',5);
insert into `comics`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(6,'Capitao America e Soldado Invernal','Capitao America',2);
insert into `comics`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(7,'Capitã Marvel contra o imperio Kree','capitã marvel',8);
insert into `comics`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(8,'Pantera Negra se torna rei','Pantera negra',7);
insert into `comics`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(9,'A criação do Visao','Android Visao',10);
insert into `comics`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(10,'Thor contra loki','Thor',9);

insert into `events`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(1,'evento hulk','Hulk contra a marvel',1);
insert into `events`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(2,'evento hulk 2','Planeta Hulk',1);
insert into `events`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(3,'evento Viuva Negra em Moscou','Espiã',3);
insert into `events`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(4,'evento Homen de Ferro contra Capitao America','Luta entre Homem de ferro e capitao america', 2);
insert into `events`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(5,'evento Homem Aranha no aranhaverso','homem aranha',5);
insert into `events`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(6,'evento Capitao America e Soldado Invernal','Capitao America',2);
insert into `events`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(7,'evento Capitã Marvel contra o imperio Kree','capitã marvel',8);
insert into `events`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(8,'evento Pantera Negra se torna rei','Pantera negra',7);
insert into `events`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(9,'evento A criação do Visao','Android Visao',10);
insert into `events`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(10,'evento Thor contra loki','Thor',9);

insert into `series`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(1,'serie hulk','serie Hulk contra a marvel',1);
insert into `series`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(2,'serie hulk 2','serie Planeta Hulk',1);
insert into `series`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(3,'serie Viuva Negra em Moscou','serie Espiã',3);
insert into `series`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(4,'serie Homen de Ferro contra Capitao America',' serieLuta entre Homem de ferro e capitao america', 2);
insert into `series`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(5,'serie Homem Aranha no aranhaverso','serie homem aranha',5);
insert into `series`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(6,'serie Capitao America e Soldado Invernal','serie Capitao America',2);
insert into `series`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(7,'serie Capitã Marvel contra o imperio Kree',' seriecapitã marvel',8);
insert into `series`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(8,'serie Pantera Negra se torna rei','serie Pantera negra',7);
insert into `series`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(9,'serie A criação do Visao','serie Android Visao',10);
insert into `series`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(10,'serie Thor contra loki','serie Thor',9);

insert into `stories`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(1,'historia hulk','historia Hulk contra a marvel',1);
insert into `stories`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(2,'historia hulk 2','historia Planeta Hulk',1);
insert into `stories`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(3,'historia Viuva Negra em Moscou','historia Espiã',3);
insert into `stories`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(4,'historia Homen de Ferro contra Capitao America',' historia Luta entre Homem de ferro e capitao america', 2);
insert into `stories`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(5,'historia Homem Aranha no aranhaverso','historia homem aranha',5);
insert into `stories`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(6,'historia Capitao America e Soldado Invernal','historia Capitao America',2);
insert into `stories`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(7,'historia Capitã Marvel contra o imperio Kree',' historia capitã marvel',8);
insert into `stories`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(8,'historia Pantera Negra se torna rei','historia Pantera negra',7);
insert into `stories`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(9,'historia A criação do Visao','historia Android Visao',10);
insert into `stories`(ID,TITULO,DESCRICAO,CHARACTER_ID) values(10,'historia Thor contra loki','historia Thor',9);