#language: pt
#encoding: UTF-8
@registro
Funcionalidade: Registrar Conta
  
  Eu como um cliente quero criar uma conta no site para que eu possa realizar a compra de um ou mais itens

  @registroconta
  Cenario: registrar conta
    Quando eu clicar em SignIn
    E digitar o email "clarice@gmail.com"
    E clicar o botao create account
    E digitar as informacoes pessoais
    Entao tenho o resgistro da conta 
