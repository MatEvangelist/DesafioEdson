package test.stepsWeb;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import test.paginasWeb.HomePage;

import static core.configWeb.BasePage.screenshot;

public class LoginSteps {

    HomePage homePage = new HomePage();

    @Quando("clico no menu usuário")
    public void clicoNoMenuUsuário() {
        homePage.clicarBotaoUsuario();
        screenshot();
    }

    @E("realizo login com o usuário {string}")
    public void realizoLoginComOUsuário(String usuario) {
        homePage.preencherUsername(usuario);
        homePage.preencherPassword(usuario);
        screenshot();
        homePage.clicarBotaoSignIn();
    }

    @Então("valido que a mensagem {string} está sendo exibida")
    public void validoQueAMensagemEstáSendoExibida(String mensagem) {
        screenshot();
        Assert.assertEquals(mensagem, homePage.getMensagemResultadoLogin());
    }

}
