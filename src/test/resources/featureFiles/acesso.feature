#language:pt
#Author: Vinicius Marra Santos
@acessophptravels
Funcionalidade: Acessar o sistema web do phptravels e criar uma conta

  @Chrome @Login
 	Cenario: logar no site phptravels
    Dado que o usuario acesse o site da phptravels pela URL "https://phptravels.net/admin/"
    Quando digitar no campo de email o valor "admin@phptravels.com"
    E  digitar no campo senha o valor "demoadmin"
    E clicar em logar
    Entao deve ser logado no sistema

  @Chrome @criarConta
 	Cenario: logar criar conta no sistema e preencher o formulario
    Dado que o usuario acesse o site da phptravels pela URL "https://phptravels.net/admin/"
    Quando digitar no campo de email o valor "admin@phptravels.com"
    E  digitar no campo senha o valor "demoadmin"
    E clicar em logar
    E clicar no campo Acounts
    E clicar na opcao suppliers
    E clicar no botao adiconar
    E dentro do formulario digitar no campo First Name o valor "teste"
    E dentro do formulario digitar no campo Last Name o valor "teste1"
    E dentro do formulario digitar no campo email o valor "teste@testeeee.com"
    E dentro do formulario digitar no campo Password o valor "123456123"
    E dentro do formulario digitar no campo Mobile Number o valor "119988998"
    E dentro do formulario selecionar no campo Country o valor "Brazil"
    E dentro do formulario digitar no campo Address 1 o valor "teste 1"	
    E dentro do formulario digitar no campo Address 2 o valor "teste 12"
    E dentro do formulario selecionar no campo Supplier For o valor "Cars"
    E dentro do formulario digitar no campo intem name o valor "teste123"
		E dentro do formulario clicar no botao submit
    Entao o formulaio deve ser criado com sucesso

