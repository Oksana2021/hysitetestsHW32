package stepdefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import steps.CareerPageSteps;
import steps.MainPageSteps;
import steps.ContactPageSteps;

public class SendContactRequestDef {

    @Steps
    ContactPageSteps contactPageSteps;



    @Given("^I go to  https://www\\.hys-enterprise\\.com/$")
    public void i_go_to_https_www_hys_enterprise_com() {
        contactPageSteps.openMainPage();
    }


    @Given("^I click on ‘Contact us’  button\\.$")
    public void i_click_on_Contact_us_button() {
       contactPageSteps.clickOnContactUs();
    }

    @Given("^on the opened page I find  ‘You Full Name’ field and enter there  ‘Full Name’ value\\.$")
    public void on_the_opened_page_I_find_You_Full_Name_field_and_enter_there_Full_Name_value() {
        contactPageSteps.enterFullName();

    }

    @Given("^I find  ‘You Email’ field and enter there  ‘_____@hys-enterprise\\.com’ value\\.$")
    public void i_find_You_Email_field_and_enter_there_______hys_enterprise_com_value() {
        contactPageSteps.enterYourEmail();

    }

    @Given("^I find  ‘Your Phone Number’ field and enter there  ‘(\\d+)’ value\\.$")
    public void i_find_Your_Phone_Number_field_and_enter_there_value(int arg1) {
        contactPageSteps.enterYourPhone();

    }

    @Given("^I find  ‘Your Country’ field and enter there  ‘Country’ value\\.$")
    public void i_find_Your_Country_field_and_enter_there_Country_value() {
        contactPageSteps.findYourCountry();
    }

    @Given("^I find  ‘Message’ field and enter there  ‘Message’ value\\.$")
    public void i_find_Message_field_and_enter_there_Message_value() {
        contactPageSteps.enterMessage();

    }


    @Given("^I mark all necessary check-boxes\\.$")
    public void i_mark_all_necessary_check_boxes() throws InterruptedException  {
        Thread.sleep(1000);
        contactPageSteps.checkBoxes();

    }

    @When("^I click on ‘Send’ button$")
    public void i_click_on_Send_button() {
        contactPageSteps.sendButton();

    }

    @Then("^confirmation  message ‘Thank you for contacting us! Our team will respond to your request shortly!’ is displayed\\.$")
    public void confirmation_message_Thank_you_for_contacting_us_Our_team_will_respond_to_your_request_shortly_is_displayed() throws InterruptedException {
        Thread.sleep(1000);
        contactPageSteps.checkMessage();}

}



