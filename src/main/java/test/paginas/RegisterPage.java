package test.paginas;

import core.BasePage;
import core.utils.FakeUtils;
import core.utils.report.screenshot.ScenarioRepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//input[@name='usernameRegisterPage']")
    private WebElement caixaTextoUsername;

    @FindBy(how = How.XPATH, using = "//input[@name='emailRegisterPage']")
    private WebElement caixaTextoEmail;

    @FindBy(how = How.XPATH, using = "//input[@name='passwordRegisterPage']")
    private WebElement caixaTextoPassword;

    @FindBy(how = How.XPATH, using = "//input[@name='confirm_passwordRegisterPage']")
    private WebElement caixaTextoConfirmarPassword;

    @FindBy(how = How.XPATH, using = "//input[@name='first_nameRegisterPage']")
    private WebElement caixaTextoFirstName;

    @FindBy(how = How.XPATH, using = "//input[@name='last_nameRegisterPage']")
    private WebElement caixaTextoLastName;

    @FindBy(how = How.XPATH, using = "//input[@name='phone_numberRegisterPage']")
    private WebElement caixaTextoPhoneNumber;

    @FindBy(how = How.XPATH, using = "//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[1]/div/select")
    private WebElement comboCountrys;

    @FindBy(how = How.XPATH, using = "//input[@name='cityRegisterPage']")
    private WebElement caixaTextoCidade;

    @FindBy(how = How.XPATH, using = "//input[@name='addressRegisterPage']")
    private WebElement caixaTextoAdress;

    @FindBy(how = How.XPATH, using = "//input[@name='state_/_province_/_regionRegisterPage']")
    private WebElement caixaTextoState;

    @FindBy(how = How.XPATH, using = "//input[@name='postal_codeRegisterPage']")
    private WebElement caixaTextoPostalCode;

    @FindBy(how = How.XPATH, using = "//input[@name='i_agree']")
    private WebElement checkBoxIAgree;

    @FindBy(how = How.ID, using = "register_btnundefined")
    private WebElement buttonRegister;

    @FindBy(how = How.XPATH, using = "//label[.='Passwords do not match']")
    private WebElement mensagemPasswordsDontMatch;

    public void inserirUsuarioCorreto() {
        preencherUsername();
        preencherEmail();
        preencherPasswordValido();
        preencherFirstName();
        preencherLastName();
        preencherPhoneNumber();
        selecionarComboCountry();
        preencherCidade();
        preencherAdress();
        preencherPostalCode();
        preencherState();
    }

    public void inserirUsuarioInorreto() {
        preencherUsername();
        preencherEmail();
        preencherPasswordInvalido();
        preencherFirstName();
        preencherLastName();
        preencherPhoneNumber();
        selecionarComboCountry();
        preencherCidade();
        preencherAdress();
        preencherPostalCode();
        preencherState();
    }

    public String limitaString(String texto, int max){
        return texto.length() <= max ? texto : texto.substring(0, max);
    }

    public void preencherUsername() {
        super.digitarTexto(caixaTextoUsername, limitaString(FakeUtils.gerarUserName(), 15));
    }

    public void preencherEmail() {
        super.digitarTexto(caixaTextoEmail, FakeUtils.gerarEmail());
    }

    public void preencherPasswordValido() {
        String mesmaSenha = "Li1234567890";
        super.digitarTexto(caixaTextoPassword, mesmaSenha);
        super.digitarTexto(caixaTextoConfirmarPassword, mesmaSenha);
    }

    public void preencherPasswordInvalido() {
        String primaSenha = "Li1234567890";
        String segunSenha = "Li0987654321";
        super.digitarTexto(caixaTextoPassword, primaSenha);
        super.digitarTexto(caixaTextoConfirmarPassword, segunSenha);
    }

    public void preencherFirstName() {
        super.digitarTexto(caixaTextoFirstName, FakeUtils.gerarPrimeiroNome());
    }

    public void preencherLastName() {
        super.digitarTexto(caixaTextoLastName, FakeUtils.gerarUltimoNome());
    }

    public void preencherPhoneNumber() {
        super.digitarTexto(caixaTextoPhoneNumber, FakeUtils.gerarNumeroTelefone());
    }

    public void selecionarComboCountry() {
        super.selecionarComboAleatoriamente(comboCountrys);
    }

    public void preencherCidade() {
        super.digitarTexto(caixaTextoCidade, FakeUtils.gerarCidade());
    }

    public void preencherAdress() {
        super.digitarTexto(caixaTextoAdress, FakeUtils.gerarEndereco());
    }

    public void preencherPostalCode() {
        super.digitarTexto(caixaTextoPostalCode, FakeUtils.gerarCodigoPostal());
    }

    public void preencherState() {
        super.digitarTexto(caixaTextoState, limitaString(FakeUtils.gerarEstado(), 10));
    }

    public void clicarCheckBox() {
        checkBoxIAgree.click();
    }

    public String getMensagemSenhasDiferentes() {
        return super.obterTexto(mensagemPasswordsDontMatch);
    }

    public void cliclarBotaoRegistro() {
        super.clicarElemento(buttonRegister);
        esperar(4);
    }

}
