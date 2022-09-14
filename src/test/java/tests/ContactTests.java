package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.ContactPage;

public class ContactTests extends BaseTest {

    ContactPage contact = new ContactPage();
    String email = "testando@gg.com";
    String mensagem = "testando...";
    String ordem = "testando...";
    String msgMensagemNaoPreenchida = "The message cannot be blank.";
    String msgEmailNaoPreenchido = "Invalid email address.";
    String msgCabecalhoNaoPreenchido = "Please select a subject from the list provided.";
    String msgMensagemEnviadaComSucesso = "Your message has been successfully sent to our team.";

    // Cenário: Entrar em contato com a empresa através do formulário

    @Test
    public void CT01_PreencherApenasEmail() {
        contact.acessarPaginaContato();
        contact.escreverEmail(email);
        contact.clicarBotaoEnviar();
        Assert.assertEquals(msgMensagemNaoPreenchida, contact.validarMsgMensagemNaoPreenchida());
    }

    @Test
    public void CT02_PreencherApenasMensagem() {
        contact.acessarPaginaContato();
        contact.escreverMensagem(mensagem);
        contact.clicarBotaoEnviar();
        Assert.assertEquals(msgEmailNaoPreenchido, contact.validarMsgEmailNaoPreenchido());
    }

    @Test
    public void CT03_CabecalhoNaoPreenchido() {
        contact.acessarPaginaContato();
        contact.escreverEmail(email);
        contact.escreverOrdem(ordem);
        contact.escreverMensagem(mensagem);
        contact.clicarBotaoEnviar();
        Assert.assertEquals(msgCabecalhoNaoPreenchido, contact.validarMsgCabecalhoNaoPreenchido());
    }

    @Test
    public void CT04_MensagemEnviadaComSucesso() {
        contact.acessarPaginaContato();
        contact.escreverEmail(email);
        contact.escreverOrdem(ordem);
        contact.escreverMensagem(mensagem);
        contact.selecionarCabecalho("Webmaster");
        contact.clicarBotaoEnviar();
        Assert.assertEquals(msgMensagemEnviadaComSucesso, contact.validarMsgMensagemEnviadaComSucesso());
    }
}
