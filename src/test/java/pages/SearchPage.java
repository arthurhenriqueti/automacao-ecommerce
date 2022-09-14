package pages;

import core.BasePage;

public class SearchPage extends BasePage {

    public void escreverProduto(String texto) {
        escreverPeloId("search_query_top", texto);
    }

    public void clicarBotaoBuscar() {
        clicarBotaoPeloXpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button");
    }

    public String validarMsgProdutoInexistente() {
        return obterTextoPeloXpath("/html/body/div/div[2]/div/div[3]/div[2]/p");
    }

    public String validarMsgNomeProdutoNaoPreenchido() {
        return obterTextoPeloXpath("/html/body/div/div[2]/div/div[3]/div[2]/p");
    }

    public String validarMsgProdutoExistente() {
        return obterTextoPeloXpath("/html/body/div/div[2]/div/div[3]/div[2]/h1/span[1]");
    }
}
