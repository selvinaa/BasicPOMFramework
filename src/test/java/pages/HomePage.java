package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtils;

public class HomePage extends TestBase {
    public HomePage(){
        PageFactory.initElements(driver, this);// SAME AS THIS   == THIS

    }
    @FindBy(id= "btnLogin")
    public WebElement login_Btn;

    public void navigateToHomePage(){
        SeleniumUtils.click(login_Btn);
    }



}
