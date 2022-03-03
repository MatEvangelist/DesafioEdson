#language: pt
#enconding: utf-8

Funcionalidade: Adicionar Item no Carrinho

  Contexto:
    Dado que eu acesso o site
    Quando clico no link para a página de produtos
    E adiciono algum item da página ao carrinho

  @AdicionarValido
  Cenario: Adicionar item ao carrinho com sucesso
    Então valido que o item apareceu na página do meu carrinho

  @ExcluirAposAdicioanr
  Cenario: Adicionar item ao carrinho sem sucesso
    E excluo o item do meu carrinho
    Então valido que o meu carrinho está vazio