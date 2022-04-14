package test.paginasWeb;

import core.configWeb.BasePage;
import core.entidades.UsuarioWeb;
import core.utils.report.screenshot.ScenarioRepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    @FindBy(how = How.XPATH, using = "//h3[@class='roboto-regular center ng-scope']")
    private WebElement textoPaginaInicial;

    @FindBy(how = How.ID, using = "menuUserLink")
    private WebElement botaoMenuUsuario;

    @FindBy(how = How.XPATH, using = "//*[text()='SIGN IN']")
    private WebElement botaoSignIn;

    @FindBy(how = How.XPATH, using = "//input[@name='username']")
    private WebElement caixaTextoUsername;

    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    private WebElement caixaTextoPassword;

    @FindBy(how = How.ID, using = "signInResultMessage")
    private WebElement mensagemLoginResult;

    @FindBy(how = How.LINK_TEXT, using = "CREATE NEW ACCOUNT")
    private WebElement linkCreateNewAccount;

    @FindBy(how = How.XPATH, using = "//ul//label[.='My account']")
    private WebElement linkMyAccount;

    @FindBy(how = How.XPATH, using = "//ul//label[.='Sign out']")
    private WebElement linkLogout;

    @FindBy(how = How.ID, using = "speakersImg")
    private WebElement linkSpeakersImg;

    @FindBy(how = How.XPATH, using = "//*[@id='see_offer_btn']")
    private WebElement botaoOfertaEspecial;

    public void clicarImgSpeakers() {
        super.clicarElemento(linkSpeakersImg);
    }

    public String getTextoTelaInicial() {
        return super.obterTexto(textoPaginaInicial);
    }

    public void clicarLinkNovoUsuario() {
        super.clicarElemento(linkCreateNewAccount);
    }

    public void preencherUsername(String user) {
        super.digitarTexto(caixaTextoUsername, UsuarioWeb.valueOf(user).getUsername());
    }


    public void preencherPassword(String user) {
        super.digitarTexto(caixaTextoPassword, UsuarioWeb.valueOf(user).getSenha());
    }

    public String getMensagemResultadoLogin() {
        return super.obterTexto(mensagemLoginResult);
    }

    public void clicarBotaoUsuario() {
        esperar(1);
        super.clicarElemento(botaoMenuUsuario);
    }

    public void clicarBotaoSignIn() {
        super.clicarElemento(botaoSignIn);
    }

    public void clicarBotaoMyAccount() {
        super.clicarElemento(linkMyAccount);
    }

    public void clicarBotaoLogout() {
        super.clicarElemento(linkLogout);
    }

    public void clicarBotaoOfertaEspecial() {
        super.clicarElemento(botaoOfertaEspecial);
        ScenarioRepository.screenShot();
    }

    public String getTextoLinkCreateNewAccount() {
        return super.obterTexto(linkCreateNewAccount);
    }

}
