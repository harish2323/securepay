package StepDefinition;

import Pages.GooglePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class GoogleSteps extends GooglePage {

    public GoogleSteps() {
        super(BaseTest.driver);
    }

    @Given("^I open google$")
    public void iOpenGoogle() throws Throwable {
        BaseTest.driver.get("https://www.google.com.au");
    }

    @And("^I enter search text (.*?)$")
    public void iEnterSearchText(String search_term) throws Throwable {
        GooglePage.GOOGLE_SEARCH_TEXT_BOX.sendKeys(search_term);
        Thread.sleep(2000);
    }

    @And("^I click search button$")
    public void iClickSearchButton() {
        GooglePage.GOOGLE_SEARCH_BUTTON.click();
    }

    @And("^I click the (.*?) from search results$")
    public void iClickSecurePayLinkFromSearchResults(String securepay_link)
    {
        GooglePage.SECUREPAY_LINK(securepay_link).click();
    }
}
