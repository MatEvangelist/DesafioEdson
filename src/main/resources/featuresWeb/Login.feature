#language: pt
#enconding: utf-8

Funcionalidade: Login

  Contexto:
    Dado que eu acesso o site
    Quando clico no menu usuário

  @LoginValido
  Cenario: Realizar login com sucesso no sistema
    E realizo login com o usuário "VALIDO"
    Então valido que que estou logado

  @LoginInvalido
  Cenario: Não conseguir realizar login porque o usuário ou senha está errado
    E realizo login com o usuário "INVALIDO"
    Então valido que a mensagem "Incorrect user name or password." está sendo exibida