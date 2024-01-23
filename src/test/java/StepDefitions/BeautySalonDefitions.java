package StepDefitions;

import Pages.BeautySalonuPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

public class BeautySalonDefitions {

    BeautySalonuPage beautySalonuPage = new BeautySalonuPage();
    Driver driver;

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
        beautySalonuPage.yorumTıkla.click();

    }
    @Then("Kullanıcı Yorum Yazabilir ve Görüntüleyebilmeli")
    public void kullanıcı_yorum_yazabilir_ve_görüntüleyebilmeli() {

    }
    @Then("Kullanıcı {int} ile {int} arasında bir puan verebilmeli")
    public void kullanıcı_ile_arasında_bir_puan_verebilmeli(Integer int1, Integer int2) {

    }
    @Then("Kullanıc Sayfayı Kapatır")
    public void kullanıc_sayfayı_kapatır() {
        //Driver.closeDriver();
    }

}
