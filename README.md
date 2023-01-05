# **_Projeto de logistica de calculo de gastos fluig_**

o projeto compoe em cadastrar veiculos para trasporte de produto de limpeza, porem vem tendo um problema com o alto custo de gastos de combustivel, 
e o projeto foi feito para calcular esse gasto e analisar a possivel tomada de decisão para resolver esse projeto.


São necessários os seguintes pré-requisitos para a execução do projeto desenvolvido:

Java 11.
Maven 3.8.4 ou versões superiores.
Intellij IDEA Community Edition ou sua IDE favorita.
Controle de versão GIT instalado na sua máquina.
Conta no GitHub para o armazenamento na nuvem.
ferramenta Postman para executar as apis.
docker para criar a imagem do banco de dados MySQL

inclui no projeto um docker com um banco mySql 

**DOCKER**

acessar o terminal na raiz do projeto, digitar o comando "cd docker"
depois digitrar "dockdocker-compose up mysql" 


**APLICAÇÃO**

depois que o banco de dados esiver rodando, clicar com o botao direito na classe FluigAplication e selecionar Run 

**POSTMAN** 

selecionar o tipo de requisição POST e usar a url = EXEMPLO: "localhost:8080/ficticius/cadastrarVeiculo"
OBS: cadastrar mais de 1 

para testar o calculo selecionar o GET u usar a url = EXEMPLO: "localhost:8080/ficticius/calculoGastos?preco=5&cidade=40&rodovia=100"
