package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static StepDefinitions.basesteps.ap;

public class AccountsPage extends HeaderPage{

    public AccountsPage (WebDriver driver)
    {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (linkText = "Accounts")
    WebElement accounts;

    public void accountspage ()
    {
        accounts.click();
    }
}
