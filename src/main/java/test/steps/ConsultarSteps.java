package test.steps;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import test.paginas.HomePage;
import test.paginas.ProductPage;
import test.paginas.SpeakersPage;

import static core.BasePage.screenshot;

public class ConsultarSteps {

    HomePage homePage = new HomePage();
    SpeakersPage speakersPage = new SpeakersPage();
    ProductPage productPage = new ProductPage();

    @Quando("clico no link para a página da oferta especial")
    public void clicoNoLinkParaAPáginaDaOfertaEspecial() {
        homePage.clicarBotaoOfertaEspecial();
    }

    @Então("valido os produtos disponíveis presentes")
    public void validoOsProdutosDisponíveisPresentes() {
        Assert.assertEquals(speakersPage.getTextoQuantidadeProdutos(), "7 ITEMS");
        screenshot();
    }

    @Então("valido a pagina do produto em questão")
    public void validoAPaginaDoProdutoEmQuestão() {
        Assert.assertEquals(productPage.getTxtAdcCarrinho(), "ADD TO CART");
        screenshot();
    }

}
