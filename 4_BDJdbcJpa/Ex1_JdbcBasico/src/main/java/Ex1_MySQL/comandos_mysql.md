# Banco de Dados - MySQL <br><br>
## Scripts SQL

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
$ CREATE TABLE aluno (
id INTEGER PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(80) NOT NULL,
idade INTEGER NOT NULL,
estado CHARACTER(2) NOT NULL
);

**Exibir a tabela** <br>
$ show tables;

**Adicionar alguns dados a tabela** <br>
INSERT INTO aluno(nome, idade, estado) VALUES ('Pedro', 20, 'RJ');
INSERT INTO aluno(nome, idade, estado) VALUES ('Maria', 35, 'AC');
INSERT INTO aluno(nome, idade, estado) VALUES ('Joao', 10, 'SC');
INSERT INTO aluno(nome, idade, estado) VALUES ('Ana', 51, 'GO');

**Exibir o conteudo da tabela** <br>
$ select * from aluno;

**Apagar a tabela aluno** <br>
$ DROP TABLE aluno;


!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! ATENÇÃO !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
O PASSO ABAIXO É NECESSÁRIO PARA EXECUTAR AS PRÓXIMAS TAREFAS DA PART2 e PART3

O PASSO ABAIXO FOI UTILIZADO EM UM PROJETO GRADLE
CASO ESTEJA USANDO MAVEN (ou nenhum gerenciador de pacotes) DEVERÁ SER UTILIZADO OUTRO GUIA
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! ATENÇÃO !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


=======================================================
=== BAIXAR DRIVER PARA O JAVA SE COMUNICAR COM O BD ===
=======================================================

- No gradle deve-se adicionar no "build.gradle" (na parte de "dependencies") a linha abaixo
  compile group: 'mysql', name: 'mysql-connector-java', version: '8.0.17'
