package StepDefinitions;

import Pages.LeadPage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginsteps extends basesteps{



    @Given("user should be on log in page")
    public void login_page()
    {
        driver = new ChromeDriver();
        driver.get("http://localhost:100");
        driver.manage().window().maximize();
        lp = new LoginPage(driver);
        ldp = new LeadPage(driver);
    }

    @When("user enters valid credentials and click on log in button")
    public void valid_credentials_and_click_on_log_in_button() {
       lp.login("admin", "admin");
    }

    @Then("user navigated to home page")
    public void home() {
        ldp.verifyHome();
    }

    @Then("user can see log out link")
    public void log_out_link() {
       ldp.verifyLogout();
    }

    @Then("close browser")
    public void close_browser() {
       driver.quit();
    }

    @When("user enters invalid credentials and click on log in button")
    public void invalid_login() {
       lp.login("admin123" , "admin123");
    }

    @Then("user can see error message")
    public void verifyerrormessage() {
        lp.verifyErrorMsg();
    }

    @When("user enters invalid credentials user name as {string} and password as {string} and click on log in button")
    public void user_enters_invalid_credentials_user_name_as_and_password_as_and_click_on_log_in_button(String uid, String pwd) {
        lp.login(uid,pwd);
    }
}
