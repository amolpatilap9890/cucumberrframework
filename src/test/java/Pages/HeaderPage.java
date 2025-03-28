package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HeaderPage {

    public WebDriver driver;

    public HeaderPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Home")
    WebElement lnk_home;

    @FindBy (linkText = "Logout")
    WebElement lnk_logout;

    @FindBy (linkText = "New Lead")
    WebElement lnk_NewLead;

    @FindBy (linkText = "Leads")
    WebElement lnk_Leads;


    public void verifyHome()
    {
        lnk_home.isDisplayed();
    }

    public void verifyLogout()
    {
        lnk_logout.isDisplayed();
    }

    public void clicklogout()
    {
        lnk_logout.click();
    }

    public void clickNewLead()
    {
        lnk_NewLead.click();
    }

    public void clickleads()
    {
        lnk_Leads.click();
    }

}
