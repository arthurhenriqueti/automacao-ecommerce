package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.SearchPage;

public class SearchTests extends BaseTest {

    SearchPage search = new SearchPage();
    String produtoExistente = "shoes";
    String produtoInexistente = "testando";
    String msgProdutoInexistente = "No results were found for your search \"testando\"";
    String msgNomeProdutoNaoPreenchido = "Please enter a search keyword";
    String msgProdutoExistente = "\"SHOES\"";

    // Cenário: Buscar por produtos

    @Test
    public void CT01_buscarProdutoInexistente() {
        search.escreverProduto(produtoInexistente);
        search.clicarBotaoBuscar();
        Assert.assertEquals(msgProdutoInexistente, search.validarMsgProdutoInexistente());
    }

    @Test
    public void CT02_buscarSemPreencherNomeProduto() {
        search.clicarBotaoBuscar();
        Assert.assertEquals(msgNomeProdutoNaoPreenchido, search.validarMsgNomeProdutoNaoPreenchido());
    }

    @Test
    public void CT03_buscarProdutoExistente() {
        search.escreverProduto(produtoExistente);
        search.clicarBotaoBuscar();
        Assert.assertEquals(msgProdutoExistente, search.validarMsgProdutoExistente());
    }
}
