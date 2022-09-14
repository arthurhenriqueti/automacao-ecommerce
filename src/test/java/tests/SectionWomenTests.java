package tests;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.SectionWomenPage;

public class SectionWomenTests extends BaseTest {

    SectionWomenPage sectionWomen = new SectionWomenPage();
    String msgSecaoCamisetas = "T-SHIRTS ";
    String msgSecaoBlusas = "BLOUSES ";

    @Test
    public void CT01_AcessarSecaoCamisetas() {
        sectionWomen.expandirMenuWomen();
        sectionWomen.acessarSecaoCamisetas();
        Assert.assertEquals(msgSecaoCamisetas, sectionWomen.validarMsgSecaoCamisetas());
    }

    @Test
    public void CT02_AcessarSecaoBlusas() {
        sectionWomen.expandirMenuWomen();
        sectionWomen.acessarSecaoBlusas();
        Assert.assertEquals(msgSecaoBlusas, sectionWomen.validarMsgSecaoBlusas());
    }
}
