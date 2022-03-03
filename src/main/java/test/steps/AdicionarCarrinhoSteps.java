package test.steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import test.paginas.HomePage;
import test.paginas.ProductPage;
import test.paginas.ShoppingCartPage;
import test.paginas.SpeakersPage;

public class AdicionarCarrinhoSteps {

    SpeakersPage speakersPage = new SpeakersPage();
    ProductPage productPage = new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @E("adiciono algum item da página ao carrinho")
    public void adiciono_algum_item_da_página_ao_carrinho() {
        speakersPage.clicarPrimeiroProduto();
        productPage.clicarBotaoAdcCarrinho();
    }

    @Então("valido que o item apareceu na página do meu carrinho")
    public void valido_que_o_item_apareceu_na_página_do_meu_carrinho() {
        productPage.clicarBotaoIrParaOCarrinho();
        Assert.assertEquals(shoppingCartPage.getTextoCaixaCarrinhoComItem(), "PAYMENT OPTIONS:");
    }

    @E("excluo o item do meu carrinho")
    public void excluoOItemDoMeuCarrinho() {
        productPage.clicarBotaoExcluirAdicionado();
    }

    @Então("valido que o meu carrinho está vazio")
    public void validoQueOMeuCarrinhoEstáVazio() {
        productPage.clicarBotaoIrParaOCarrinho();
        Assert.assertEquals(shoppingCartPage.getTextoCaixaCarrinhoVazio(), "Your shopping cart is empty");
    }
}
