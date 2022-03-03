package test.paginas;

import core.BasePage;
import core.utils.report.screenshot.ScenarioRepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SpeakersPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//h3[@class='categoryTitle roboto-regular sticky ng-binding']")
    private WebElement textoPaginaSpeakers;

    @FindBy(how = How.XPATH, using = ".//*[@id='20']")
    private WebElement botaoPrimeiroProduto;

    @FindBy(how = How.XPATH, using = "//div[3]//div[1]/p/a")
    private WebElement textoQuantidadeProdutos;

    public String getTextoTelaSpeakers() {
        return super.obterTexto(textoPaginaSpeakers);
    }

    public String getTextoQuantidadeProdutos() {
        return super.obterTexto(textoQuantidadeProdutos);
    }

    public void clicarPrimeiroProduto() {
        super.clicarElemento(botaoPrimeiroProduto);
    }

}
