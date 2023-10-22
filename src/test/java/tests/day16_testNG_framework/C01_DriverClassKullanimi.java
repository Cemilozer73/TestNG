package tests.day16_testNG_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverClassKullanimi {


    @Test(groups = {"smoke"})
    public void amazonTest(){

        //amazon'a gidelim
        Driver.getDriver().get("https://wwww.amazon.com");

        // nutella icin arama yapalim
        WebElement aramaKutusu = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));

       // Sayfayi kapatin
        Driver.closeDriver();
    }

    @Test(groups = {"smoke","regression"})
    public void youtubeTesti(){

        Driver.getDriver().get("https://www.youtube.com");
        Driver.closeDriver();
    }
}
