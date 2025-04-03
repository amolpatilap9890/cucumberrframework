package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class accountsstep extends basesteps {

    @When("user click on accounts link")
    public void user_click_on_accounts_link()
    {
        ap.accountspage();
    }

    @Then("user can view existing entries")
    public void user_can_view_existing_entries() {
//        driver.findElement(By.xpath("//input[@type='checkbox']/following::a[1][text()='t3M Invest A/S']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    }

    @Then("user can delete existing entries")
    public void user_can_delete_existing_entries() {
        driver.findElement(By.linkText("del")).click();
    }



    //input[@name='selected_id']/following::input[@oneclick='selectall']
}
