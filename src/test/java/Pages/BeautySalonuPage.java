package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeautySalonuPage {
    public BeautySalonuPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//textarea[@name='q']")
    public WebElement aramabotunu;

    @FindBy(css = "[id='wrkpb']")
    public WebElement yorumTıkla;

    @FindBy(css = "span[class='gb_Jd']")
    public WebElement oturumuAç;

    @FindBy(css = "div[class='ZOeJnf']")
    public  WebElement hesapOluştur;


    @FindBy(xpath = "(//*[@class='G3hhxb VfPpkd-StrnGf-rymPhb-ibnC6b'])[1]")
    public WebElement kendimİçinEmail;

    @FindBy(css = "input[name='firstName']")
    public WebElement isimGir;

    @FindBy(css = "input[name='lastName']")
    public WebElement soyadıGir;

    @FindBy(css = "input[id='day']")
    public WebElement gün;

    @FindBy(css = "select[id='month']")
    public WebElement ay;

    @FindBy(css = "[id='year']")
    public WebElement yıl;

    @FindBy(css = "select[id='gender']")
    public WebElement cinsiyet;

    @FindBy(css = "[id='birthdaygenderNext']")
    public WebElement sonra;

    @FindBy(xpath = "(//*[@class='SCWude'])[1]")
    public WebElement emailTercihi;

    @FindBy(css = "div[id='next']")
    public WebElement emailıleri;

    @FindBy(css = "input[name='Passwd']")
    public WebElement password;

    @FindBy(css = "input[name='PasswdAgain']")
    public WebElement paswOnayla;

    @FindBy(css = "div[id='createpasswordNext']")
    public  WebElement passwOlustur;





}
