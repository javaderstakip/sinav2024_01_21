@milestone_1
Feature: saucedemo sitesini test et

  @milestone_1_2
  Scenario: giris ekranina git siteye gir
    Given site giris sayfasina git
    And gecerli ad gir
    And gecerli sifre gir
    Then siteye gir

  @milestone_1_3
  Scenario: urunlerin tamamini sec, hepsi secili mi kontrol et
    Given ürünleri sec
    When sepete git
    Then butun urunler secili mi kontrol et

  @milestone_1_4
  Scenario: checkout yap
    Given checkout butonuna bas
    When cikan ekranda input first name gir
    And input last name gir
    And postal code gir
    Then continue de

  @milestone_1_5
  Scenario: price total control yap
    Given urun fiyatlarini al
    And urun fiyatlarini topla
    Then fiyatlari kontrol et