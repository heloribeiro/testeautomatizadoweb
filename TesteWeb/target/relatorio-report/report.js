$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/CriarConta.feature");
formatter.feature({
  "name": "Registrar Conta",
  "description": "  Eu como um cliente quero criar uma conta no site para que eu possa realizar a compra de um ou mais itens",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@registro"
    }
  ]
});
formatter.scenario({
  "name": "registrar conta",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@registro"
    },
    {
      "name": "@registroconta"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu clicar em SignIn",
  "keyword": "Quando "
});
formatter.match({
  "location": "CriarContaStep.euClicarEmSignIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "digitar o email \"clarice@gmail.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "CriarContaStep.digitarOEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar o botao create account",
  "keyword": "E "
});
formatter.match({
  "location": "CriarContaStep.clicarOBotaoCreateAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "digitar as informacoes pessoais",
  "keyword": "E "
});
formatter.match({
  "location": "CriarContaStep.digitarAsInformacoesPessoais()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "tenho o resgistro da conta",
  "keyword": "Entao "
});
formatter.match({
  "location": "CriarContaStep.tenhoOResgistroDaConta()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});