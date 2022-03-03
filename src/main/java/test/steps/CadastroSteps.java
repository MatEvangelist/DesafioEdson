package test.steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import test.paginas.HomePage;
import test.paginas.RegisterPage;

import static core.BasePage.screenshot;

public class CadastroSteps {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Quando("clico no menu usuário para criar nova conta")
    public void clicoNoMenuUsuárioParaCriarNovaConta() {
        homePage.clicarBotaoUsuario();
        screenshot();
        homePage.clicarLinkNovoUsuario();
    }

    @E("preencho corretamente os campos de cadastro")
    public void preencho_corretamente_os_campos_de_cadastro() {
        registerPage.inserirUsuarioCorreto();
        screenshot();
        registerPage.clicarCheckBox();
        screenshot();
        registerPage.cliclarBotaoRegistro();

    }

    @E("preencho incorretamente os campos de cadastro")
    public void preencho_incorretamente_os_campos_de_cadastro() {
        registerPage.inserirUsuarioInorreto();
        screenshot();
        registerPage.clicarCheckBox();
    }

    @Então("valido que a mensagem de erro {string} está sendo exibida")
    public void validoQueAMensagemDeErroEstáSendoExibida(String mensagem) {
        Assert.assertEquals(registerPage.getMensagemSenhasDiferentes(), mensagem);
        screenshot();
    }

}
