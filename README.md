# Desafio-hub

#### Descrição:

Este projeto foi desenvolvido para o desafio proposto a hub-floripa durante o processo seletivo.<br>
O projeto sujere para fazer a criação de uma tabela que consiga adicionar e remover uma pessoa desta tabela. Para o desenvolvimento do projeto as regras são:
##### frontend:
Usar apenas HTML, CSS e JavaScript vanilla, não podendo usar frameworks.

##### backend:
Usando JAVA para criar a API RESTfull usando POST para inserir e DELETE para remover o usuário.
Usando apenas o Spring e o banco de dados SQL. Não podendo usar JPA ou hibernate.<br>

Os dados que devem conter nesta tabela são: id, nome, email, telefone, profissão.<br>

#### Como a tabela deveria ficar:

<img src="https://user-images.githubusercontent.com/11966183/163838488-186296b6-10f9-4e68-83b6-b5bb248d207e.jpg"></img>

#### Resultado final da tabela:
![tabela com dados nome, email, telefone, profissão](imagem-readme/screen.jpg)

## Executar o projeto na máquina local:
##### Server-side:
Para executar o projeto no lado do servidor precisa ter instalado em sua máquina a linguagem Java, Spring-boot e o MYsql.<br>

- Clone o projeto: `git clone git@github.com:Oldroge/Desafio-hub.git` <br><br>

- Entra na pasta clonada: `cd Desafio-hub` <br><br>

- Na raiz do projeto instale as dependências: `mvn install` <br><br>

- Ainda na raiz do projeto, execute: `mvn spring-boot:run` <br><br>

- Acesse a API através do: `http://localhost:8080/pessoas`

###### A api por enquanto aceita um GET, POST e DELETE, não sem possível fazer um PUT.

##### Cliente-side:
Usei a IDE Eclipse para desenvolver todo o projeto, no marketplace do eclipse é possível baixar o Eclipse Web Developer Tools, para auxiliar no desenvolvimento de HTML, CSS e Javascript.<br>
Quando abre o arquivo `.html` na própria IDE tem a uma aba web para ver a execução do projeto e ver seu funcionamento. <br>

Outra IDE de meu conhecimento que é possível executar esse frontend é o VSCode, dentro da IDE só precisa baixar o `live server` plugin. <br>
Com o arquivo `index.html` aberto clique em `live server` no canto inferior direito e abrirá a página no seu navegador padrão.