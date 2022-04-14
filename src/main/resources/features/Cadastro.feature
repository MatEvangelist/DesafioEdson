#language: pt
#enconding: utf-8

Funcionalidade: Cadastro

  Contexto:
    Dado que eu acesso o site
    Quando clico no menu usuário para criar nova conta

  @CadastroValido
  Cenário: Realizar cadastro com sucesso no sistema
    E preencho corretamente os campos de cadastro
    Então valido que que estou logado

  @CadastroInvalido
  Cenário: Não realizar cadastro com dados inválidos
    E preencho incorretamente os campos de cadastro
    Então valido que a mensagem de erro "Passwords do not match" está sendo exibida