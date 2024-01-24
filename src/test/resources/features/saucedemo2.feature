@milestone_2
Feature: saucedemo 5 urun sec
  @milestone_2_1
  Scenario: giris ekranina git siteye gir
    Given site giris sayfasina git
    And gecerli ad gir
    And gecerli sifre gir
    Then siteye gir

  @milestone_2_2
  Scenario: urunleri sec
    Given ilkUrunFiyatiniSec
    And ikinciUrunFiyatiniSec
    And ucuncuUrunFiyatiniSec
    And dorduncuUrunFiyatiniSec
    And besinciUrunFiyatiniSec
    When sepete git
    Then bes urun secili mi kontrol et

  @milestone_2_3
  Scenario: checkout yap
    Given checkout butonuna bas
    When cikan ekranda input first name gir
    And input last name gir
    And postal code gir
    Then continue de

  @milestone_2_4
  Scenario: urunlerin fiyatlarini al
    Given ilkUrunFiyatiniAl
    And ikinciUrunFiyatiniAl
    And ucuncuUrunFiyatiniAl
    And dorduncuUrunFiyatiniAl
    And besinciUrunFiyatiniAl

  @milestone_2_5
  Scenario: price total control yap
    Given bes urun fiyatini al
    And bes urun fiyatlarini topla
    Then bes urun fiyatlari toplamini kontrol et

