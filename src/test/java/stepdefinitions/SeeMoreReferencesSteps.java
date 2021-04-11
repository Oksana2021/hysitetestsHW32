package stepdefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.MainPage;

public class SeeMoreReferencesSteps {
    @Managed
    WebDriver driver;

    MainPage seeMoreReferences;
    MainPage mainPage;


    @Given("^I access  https://www\\.hys-enterprise\\.com/$")
    public void i_access_https_www_hys_enterprise_com() {
        mainPage.open();
    }


    @Given("^I Scroll down to see ‘See more references’ button\\.$")
    public void i_Scroll_down_to_see_See_more_references_button() {
        seeMoreReferences.scrollDown("2500");
    }

    @When("^I click on ‘See more references’ button\\.$")
    public void i_click_on_See_more_references_button() {
        seeMoreReferences.seeMoreReferencesbutton.click();
    }

    @Then("^references page is opened \\(https://www\\.hys-enterprise\\.com/references/\\)$")
    public void references_page_is_opened_https_www_hys_enterprise_com_references() throws InterruptedException {
        Thread.sleep(1000);
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://stage.hwr.hysdev.com/references/");
    }
}