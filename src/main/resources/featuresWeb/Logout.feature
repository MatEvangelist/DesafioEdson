#language: pt
#enconding: utf-8

Funcionalidade: Realizar o logout do site

  Contexto:
    Dado que eu acesso o site
    Quando clico no menu usuário
    E realizo login com o usuário "VALIDO"

  @DeslogarValido
  Cenario: Realiza o logout com sucesso
    E clico na opção de logout no menu do usuário
    Então valido que meu usuário está deslogado