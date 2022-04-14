package core.configWeb;

import core.utils.report.screenshot.ScenarioRepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    protected void digitarTexto(WebElement elemento, String texto) {
        DriverFactory.getWait().until(ExpectedConditions.visibilityOfAllElements(elemento));
        elemento.sendKeys(texto);
    }

    public String obterTexto(WebElement elemento) {
        DriverFactory.getWait().until(ExpectedConditions.visibilityOfAllElements(elemento));
        return elemento.getText();
    }

    public void selecionarComboAleatoriamente(WebElement elemento) {
        Random aleatorio = new Random();
        Select combo = new Select(elemento);
        DriverFactory.getWait().until(ExpectedConditions.visibilityOfAllElements(elemento));
        combo.selectByIndex(aleatorio.nextInt(241));
    }

    public void clicarElemento(WebElement elemento) {
        DriverFactory.getWait().until(ExpectedConditions.elementToBeClickable(elemento));
        elemento.click();
    }

    public static void esperar(Integer segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void screenshot() {
        esperar(1);
        ScenarioRepository.screenShot();
    }

}