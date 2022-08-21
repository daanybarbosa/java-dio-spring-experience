**Acessar o banco de dados MySQL** <br>
$ mysql -u root -p

**Criar um banco de dados** <br>
$ CREATE database digital_innovation_one;

**Usar o banco recém criado (digital_innovation_one)** <br>
$ USE digital_innovation_one;

**Visualizar os bancos de dados existentes** <br>
$ show databases;

**Exibir o banco de dados atual**<br>
$ select database();

**Criar uma tabela no banco de dados** <br>
$ CREATE TABLE tb_cliente (
id INTEGER PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(80) NOT NULL
);

**Exibir a tabela** <br>
$ show tables;

**Exibir o conteudo da tabela** <br>
$ select * from tb_cliente;

**Apagar a tabela tb_cliente;** <br>
$ DROP TABLE tb_cliente;;
