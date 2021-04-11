package steps;

import data.RandomDataGenerator;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pages.MainPage;
import pages.MainPageReferencePopUp;

public class ContactPageSteps {

    MainPage mainPage;

    @Step
    public void openMainPage(){mainPage.open();
    }

    @Step
    public void clickOnContactUs(){ mainPage.contactUs();
    }

    @Step
    public void enterFullName(){
        mainPage.fullName.sendKeys("Oksana K");
    }

    @Step
    public void enterYourEmail(){mainPage.yourEmail.sendKeys("test@hys-enterprise.com");}

    @Step
    public void enterYourPhone(){mainPage.yourPhone.sendKeys("123456789");}

    @Step
    public void findYourCountry(){mainPage.yourCountry.sendKeys("Ukraine");}

    @Step
    public void enterMessage(){mainPage.yourMessage.sendKeys("Message"); }


    @Step
    public void checkBoxes(){
        mainPage.scrollToSendButton();
        mainPage.yourCheckBoxes.click(); }

    @Step
    public void sendButton(){mainPage.yourSendButton.click();}

    @Step
    public void checkMessage(){Assert.assertTrue(mainPage.errorMessage.isDisplayed());}}

