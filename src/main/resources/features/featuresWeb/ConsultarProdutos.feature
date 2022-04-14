#language: pt
#enconding: utf-8
#author: Mathews Evangelista

Funcionalidade: Consultar Produtos

  Contexto:
    Dado que eu acesso o site

  @ConsultaDeVariosProdutos
  Cenario: Realizar consulta válida de produtos disponíveis
    Quando clico no link para a página de produtos
    Então valido os produtos disponíveis presentes

  @ConsultaDeProdutoEspecifico
  Cenario: Realizar a consulta de um produto específico
    Quando clico no link para a página da oferta especial
    Então valido a pagina do produto em questão