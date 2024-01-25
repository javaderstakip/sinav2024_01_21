@milestone_5
Feature: saucedemo iki urun sec

  @milestone_5_1
  Scenario: giris ekranina git siteye gir
    Given site giris sayfasina git
    And gecerli ad gir
    And gecerli sifre gir
    Then siteye gir

  @milestone_5_2
  Scenario: urunleri sec
    Given ilkUrunFiyatiniSec
    And ikinciUrunFiyatiniSec
    When sepete git
    Then iki urun secili mi kontrol et

  @milestone_5_3
  Scenario: checkout yap
    Given checkout butonuna bas
    When cikan ekranda input first name gir
    And input last name gir
    And postal code gir
    Then continue de

  @milestone_5_4
  Scenario: urunlerin fiyatlarini al
    Given ilkUrunFiyatiniAl
    And ikinciUrunFiyatiniAl

  @milestone_5_5
  Scenario: price total control yap
    Given iki urun fiyatini al
    When saucedemoTotalikiUrun
    Then iki urun fiyatlari toplami kontrol