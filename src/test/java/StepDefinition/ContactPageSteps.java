package StepDefinition;

import Utilities.RandomData;
import Pages.ContactUsPage;
import com.github.javafaker.Faker;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import java.util.Locale;
import java.util.Random;
import static junit.framework.TestCase.assertTrue;

public class ContactPageSteps extends ContactUsPage {

    public ContactPageSteps() {
        super(BaseTest.driver);
    }

    @Then("^the contact us page should be loaded$")
    public void theContactUsPageShouldBeLoaded() {
        assertTrue( CONTACT_US_HEADING.isDisplayed());
    }

    @And("^I enter random data into the contact form$")
    public void iEnterRandomDataIntoTheContactForm() throws Throwable {
        ContactUsPage.FIRST_NAME.sendKeys(RandomData.get_first_name());
        ContactUsPage.LAST_NAME.sendKeys(RandomData.get_last_name());
        ContactUsPage.EMAIL_ADDRESS.sendKeys(RandomData.get_email_address());
        ContactUsPage.PHONE_NUMBER.sendKeys(RandomData.get_phone_number());
        ContactUsPage.WEBSITE_URL.sendKeys(RandomData.get_Website_url());
        ContactUsPage.COMPANY.sendKeys(RandomData.get_company_name());
        ContactUsPage.REASON.sendKeys(RandomData.get_contact_reason());
        ContactUsPage.MESSAGE.sendKeys(RandomData.get_paragraph_message());
    }

}