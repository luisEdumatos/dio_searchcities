# API Distance Cities - Bootcamp Everis QA Beginner DigitalInnovationOne

## Sobre o sistema 📋

Este projeto foi desenvolvido no modulo "Construindo API Rest de consulta de cidades do Brasil do zero até a produção", no Bootcamp Everis QA Beginner.

A implementação consiste na manipulação de 3 tabelas de dados que representam Pais, Estado e Cidade. 

Desta forma, é possível listar todos os 3 tipos de objetos. Ao listar um Estado, você também poderá ver os detalhes do Pais associado a ele. Ao listar uma Cidade, você poderá ver os detalhes de Estado e Pais associados a ela. 

A principal função da API é calcular a distancia em milhas ou metros de uma Cidade até outra. 

Para realizar esta consulta, basta executar uma requisição GET para o endereço da aplicação (No caso, localhost, pois não foi feito o deploy em nuvem) e passar os parametros. 

Nos exemplos abaixo, os números 4929 e 5254 são ids de cidades existentes. Caso queira procurar por outra cidade, basta buscar o ID da cidade que deseja e mudar o parametro de consulta de distancia.  

Parametro "by-points" retorna a distancia em milhas:

http://localhost:8080/distances/by-points?from=4929&to=5254

Parametro "by-cube" retorna a distancia em metros:

http://localhost:8080/distances/by-cube?from=4929&to=5254

## Funcionamento da API ⚙️

Para executar o projeto, você deverá ter um ambiente de desenvolvimento configurado. Certifique-se de possuir o Java 11 e uma IDE de sua preferencia. Baixe e faça o build do projeto. No projeto é utilizado algumas ferramentas adicionais como o Lombok e o Hibernate Types, portanto, verifique se todas as dependencias foram resolvidas na sua estação. 

Além disso, você deverá instalar o banco de dados PostgreSQL para poder armazenar os dados utilizados na aplicação. As configurações do banco poderão ser consultadas ou alteradas no arquivo \api_cities\src\main\resources\application.properties. 

Os arquivos .sql para criação das tabelas e inserção dos dados encontram-se na raiz deste projeto, na pasta PostgreSQL. Estes arquivos foram coletados no repositório publico presente no seguinte link: 

https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL

Qualquer dúvida em relação a este projeto, favor me contactar.
