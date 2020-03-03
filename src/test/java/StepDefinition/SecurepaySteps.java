package StepDefinition;
import Pages.SecurepayPage;
import Pages.GooglePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class SecurepaySteps extends SecurepayPage {

    public SecurepaySteps() {
        super(BaseTest.driver);
    }

    @And("^I click on contact us link$")
    public void iClickOnContactUsLink() throws Throwable {
        SecurepayPage.CONTACT_US_LINK.click();
    }
}