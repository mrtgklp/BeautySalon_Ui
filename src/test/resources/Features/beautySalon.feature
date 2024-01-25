@UA1
  Feature:US_01 Kullanıcı Yorum Yapar Ve Puan Verebilmeli
    Scenario: TC_01 Kullanıcı Google Güzellik Salonu Aratabilmeli ve Yorum Yapabilmeli
      Given Kullanıcı Google Ana Sayfasına Gider
      Then Kullanıcı Arama Kısmında Güzellikli Salonu Aratır
      And Kullanıcı Güzellik Salonu Yorum Kısmına Gider
      Then Googleda Oturum Aç
      And  Googleda Hesap Oluştur
      And Kendim için Kullanılacak Hesap
      And Kullanıcı Hesap Oluşturma "<Name>" Gir
      And Kullanıcı Hesap Oluşturma "<SoyAdı>" Girer
      And Kullanıcı Hesap Oluşturma Dogum Tarihini <"Gün"> Gir
      And Kullanıcı Hesap Oluşturma Dogum Tarihi <"Ay"> Gir
      And Kullanıcı Hesap Oluşturma Dogum Tarihi <"Yıl"> Girer
      And Kullanıcı Hesap Oluşturmada Cinsiyetini Tercih Eder
      And Kullanıcı Hesap Oluştururken Bir Sonra ki Adım Gec
      And Kullanıcı Hesap Olustururken Email Tercih Eder
      And Kullanıcı Hesap olusturuken İleri Devam Eder
      And Kullanıcı Hesap Olusturuken Password Girer
      And Kullanıcı Hesap Olustururken Password Tekrar Eder
      And Kullanıcı Hesap Olusturuken Password Olusturur
      And Kullanıcı Yorum Yazabilir ve Görüntüleyebilmeli
      And Kullanıcı 1 ile 5 arasında bir puan verebilmeli
      And Kullanıc Sayfayı Kapatır