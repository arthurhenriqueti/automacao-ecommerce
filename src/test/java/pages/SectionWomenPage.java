package pages;

import core.BasePage;

public class SectionWomenPage extends BasePage {

    public void expandirMenuWomen() {
        expandirMenuPeloXpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a");
    }

    public void acessarSecaoCamisetas() {
        clicarBotaoPeloXpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[1]/a");
    }

    public void acessarSecaoBlusas() {
        clicarBotaoPeloXpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[2]/a");
    }

    public String validarMsgSecaoCamisetas() {
        return obterTextoPeloXpath("/html/body/div/div[2]/div/div[3]/div[2]/h1/span[1]");
    }

    public String validarMsgSecaoBlusas() {
        return obterTextoPeloXpath("/html/body/div/div[2]/div/div[3]/div[2]/h1/span[1]");
    }
}
