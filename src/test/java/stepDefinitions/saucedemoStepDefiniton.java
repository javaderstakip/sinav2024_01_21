package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class saucedemoStepDefiniton extends BaseTest {
    @Given("site giris sayfasina git")
    public void siteGirisSayfasinaGit() {
        driver.get("https://www.saucedemo.com/");
    }

    @And("gecerli ad gir")
    public void gecerliAdGir() {
        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");
    }

    @And("gecerli sifre gir")
    public void gecerliSifreGir() {
        WebElement userPassWord = driver.findElement(By.xpath("//input[@id='password']"));
        userPassWord.sendKeys("secret_sauce");
    }

    @Then("siteye gir")
    public void siteyeGir() {
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();
    }

    @Given("ürünleri sec")
    public void ürünleriSec() {
        WebElement backPackUrun = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        backPackUrun.click();
        WebElement bikeLightUrun = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
        bikeLightUrun.click();
        WebElement boltTShirtUrun = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        boltTShirtUrun.click();
        WebElement fleeceJacketUrun = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']"));
        fleeceJacketUrun.click();
        WebElement onesieUrun = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
        onesieUrun.click();
        WebElement tShirtRedUrun = driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));
        tShirtRedUrun.click();
    }

    @When("sepete git")
    public void sepeteGit() {
        WebElement sepetButton = driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        sepetButton.click();
    }

    @Then("butun urunler secili mi kontrol et")
    public void butunUrunlerSeciliMiKontrolEt() {
        WebElement backPackUrunEkli = driver.findElement(By.xpath("//*[@id='item_4_title_link']/div"));
        backPackUrunEkli.isDisplayed();
        WebElement bikeLightUrunEkli = driver.findElement(By.xpath("//*[@id='item_0_title_link']/div"));
        bikeLightUrunEkli.isDisplayed();
        WebElement boltTShirtUrunEkli = driver.findElement(By.xpath("//*[@id=\"item_1_title_link\"]/div"));
        boltTShirtUrunEkli.isDisplayed();
        WebElement fleeceJacketUrunEkli = driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div"));
        fleeceJacketUrunEkli.isDisplayed();
        WebElement onesieUrunEkli = driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div"));
        onesieUrunEkli.isDisplayed();
        WebElement tShirtRedUrunEkli = driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div"));
        tShirtRedUrunEkli.isDisplayed();
        System.out.println("nasil oluyor : "+tShirtRedUrunEkli.isDisplayed());
        System.out.println("hi");
    }

    @Given("checkout butonuna bas")
    public void checkoutButonunaBas() {
        WebElement checkOutButton = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkOutButton.click();
    }

    @When("cikan ekranda input first name gir")
    public void cikanEkrandaInputFirstNameGir() {
        WebElement inputFirstName = driver.findElement(By.xpath("//input[@id='first-name']"));
        inputFirstName.sendKeys("a");
    }

    @And("input last name gir")
    public void inputLastNameGir() {
        WebElement inputLastName = driver.findElement(By.xpath("//input[@id='last-name']"));
        inputLastName.sendKeys("b");
    }

    @And("postal code gir")
    public void postalCodeGir() {
        WebElement inputPostalCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
        inputPostalCode.sendKeys("c12");
    }

    @Then("continue de")
    public void continueDe() {
        WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
        continueButton.click();
    }

    @Given("urun fiyatlarini al")
    public void urunFiyatlariniAl() {
        System.out.println("hi");
    }

    @And("urun fiyatlarini topla")
    public void urunFiyatlariniTopla() {
        System.out.println("hi");
    }

    @Then("fiyatlari kontrol et")
    public void fiyatlariKontrolEt() throws InterruptedException {
//        WebElement priceTotal = driver.findElement(By.xpath("(//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]/text()[2]"));
//        System.out.println(priceTotal.getText());
//        System.out.println(priceTotal.getText().toString());
//        System.out.println("bunun dogru olmasi lazim : "+priceTotal.getText().equals("$129.94"));
//        System.out.println(priceTotal.getText().toString().equals("$129.94"));
        System.out.println("finish!!");
        //WebElement backPackUrunFiyat = driver.findElement(By.xpath("(//div[contains(text(),'$')])[1]"));
        WebElement backPackUrunFiyat = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]"));
        System.out.println(backPackUrunFiyat.getText());
        System.out.println("neden!!! : "+backPackUrunFiyat.getText().equals("$29.99"));
        int a = Integer.parseInt(backPackUrunFiyat.getText());
        WebElement bikeLightUrunFiyat = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[2]"));
        System.out.println(bikeLightUrunFiyat.getText());
        System.out.println(bikeLightUrunFiyat.getText().equals("$9.99"));
        int b = Integer.parseInt(bikeLightUrunFiyat.getText());
        WebElement boltTShirtUrunEkliFiyat = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[3]"));
        System.out.println(boltTShirtUrunEkliFiyat.getText());
        System.out.println(boltTShirtUrunEkliFiyat.getText().equals("$15.99"));
        WebElement fleeceJacketUrunFiyat = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[4]"));
        System.out.println(fleeceJacketUrunFiyat.getText());
        System.out.println(fleeceJacketUrunFiyat.getText().equals("$49.99"));
        WebElement onesieUrunFiyat = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[5]"));
        System.out.println(onesieUrunFiyat.getText());
        System.out.println(onesieUrunFiyat.getText().equals("$7.99"));
        WebElement tShirtRedUrunFiyat = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[6]"));
        System.out.println(tShirtRedUrunFiyat.getText());
        System.out.println(tShirtRedUrunFiyat.getText().equals("$15.99"));
        int total;
        total = a+b;
        System.out.println("toplam: "+total);//bu kisim calismadi !!
        Thread.sleep(2000);
    }
}
