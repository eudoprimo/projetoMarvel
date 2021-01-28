CREATE TABLE CHARACTERS (
    ID bigint not null auto_increment,
    NOME varchar(200) not null,
    DESCRICAO varchar(200) not null,
    PRIMARY KEY (ID));

CREATE TABLE COMICS(
    ID bigint not null auto_increment,
    TITULO varchar(200) not null,
    DESCRICAO varchar(200) not null,
	CHARACTER_ID bigint,
    PRIMARY KEY (ID),
    FOREIGN KEY (CHARACTER_ID) REFERENCES CHARACTERS(ID));
    
CREATE TABLE EVENTS (
    ID bigint not null auto_increment,
    TITULO varchar(200) not null,
    DESCRICAO varchar(200) not null,
	CHARACTER_ID bigint,
    PRIMARY KEY (ID),
    FOREIGN KEY (CHARACTER_ID) REFERENCES CHARACTERS(ID));

CREATE TABLE SERIES (
    ID bigint not null auto_increment,
    TITULO varchar(200) not null,
    DESCRICAO varchar(200) not null,
	CHARACTER_ID bigint,
    PRIMARY KEY (ID),
    FOREIGN KEY (CHARACTER_ID) REFERENCES CHARACTERS(ID));

CREATE TABLE STORIES (
    ID bigint not null auto_increment,
    TITULO varchar(200) not null,
    DESCRICAO varchar(200) not null,
	CHARACTER_ID bigint,
    PRIMARY KEY (ID),
    FOREIGN KEY (CHARACTER_ID) REFERENCES CHARACTERS(ID));