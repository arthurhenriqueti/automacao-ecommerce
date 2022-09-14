package pages;

import core.BasePage;

public class ContactPage extends BasePage {

    public void acessarPaginaContato() {
        clicarBotaoPeloId("contact-link");
    }

    public void escreverEmail(String texto) {
        escreverPeloId("email", texto);
    }

    public void escreverOrdem(String texto) {
        escreverPeloId("id_order", texto);
    }

    public void escreverMensagem(String texto) {
        escreverPeloId("message", texto);
    }

    public void selecionarCabecalho(String texto) {
        selecionarComboPeloId("id_contact", texto);
    }

    public void clicarBotaoEnviar() {
        clicarBotaoPeloId("submitMessage");
    }

    public String validarMsgEmailNaoPreenchido() {
        return obterTextoPeloXpath("/html/body/div/div[2]/div/div[3]/div/div/ol/li");
    }

    public String validarMsgCabecalhoNaoPreenchido() {
        return obterTextoPeloXpath("/html/body/div/div[2]/div/div[3]/div/div/ol/li");
    }

    public String validarMsgMensagemNaoPreenchida() {
        return obterTextoPeloXpath("/html/body/div/div[2]/div/div[3]/div/div/ol/li");
    }

    public String validarMsgMensagemEnviadaComSucesso() {
        return obterTextoPeloXpath("/html/body/div/div[2]/div/div[3]/div/p");
    }
}
