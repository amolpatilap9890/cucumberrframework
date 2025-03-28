package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (name = "user_name")
    WebElement userid;

    @FindBy (name = "user_password")
    WebElement password;

    @FindBy (name = "Login")
    WebElement login;

    @FindBy (xpath = "//*[contains(text(),'You must specify a valid username and password.')]")
    WebElement errormsg;


    public void login (String uid, String pwd)
    {
        userid.sendKeys(uid);
        password.sendKeys(pwd);
        login.click();
    }

    public void verifyErrorMsg ()
    {
        errormsg.isDisplayed();
    }


}

