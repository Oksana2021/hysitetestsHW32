package pages;

        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;

public class MainPage extends HysBasePageObject {

    @FindBy(xpath = "//button[@data-target='#getReferenceModal']")
    public WebElement askForReferenceButton;

    @FindBy(xpath = "//*[contains(text(),\"Let's network\")]")
    public WebElement letsNetworkBlock;

    @FindBy(xpath = "/html/body/section[4]/div/div/div[3]/div/a")
    public WebElement seeMoreEventsButton;

    @FindBy(xpath = "//span[contains(text(),  'See more publications')]")
    public WebElement seeMorePublications;


    @FindBy(xpath = "//a[contains(text(),  'Contact us')]")
    public WebElement contactUs_button;

    @FindBy(xpath = "//a[contains(text(),  'About us')]")
    public WebElement aboutUs_button;

    @FindBy(xpath = "//*[@id=\"primary-menu-affix\"]/li[2]/a")
    public WebElement services_button;

    @FindBy(xpath = "//a[contains(text(),  'Software Modernization')]")
    public WebElement soft_modernization;


    @FindBy(xpath = " //a[contains(text(),  'Quality Assurance')]")
    public WebElement qiality_assurance;

    @FindBy(xpath = " //a[contains(text(),  'Software Maintenance')]")
    public WebElement software_maintenance;

    @FindBy(xpath = " //a[contains(text(),  'IT Consulting and Advising')]")
    public WebElement services_consulting;

    @FindBy(xpath = " //a[contains(text(),  'Custom Software and Product Development')]")
    public WebElement services_custom_software;

    @FindBy(xpath = " //a[contains(text(),  'Enterprise Applications')]")
    public WebElement services_enterprise;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/div/div[2]/a")
    public WebElement seeMoreReferencesbutton;


//-/-/--/-/-/-/-/--/-/-/ Contact Us /-/-/--/-/-/--/-//



    @FindBy(id = "full_name")
    public WebElement fullName;

    @FindBy(id = "email")
    public WebElement yourEmail;

    @FindBy(id = "phone")
    public WebElement yourPhone;

    @FindBy(id = "country")
    public WebElement yourCountry;

    @FindBy(id = "message")
    public WebElement yourMessage;

    @FindBy(xpath = "//*[@id=\"contact-form\"]/div/div[6]/div[2]/label/label")
    public WebElement yourCheckBoxes;

    @FindBy(id = "contact-form-submit")
    public WebElement yourSendButton;

    @FindBy(xpath = " //*[contains(text(),  'Sorry, your message has not been sent. Please, try again!')]")
    public WebElement errorMessage;

    public void scrollToSendButton(){
        scrollDown("500");
    }


    public void scrollToReferenceButton(){
        scrollDown("300");
    }

    public void scrollToLetsNetworkBlock(){
        scrollDown("300");
    }

    public void clickOnSeeMoreEvents() {
        scrollDown("300");
    }
    public void setSeeMorePublications() {
        seeMorePublications.click();
    }
    public void contactUs() {
        contactUs_button.click();
    }
    public void aboutUs () {
        aboutUs_button.click();
    }
    public void services () {
        services_button.click();
    }
    public void modernization () {
        soft_modernization.click();
    }
    public void services_qa () {
        qiality_assurance.click();
    }
    public void services_maintenance () {
        software_maintenance.click();

    }
    public void services_consulting () {
        services_consulting.click();

    }
    public void services_custom_software () {
        services_custom_software.click();

    }
    public void services_enterprise () {
        services_enterprise.click();

       }
}

