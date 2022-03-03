package test.paginas;

import core.BasePage;
import core.utils.report.screenshot.ScenarioRepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//*[@name='save_to_cart']")
    private WebElement botaoAdicionarCarrinho;

    @FindBy(how = How.XPATH, using = "//*[@id='menuCart']")
    private WebElement BotaoIrParaOCarrinho;

    @FindBy(how = How.XPATH, using = ".//*[@id='product']/td[3]/div/div")
    private WebElement botaoExcluirAdicionado;

    public String getTxtAdcCarrinho() {
        return super.obterTexto(botaoAdicionarCarrinho);
    }

    public void clicarBotaoAdcCarrinho() {
        super.clicarElemento(botaoAdicionarCarrinho);
    }

    public void clicarBotaoIrParaOCarrinho() {
        super.clicarElemento(BotaoIrParaOCarrinho);
    }

    public void clicarBotaoExcluirAdicionado() {
        super.clicarElemento(botaoExcluirAdicionado);
    }

}
