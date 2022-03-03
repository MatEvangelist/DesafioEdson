package test.steps;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import test.paginas.HomePage;

import static core.BasePage.screenshot;

public class LogoutSteps {

    HomePage homePage = new HomePage();

    @Quando("clico na opção de logout no menu do usuário")
    public void clico_na_opção_de_logout_no_menu_do_usuário() {
        homePage.clicarBotaoUsuario();
        screenshot();
        homePage.clicarBotaoLogout();
    }

    @Então("valido que meu usuário está deslogado")
    public void valido_que_meu_usuário_está_deslogado() {
        screenshot();
        homePage.clicarBotaoUsuario();
        Assert.assertEquals(homePage.getTextoLinkCreateNewAccount(), "CREATE NEW ACCOUNT");
    }
}
