package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
    public void besUrunFiyatiniAl() {
        double besUrunToplam = ilkurunfiyatinial()+ikinciurunfiyatinial()+ucuncuurunfiyatinial()+dorduncuurunfiyatinial()+besinciurunfiyatinial();
        System.out.println("bes urun toplami: "+besUrunToplam);
    }
}
