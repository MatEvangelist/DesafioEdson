package test.paginasWeb;

import core.configWeb.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountPage extends BasePage {

    @FindBy(how = How.XPATH, using = "//h3[.='MY ACCOUNT']")
    private WebElement textoMyAccount;

    public String getTextoCabecalho() {
        return super.obterTexto(textoMyAccount);
    }

}
