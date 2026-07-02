package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.List;

public class leadsteps extends basesteps{


    @When("user fill the last name and company, designation and click on save button")
    public void fill_data()
    {
    ldp.createlead("Patil" , "TCS", "SME");
    }

    @Then("user click on new lead link")
    public void new_lead()
    {
        ldp.clickNewLead();
    }

    @Then("lead should be created and validated successfully")
    public void validate_lead()
    {
        driver.findElement(By.xpath("//td[text()='Last Name:']/following::td[1][text()='Patil']")).isDisplayed();
        driver.findElement(By.xpath("//td[text()='Company:']/following::td[1][text()='TCS']")).isDisplayed();
    }

    @When("user need to create multiple leads and validate based on dataset")
    public void user_need_to_create_multiple_leads_and_validate_based_on_dataset(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> ls =dataTable.asLists();
        for (int i = 0; i<ls.size(); i++)
        {
            ldp.clickNewLead();
            ldp.createlead(ls.get(i).get(0),ls.get(i).get(1),ls.get(i).get(2));
            ldp.verifycreatelead(ls.get(i).get(0),ls.get(i).get(1),ls.get(i).get(2));
            ldp.verifycreatelead(ls.get(i).get(0),ls.get(i).get(1),ls.get(i).get(2));

        }
    }

    @Then("user will open leads page")
    public void user_will_open_leads_page() {
        ldp.clickleads();
    }

    @Then("user will delete the entered data")
    public void user_will_delete_the_entered_data()
    {
        ldp.search("TCS");
        ldp.srcclick();
        ldp.selectbox();
        ldp.entrydelete();
    }

    @Then("user will log out")
    public void logout()
    {
        hp.clicklogout();
    }

//    @Then("close browser")
//    public void quite()
//    {
//        driver.quit();
//    }
}
