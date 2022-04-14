package test.stepsWeb;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import test.paginasWeb.HomePage;
import test.paginasWeb.MyAccountPage;
import test.paginasWeb.SpeakersPage;

import static core.configWeb.BasePage.screenshot;

public class GenericosSteps {

    HomePage homePage = new HomePage();
    MyAccountPage myAccountPage = new MyAccountPage();
    SpeakersPage speakersPage = new SpeakersPage();

    @Dado("que eu acesso o site")
    public void queEuAcessoOSite() {
        screenshot();
        Assert.assertTrue(homePage.getTextoTelaInicial().contains("SPECIAL OFFER"));
    }

    @Então("valido que que estou logado")
    public void validoQueQueEstouLogado() {
        screenshot();
        homePage.clicarBotaoUsuario();
        homePage.clicarBotaoMyAccount();
        Assert.assertEquals(myAccountPage.getTextoCabecalho(), "MY ACCOUNT");
        screenshot();
    }

    @Quando("clico no link para a página de produtos")
    public void clico_no_link_para_a_página_de_produtos() {
        screenshot();
        homePage.clicarImgSpeakers();
        Assert.assertEquals(speakersPage.getTextoTelaSpeakers(), "SPEAKERS");
    }

}
