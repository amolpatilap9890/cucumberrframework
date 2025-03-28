package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage extends HeaderPage{

    public LeadPage (WebDriver driver)
    {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (name = "lastname")
    WebElement lname;

    @FindBy (name = "company")
    WebElement comp;

    @FindBy (name = "button")
    WebElement save;

    public void createlead (String txt_lname, String txt_comp)
    {
        lname.sendKeys(txt_lname);
        comp.sendKeys(txt_comp);
        save.click();
    }

    public void verifycreatelead (String txt_lname, String txt_comp)
    {
        driver.findElement(By.xpath("//td[text()='Last Name:']/following::td[1][text()='"+txt_lname+"']")).isDisplayed();
        driver.findElement(By.xpath("//td[text()='Company:']/following::td[1][text()='"+txt_comp+"']")).isDisplayed();
    }
}
