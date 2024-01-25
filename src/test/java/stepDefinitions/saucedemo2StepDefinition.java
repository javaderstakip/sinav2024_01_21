package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class saucedemo2StepDefinition extends BaseTest {
    @Given("ilkUrunFiyatiniAl")
    public double ilkurunfiyatinial() {
        WebElement backPackUrunFiyat = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]"));
        System.out.println(backPackUrunFiyat.getText());
        System.out.println("neden!!! : "+backPackUrunFiyat.getText().equals("$29.99"));
        double ilk = Double.parseDouble(backPackUrunFiyat.getText().substring(1));
        System.out.println("ilk: "+ilk);
        System.out.println("flag ilk urun");
        return ilk;
    }
    @And("ikinciUrunFiyatiniAl")
    public double ikinciurunfiyatinial() {
        WebElement bikeLightUrunFiyat = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[2]"));
        System.out.println(bikeLightUrunFiyat.getText());
        System.out.println(bikeLightUrunFiyat.getText().equals("$9.99"));
        double ikinci = Double.parseDouble(bikeLightUrunFiyat.getText().substring(1));
        System.out.println("ikinci: "+ikinci);
        return ikinci;
    }
    @And("ucuncuUrunFiyatiniAl")
    public double ucuncuurunfiyatinial() {
        WebElement boltTShirtUrunEkliFiyat = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[3]"));
        System.out.println(boltTShirtUrunEkliFiyat.getText());
        System.out.println(boltTShirtUrunEkliFiyat.getText().equals("$15.99"));
        double ucuncu = Double.parseDouble(boltTShirtUrunEkliFiyat.getText().substring(1));
        System.out.println("ucuncu: "+ucuncu);
        return ucuncu;
    }
    @And("dorduncuUrunFiyatiniAl")
    public double dorduncuurunfiyatinial() {
        WebElement fleeceJacketUrunFiyat = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[4]"));
        System.out.println(fleeceJacketUrunFiyat.getText());
        System.out.println(fleeceJacketUrunFiyat.getText().equals("$49.99"));
        double dorduncu = Double.parseDouble(fleeceJacketUrunFiyat.getText().substring(1));
        System.out.println("ucuncu: "+dorduncu);
        return dorduncu;
    }
    @And("besinciUrunFiyatiniAl")
    public double besinciurunfiyatinial() {
        WebElement onesieUrunFiyat = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[5]"));
        System.out.println(onesieUrunFiyat.getText());
        System.out.println(onesieUrunFiyat.getText().equals("$7.99"));
        double besinci = Double.parseDouble(onesieUrunFiyat.getText().substring(1));
        System.out.println("besinci: "+besinci);
        return besinci;
    }
    @And("altinciUrunFiyatiniAl")
    public double altinciurunfiyatinial() {
        WebElement tShirtRedUrunFiyat = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[6]"));
        System.out.println(tShirtRedUrunFiyat.getText());
        System.out.println(tShirtRedUrunFiyat.getText().equals("$15.99"));
        double altinci = Double.parseDouble(tShirtRedUrunFiyat.getText().substring(1));
        System.out.println("altinci: "+altinci);
        return altinci;
    }
    @Given("ilkUrunFiyatiniSec")
    public void ilkurunfiyatinisec() {
        WebElement backPackUrun = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        backPackUrun.click();
    }

    @And("ikinciUrunFiyatiniSec")
    public void ikinciurunfiyatinisec() {
        WebElement bikeLightUrun = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
        bikeLightUrun.click();
    }

    @And("ucuncuUrunFiyatiniSec")
    public void ucuncuurunfiyatinisec() {
        WebElement boltTShirtUrun = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        boltTShirtUrun.click();
    }

    @And("dorduncuUrunFiyatiniSec")
    public void dorduncuurunfiyatinisec() {
        WebElement fleeceJacketUrun = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']"));
        fleeceJacketUrun.click();
    }

    @And("besinciUrunFiyatiniSec")
    public void besinciurunfiyatinisec() {
        WebElement onesieUrun = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
        onesieUrun.click();
    }

    @And("altinciUrunFiyatiniSec")
    public void altinciurunfiyatinisec() {
        WebElement tShirtRedUrun = driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));
        tShirtRedUrun.click();
    }

    @Given("bes urun fiyatini al")
    public double besUrunFiyatiniAl() {
        double besUrunToplam = ilkurunfiyatinial()+ikinciurunfiyatinial()+ucuncuurunfiyatinial()+dorduncuurunfiyatinial()+besinciurunfiyatinial();
        System.out.println("bes urun toplami: "+besUrunToplam);
        return besUrunToplam;
    }
    @Given("dort urun fiyatini al")
    public double dortUrunFiyatiniAl() {
        double dortUrunToplam = ilkurunfiyatinial()+ikinciurunfiyatinial()+ucuncuurunfiyatinial()+dorduncuurunfiyatinial();
        System.out.println("dort urun toplami: "+dortUrunToplam);
        return dortUrunToplam;
    }
    @Given("uc urun fiyatini al")
    public double ucUrunFiyatiniAl() {
        double ucUrunToplam = ilkurunfiyatinial()+ikinciurunfiyatinial()+ucuncuurunfiyatinial();
        System.out.println("uc urun toplami: "+ucUrunToplam);
        return ucUrunToplam;
    }
    @Given("iki urun fiyatini al")
    public double ikiUrunFiyatiniAl() {
        double ikiUrunToplam = ilkurunfiyatinial()+ikinciurunfiyatinial();
        System.out.println("iki urun toplami: "+ikiUrunToplam);
        return ikiUrunToplam;
    }

    @When("saucedemoTotal")
    public double saucedemototal() {
        WebElement priceTotal = driver.findElement(By.xpath("(//div[contains(text(),'$')])[6]"));
        System.out.println("ne yaziyor acaba: "+priceTotal.getText());
        System.out.println(priceTotal.getText().substring(13));
        double saucedemotoplam = Double.parseDouble(priceTotal.getText().substring(13));
        System.out.println("bu niye boyle: "+saucedemotoplam);
        return saucedemotoplam;
    }
    @When("saucedemoTotalDortUrun")
    public double saucedemototaldorturun() {
        WebElement priceTotal = driver.findElement(By.xpath("(//div[contains(text(),'$')])[5]"));
        System.out.println("ne yaziyor acaba: "+priceTotal.getText());
        System.out.println(priceTotal.getText().substring(13));
        double saucedemotoplam = Double.parseDouble(priceTotal.getText().substring(13));
        double yuvarlanan_sayi = (double) Math.round(saucedemotoplam * 100) / 100;
        System.out.println("bu niye boyle: "+yuvarlanan_sayi);
        return saucedemotoplam;
    }
    @When("saucedemoTotalUcUrun")
    public double saucedemototalucurun() {
        WebElement priceTotal = driver.findElement(By.xpath("(//div[contains(text(),'$')])[4]"));
        System.out.println("ne yaziyor acaba: "+priceTotal.getText());
        System.out.println("önündeki yazılar gidince, sadece sayi: "+priceTotal.getText().substring(13));
        double saucedemotoplam = Double.parseDouble(priceTotal.getText().substring(13));
        double yuvarlanan_sayi = (double) Math.round(saucedemotoplam * 100) / 100;
        System.out.println("yuvarlaninca: "+yuvarlanan_sayi);
        return yuvarlanan_sayi;
    }
    @When("saucedemoTotalikiUrun")
    public double saucedemototalikiurun() {
        WebElement priceTotal = driver.findElement(By.xpath("(//div[contains(text(),'$')])[3]"));
        System.out.println("ne yaziyor acaba: "+priceTotal.getText());
        System.out.println("önündeki yazılar gidince, sadece sayi: "+priceTotal.getText().substring(13));
        double saucedemotoplam = Double.parseDouble(priceTotal.getText().substring(13));
        double yuvarlanan_sayi = (double) Math.round(saucedemotoplam * 100) / 100;
        System.out.println("yuvarlaninca: "+yuvarlanan_sayi);
        return yuvarlanan_sayi;
    }

    @Then("bes urun fiyatlari toplami kontrol")
    public void besUrunFiyatlariToplamiKontrol() {

        Assert.assertEquals(besUrunFiyatiniAl(),saucedemototal());
        System.out.println("bes urunlu eşitlik sağlandı");
    }

    @Then("dort urun fiyatlari toplami kontrol")
    public void dortUrunFiyatlariToplamiKontrol() {
        Assert.assertEquals(dortUrunFiyatiniAl(),saucedemototaldorturun());
        System.out.println("dort urunlu eşitlik sağlandı");
    }
    @Then("uc urun fiyatlari toplami kontrol")
    public void ucUrunFiyatlariToplamiKontrol() {
        Assert.assertEquals(ucUrunFiyatiniAl(), saucedemototalucurun());
        System.out.println("uc urunlu eşitlik sağlandı");
    }
    @Then("iki urun fiyatlari toplami kontrol")
    public void ikiUrunFiyatlariToplamiKontrol() {
        Assert.assertEquals(ikiUrunFiyatiniAl(),saucedemototalikiurun());
        System.out.println("iki urunlu eşitlik sağlandı");
    }

    @Then("dort urun secili mi kontrol et")
    public void dortUrunSeciliMiKontrolEt() {
        WebElement backPackUrunEkli = driver.findElement(By.xpath("//*[@id='item_4_title_link']/div"));
        backPackUrunEkli.isDisplayed();
        WebElement bikeLightUrunEkli = driver.findElement(By.xpath("//*[@id='item_0_title_link']/div"));
        bikeLightUrunEkli.isDisplayed();
        WebElement boltTShirtUrunEkli = driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div"));
        boltTShirtUrunEkli.isDisplayed();
        WebElement fleeceJacketUrunEkli = driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div"));
        fleeceJacketUrunEkli.isDisplayed();
        System.out.println("dort urun de secili");
//        WebElement onesieUrunEkli = driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div"));
//        onesieUrunEkli.isDisplayed();
//        WebElement tShirtRedUrunEkli = driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div"));
//        tShirtRedUrunEkli.isDisplayed();
//        System.out.println("nasil oluyor : "+tShirtRedUrunEkli.isDisplayed());
//        System.out.println("hi");
    }

    @Then("uc urun secili mi kontrol et")
    public void ucUrunSeciliMiKontrolEt() {
        WebElement backPackUrunEkli = driver.findElement(By.xpath("//*[@id='item_4_title_link']/div"));
        backPackUrunEkli.isDisplayed();
        WebElement bikeLightUrunEkli = driver.findElement(By.xpath("//*[@id='item_0_title_link']/div"));
        bikeLightUrunEkli.isDisplayed();
        WebElement boltTShirtUrunEkli = driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div"));
        boltTShirtUrunEkli.isDisplayed();
//        WebElement fleeceJacketUrunEkli = driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div"));
//        fleeceJacketUrunEkli.isDisplayed();
        System.out.println("uc urun de secili");
    }
    @Then("iki urun secili mi kontrol et")
    public void ikiUrunSeciliMiKontrolEt() {
        WebElement backPackUrunEkli = driver.findElement(By.xpath("//*[@id='item_4_title_link']/div"));
        backPackUrunEkli.isDisplayed();
        WebElement bikeLightUrunEkli = driver.findElement(By.xpath("//*[@id='item_0_title_link']/div"));
        bikeLightUrunEkli.isDisplayed();
        System.out.println("iki urun de secili");
    }
}
