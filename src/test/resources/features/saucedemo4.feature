@milestone_4
Feature: saucedemo uc urun sec

  @milestone_4_1
  Scenario: giris ekranina git siteye gir
    Given site giris sayfasina git
    And gecerli ad gir
    And gecerli sifre gir
    Then siteye gir

  @milestone_4_2
  Scenario: urunleri sec
    Given ilkUrunFiyatiniSec
    And ikinciUrunFiyatiniSec
    And ucuncuUrunFiyatiniSec
    When sepete git
    Then uc urun secili mi kontrol et

  @milestone_4_3
  Scenario: checkout yap
    Given checkout butonuna bas
    When cikan ekranda input first name gir
    And input last name gir
    And postal code gir
    Then continue de

  @milestone_4_4
  Scenario: urunlerin fiyatlarini al
    Given ilkUrunFiyatiniAl
    And ikinciUrunFiyatiniAl
    And ucuncuUrunFiyatiniAl

  @milestone_4_5
  Scenario: price total control yap
    Given uc urun fiyatini al
    When saucedemoTotalUcUrun
    Then uc urun fiyatlari toplami kontrol