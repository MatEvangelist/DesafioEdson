package test.paginasWeb;

import core.configWeb.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCartPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//*[@id='shoppingCart']/div/label")
    private WebElement textoCarrinhoVazio;

    @FindBy(how = How.XPATH, using = "//*[@id='shoppingCart']//tr[1]/td[1]/label")
    private WebElement textoCarrinhoComItem;

    public String getTextoCaixaCarrinhoComItem() {
        esperar(2);
        return super.obterTexto(textoCarrinhoComItem);
    }

    public String getTextoCaixaCarrinhoVazio() {
        esperar(2);
        return super.obterTexto(textoCarrinhoVazio);
    }

}
