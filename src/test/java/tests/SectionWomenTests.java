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
    public void acessarSecaoCamisetas() {
        sectionWomen.expandirMenuWomen();
        sectionWomen.acessarSecaoCamisetas();
        Assert.assertEquals(msgSecaoCamisetas, sectionWomen.validarMsgSecaoCamisetas());
    }

    @Test
    public void acessarSecaoBlusas() {
        sectionWomen.expandirMenuWomen();
        sectionWomen.acessarSecaoBlusas();
        Assert.assertEquals(msgSecaoBlusas, sectionWomen.validarMsgSecaoBlusas());
    }
}
