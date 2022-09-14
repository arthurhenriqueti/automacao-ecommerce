package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    LoginPage login = new LoginPage();
    String emailCorreto = "arthurtestando@gg.com";
    String senhaCorreta = "123456789a";
    String emailIncorreto = "testando@gg.com";
    String senhaIncorreta = "123";
    String msgEmailNaoPreenchido = "An email address required.";
    String msgSenhaNaoPreenchida = "Password is required.";
    String msgDadosIncorretos = "Invalid password.";
    String msgDadosCorretos = "Welcome to your account. Here you can manage all of your personal information and orders.";

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

    @Test
    public void CT05_DadosCorretos() {
        login.acessarPaginaLogin();
        login.escreverEmail(emailCorreto);
        login.escreverSenha(senhaCorreta);
        login.clicarBotaoLogin();
        Assert.assertEquals(msgDadosCorretos, login.validarMsgDadosCorretos());
    }
}
