# projetoMarvel

Construção de api para consulta de informações de personagens da Marvel.

## Construção do Projeto

Para a contrução da aplicação spring boot se utilizou:

- Java 11
- Banco de Dados MySql
- Flyway
- JUnit
- Lombok
- ModelMaper
- Spring Data

## Baixando o Projeto

- cd "seu diretorio"
- git clone https://github.com/eudoprimo/projetoMarvel.git
- import o projeto para sua ide favorita
- instale o MySql em sua máquina
- configure usuario e senha do banco de dados no applicantion.properties

## Executando o Projeto

- cd "seu diretorio"
- mvn clean package
- java -jar target/*-0.0.1-SNAPSHOT.jar

Ao executar o projeto, será criado automaticamente o schema do banco de dados MySql e o flyway 
executará os scripts para popular o banco de dados.

##Endpoints

- http://localhost:8080/v1/public/characters
- http://localhost:8080/v1/public/characters/{characterId}
- http://localhost:8080/v1/public/characters/{characterId}/series
- http://localhost:8080/v1/public/characters/{characterId}/comics
- http://localhost:8080/v1/public/characters/{characterId}/stories
- http://localhost:8080/v1/public/characters/{characterId}/events