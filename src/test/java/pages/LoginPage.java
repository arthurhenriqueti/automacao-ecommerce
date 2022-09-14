package pages;

import core.BasePage;

public class LoginPage extends BasePage {

    public void acessarPaginaLogin() {
        clicarBotaoPeloXpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]");
    }

    public void escreverEmail(String texto) {
        escreverPeloId("email", texto);
    }

    public void escreverSenha(String texto) {
        escreverPeloId("passwd", texto);
    }

    public void clicarBotaoLogin() {
        clicarBotaoPeloId("SubmitLogin");
    }

    public String validarMsgEmailNaoPreenchido() {
        return obterTextoPeloXpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li");
    }

    public String validarMsgSenhaNaoPreenchida() {
        return obterTextoPeloXpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li");
    }

    public String validarMsgDadosIncorretos() {
        return obterTextoPeloXpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li");
    }

    public String validarMsgDadosCorretos() {
        return obterTextoPeloXpath("/html/body/div/div[2]/div/div[3]/div/p");
    }
}
