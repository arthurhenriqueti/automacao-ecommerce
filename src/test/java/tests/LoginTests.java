package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    LoginPage login = new LoginPage();
    String emailIncorreto = "testando@gg.com";
    String senhaIncorreta = "123";
    String msgEmailNaoPreenchido = "An email address required.";
    String msgSenhaNaoPreenchida = "Password is required.";
    String msgDadosIncorretos = "Invalid password.";

    // Cenário: Efetuar login na plataforma

    @Test
    public void CT01_PreencherApenasSenha() {
        login.acessarPaginaLogin();
        login.escreverSenha(senhaIncorreta);
        login.clicarBotaoLogin();
        Assert.assertEquals(msgEmailNaoPreenchido, login.validarMsgEmailNaoPreenchido());
    }

    @Test
    public void CT02_PreencherApenasEmail() {
        login.acessarPaginaLogin();
        login.escreverEmail(emailIncorreto);
        login.clicarBotaoLogin();
        Assert.assertEquals(msgSenhaNaoPreenchida, login.validarMsgSenhaNaoPreenchida());
    }

    @Test
    public void CT03_NadaPreenchido() {
        login.acessarPaginaLogin();
        login.clicarBotaoLogin();
        Assert.assertEquals(msgEmailNaoPreenchido, login.validarMsgEmailNaoPreenchido());
    }

    @Test
    public void CT04_DadosIncorretos() {
        login.acessarPaginaLogin();
        login.escreverEmail(emailIncorreto);
        login.escreverSenha(senhaIncorreta);
        login.clicarBotaoLogin();
        Assert.assertEquals(msgDadosIncorretos, login.validarMsgDadosIncorretos());
    }
}
