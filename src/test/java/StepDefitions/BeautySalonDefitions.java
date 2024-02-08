package StepDefitions;

import Pages.BeautySalonuPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.math3.random.RandomAdaptor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class BeautySalonDefitions {

    BeautySalonuPage beautySalonuPage = new BeautySalonuPage();
    Faker faker = new Faker();


    @Given("Kullanıcı Google Ana Sayfasına Gider")
    public void kullanıcı_google_ana_sayfasına_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("beauty_url"));
    }
    @Then("Kullanıcı Arama Kısmında Güzellikli Salonu Aratır")
    public void kullanıcı_arama_kısmında_güzellikli_salonu_aratır() {
        beautySalonuPage.aramabotunu.sendKeys(ConfigReader.getProperty("beautySalonName"),Keys.ENTER);
    }
    @Then("Kullanıcı Güzellik Salonu Yorum Kısmına Gider")
    public void kullanıcı_güzellik_salonu_yorum_kısmına_gider() {
        //beautySalonuPage.yorumTıkla.click();
        //Driver.bekle(5);
        //ReusableMethods.tumSayfaResmi();

    }



    @Then("Googleda Oturum Aç")
    public void googledaOturumAc() {
       beautySalonuPage.oturumuAç.click();
       Driver.bekle(4);
    }

    @Then("Googleda Hesap Oluştur")
    public void googledaHesapOlustur() {
        beautySalonuPage.hesapOluştur.click();
    }


    @And("Kendim için Kullanılacak Hesap")
    public void kendimIcinKullanılacakHesap() {
        beautySalonuPage.kendimİçinEmail.click();
    }


    @And("Kullanıcı Hesap Oluşturma {string} Gir")
    public void kullanıcıHesapOlusturmaGir(String name) {
        name =faker.name().firstName();
        beautySalonuPage.isimGir.sendKeys(name,Keys.TAB);
    }

    @And("Kullanıcı Hesap Oluşturma {string} Girer")
    public void kullanıcıHesapOlusturmaGirer(String lastName) {
        lastName = faker.name().lastName();
        beautySalonuPage.soyadıGir.sendKeys(lastName,Keys.ENTER);

    }

    @And("Kullanıcı Hesap Oluşturma Dogum Tarihini <{string}> Gir")
    public void kullanıcıHesapOlusturmaDogumTarihiniGir(String gun) {
       gun = String.valueOf(faker.number().numberBetween(1,31));
        beautySalonuPage.gün.sendKeys(gun,Keys.TAB);
    }


    @And("Kullanıcı Hesap Oluşturma Dogum Tarihi <{string}> Gir")
    public void kullanıcıHesapOlusturmaDogumTarihiGir(String ay) {
        ay = String.valueOf(faker.date().birthday().getMonth());
        Select selectAy = new Select(beautySalonuPage.ay);
        selectAy.selectByValue(ay);
    }

    @And("Kullanıcı Hesap Oluşturma Dogum Tarihi <{string}> Girer")
    public void kullanıcıHesapOlusturmaDogumTarihiGirer(String yıl) {

        beautySalonuPage.yıl.sendKeys("1989",Keys.TAB);
        Driver.bekle(5);
        ReusableMethods.tumSayfaResmi();
    }
    @And("Kullanıcı Hesap Oluşturmada Cinsiyetini Tercih Eder")
    public void kullanıcıHesapOlusturmadaCinsiyetiniTercihEder() {
        Select gender = new Select(beautySalonuPage.cinsiyet);
        gender.selectByIndex(1);
    }

    @Then("Kullanıcı Hesap Oluştururken Bir Sonra ki Adım Gec")
    public void kullanıcı_hesap_oluştururken_bir_sonra_ki_adım_gec() {
        beautySalonuPage.sonra.click();
    }

    @And("Kullanıcı Hesap Olustururken Email Tercih Eder")
    public void kullanıcıHesapOlustururkenEmailTercihEder() {
        Driver.bekle(4);
        beautySalonuPage.emailTercihi.click();
        Driver.bekle(4);
        ReusableMethods.tumSayfaResmi();
    }

    @And("Kullanıcı Hesap olusturuken İleri Devam Eder")
    public void kullanıcıHesapOlusturukenIleriDevamEder() {
        beautySalonuPage.emailıleri.click();
    }

    @And("Kullanıcı Hesap Olusturuken Password Girer")
    public void kullanıcıHesapOlusturukenPasswordGirer() {
        beautySalonuPage.password.sendKeys(ConfigReader.getProperty("password"),Keys.TAB);
    }

    @And("Kullanıcı Hesap Olustururken Password Tekrar Eder")
    public void kullanıcıHesapOlustururkenPasswordTekrarEder() {
        beautySalonuPage.paswOnayla.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("Kullanıcı Hesap Olusturuken Password Olusturur")
    public void kullanıcıHesapOlusturukenPasswordOlusturur() {
        beautySalonuPage.passwOlustur.click();
        Driver.bekle(5);
        ReusableMethods.tumSayfaResmi();
    }
    @Then("Kullanıc Sayfayı Kapatır")
    public void kullanıc_sayfayı_kapatır() {
        Driver.closeDriver();
    }
}
