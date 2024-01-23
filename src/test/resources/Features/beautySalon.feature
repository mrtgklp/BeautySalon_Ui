@Ui
  Feature:US_01 Kullanıcı Yorum Yapar Ve Puan Verebilmeli
    Scenario: TC_01 Kullanıcı Google Güzellik Salonu Aratabilmeli ve Yorum Yapabilmeli
      Given Kullanıcı Google Ana Sayfasına Gider

      Then Kullanıcı Arama Kısmında Güzellikli Salonu Aratır
      And Kullanıcı Güzellik Salonu Yorum Kısmına Gider
      And Kullanıcı Yorum Yazabilir ve Görüntüleyebilmeli
      And Kullanıcı 1 ile 5 arasında bir puan verebilmeli
      And Kullanıc Sayfayı Kapatır