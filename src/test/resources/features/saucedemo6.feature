@milestone_6
Feature: saucedemo iki urun sec

  @milestone_6_1
  Scenario: giris ekranina git siteye gir
    Given site giris sayfasina git
    And gecerli ad gir
    And gecerli sifre gir
    Then siteye gir

  @milestone_6_2
  Scenario: urunleri sec
    Given ilkUrunFiyatiniSec
    When sepete git
    Then ilk urun secili mi kontrol et

  @milestone_6_3
  Scenario: checkout yap
    Given checkout butonuna bas
    When cikan ekranda input first name gir
    And input last name gir
    And postal code gir
    Then continue de

  @milestone_6_4
  Scenario: urunlerin fiyatlarini al
    Given ilkUrunFiyatiniAl

  @milestone_6_5
  Scenario: price total control yap
    Given ilkUrunFiyatiToplam
    When saucedemoTotalIlkUrun
    Then ilk urun fiyatlari toplami kontrol