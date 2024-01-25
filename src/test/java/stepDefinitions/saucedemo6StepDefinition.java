package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class saucedemo6StepDefinition extends BaseTest {

    @Then("ilk urun secili mi kontrol et")
    public void ilkUrunSeciliMiKontrolEt() {
        WebElement backPackUrunEkli = driver.findElement(By.xpath("//*[@id='item_4_title_link']/div"));
        backPackUrunEkli.isDisplayed();
//        WebElement bikeLightUrunEkli = driver.findElement(By.xpath("//*[@id='item_0_title_link']/div"));
//        bikeLightUrunEkli.isDisplayed();
        System.out.println("ilk urun secili");
    }

    @When("saucedemoTotalIlkUrun")
    public double saucedemototalılkurun() {
        WebElement priceTotal = driver.findElement(By.xpath("(//div[contains(text(),'$')])[2]"));
        System.out.println("ne yaziyor acaba: "+priceTotal.getText());
        System.out.println("önündeki yazılar gidince, sadece sayi: "+priceTotal.getText().substring(13));
        double saucedemotoplam = Double.parseDouble(priceTotal.getText().substring(13));
        double yuvarlanan_sayi = (double) Math.round(saucedemotoplam * 100) / 100;
        System.out.println("yuvarlaninca: "+yuvarlanan_sayi);
        return yuvarlanan_sayi;
    }
    @Given("ilkUrunFiyatiToplam")
    public double ilkurunfiyatitoplam() {
        WebElement backPackUrunFiyat = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]"));
        System.out.println(backPackUrunFiyat.getText());
        System.out.println("neden!!! : "+backPackUrunFiyat.getText().equals("$29.99"));
        double ilk = Double.parseDouble(backPackUrunFiyat.getText().substring(1));
        System.out.println("ilk: "+ilk);
        System.out.println("flag ilk urun");
        return ilk;
    }

    @Then("ilk urun fiyatlari toplami kontrol")
    public void ilkUrunFiyatlariToplamiKontrol() {
        Assert.assertEquals(ilkurunfiyatitoplam(), saucedemototalılkurun());
        System.out.println("tek urunlu esitlik sağlandi");
        System.out.println("ilkurunfiyatitoplam: "+ilkurunfiyatitoplam()+" = "+"saucedemototalılkurun: "+saucedemototalılkurun());
    }


}
