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

    @FindBy (name = "designation")
    WebElement position;

    @FindBy (name = "button")
    WebElement save;

    @FindBy (xpath = "//input[@name=\"company\"][@type=\"text\" and @size=\"10\"]")
    WebElement search;

    @FindBy (xpath = "//input[@title=\"Search [Alt+Q]\"]")
    WebElement searchclick;

    @FindBy (xpath = "//input[@type=\"checkbox\"][@name=\"selectall\"]")
    WebElement checkbox;

    @FindBy (xpath = "//input[@value=\"Delete\"]")
    WebElement delete;

    public void createlead (String txt_lname, String txt_comp, String txt_position)
    {
        lname.sendKeys(txt_lname);
        comp.sendKeys(txt_comp);
        position.sendKeys(txt_position);
        save.click();
    }

    public void verifycreatelead (String txt_lname, String txt_comp, String txt_position)
    {
        driver.findElement(By.xpath("//td[text()='Last Name:']/following::td[1][text()='"+txt_lname+"']")).isDisplayed();
        driver.findElement(By.xpath("//td[text()='Company:']/following::td[1][text()='"+txt_comp+"']")).isDisplayed();
        driver.findElement(By.xpath("//td[text()='Designation:']/following::td[1][text()='"+txt_position+"']")).isDisplayed();
    }

    public void search (String txt_comp)
    {
        search.sendKeys(txt_comp);
    }

    public void srcclick()
    {
        searchclick.click();
    }

    public void selectbox()
    {
        checkbox.click();
    }

    public void entrydelete()
    {
        delete.click();
    }

}
