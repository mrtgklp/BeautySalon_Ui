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


}
