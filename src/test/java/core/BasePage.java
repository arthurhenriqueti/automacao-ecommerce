package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static core.DriverFactory.getDriver;

public class BasePage {

    public void escreverPeloId(String id_campo, String texto) {
        getDriver().findElement(By.id(id_campo)).clear();
        getDriver().findElement(By.id(id_campo)).sendKeys(texto);
    }

    public void escreverPeloXpath(String xpath_campo, String texto) {
        getDriver().findElement(By.xpath(xpath_campo)).clear();
        getDriver().findElement(By.xpath(xpath_campo)).sendKeys(texto);
    }

    public void clicarBotaoPeloId(String id_campo) {
        getDriver().findElement(By.id(id_campo)).click();
    }

    public void clicarBotaoPeloXpath(String xpath_campo) {
        getDriver().findElement(By.xpath(xpath_campo)).click();
    }

    public String obterTextoPeloId(String id_campo) {
        return getDriver().findElement(By.id(id_campo)).getText();
    }

    public String obterTextoPeloXpath(String xpath_campo) {
        return getDriver().findElement(By.xpath(xpath_campo)).getText();
    }

    public String obterValorCampoPeloId(String id_campo) {
        return getDriver().findElement(By.id(id_campo)).getAttribute("value");
    }

    public String obterValorCampoPeloXpath(String xpath_campo) {
        return getDriver().findElement(By.xpath(xpath_campo)).getAttribute("value");
    }

    public void selecionarComboPeloId(String id_campo, String texto) {
        WebElement element = getDriver().findElement(By.id(id_campo));
        Select combo = new Select(element);
        combo.selectByVisibleText(texto);
    }

    public void selecionarComboPeloXpath(String xpath_campo, String texto) {
        WebElement element = getDriver().findElement(By.xpath(xpath_campo));
        Select combo = new Select(element);
        combo.selectByVisibleText(texto);
    }

    public WebElement obterValorComboPeloId(String id_campo) {
        WebElement element = getDriver().findElement(By.id(id_campo));
        Select combo = new Select(element);
        return combo.getFirstSelectedOption();
    }

    public WebElement obterValorComboPeloXpath(String xpath_campo) {
        WebElement element = getDriver().findElement(By.xpath(xpath_campo));
        Select combo = new Select(element);
        return combo.getFirstSelectedOption();
    }

    public void selecionarOpcaoPeloId(String id_campo) {
        getDriver().findElement(By.id(id_campo)).click();
    }

    public void selecionarOpcaoPeloXpath(String xpath_campo) {
        getDriver().findElement(By.xpath(xpath_campo)).click();
    }

    public boolean validarOpcaoPreenchidaPeloId(String id_campo) {
        return getDriver().findElement(By.id(id_campo)).isSelected();
    }

    public boolean validarOpcaoPreenchidaPeloXpath(String xpath_campo) {
        return getDriver().findElement(By.xpath(xpath_campo)).isSelected();
    }
}
