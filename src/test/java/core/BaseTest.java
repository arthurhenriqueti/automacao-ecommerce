package core;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

import static core.DriverFactory.getDriver;
import static core.DriverFactory.stopDriver;

public class BaseTest {

    @Before
    public void iniciar() {
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        getDriver().get("http://automationpractice.com/index.php");
        Assert.assertEquals("My Store", getDriver().getTitle());
    }

    @After
    public void finalizar() {
        stopDriver();
    }
}
