@Securepay
Feature: Securepay technical challenge

  @TEST001
  Scenario Outline: Search for secure pay website in google and Fill the secure pay contact form.
    Given I open google
    When I enter search text <securepay searchterm>
    And I click search button
    And  I click the <securepay website> from search results
    And I click on contact us link
    Then the contact us page should be loaded
    And I enter random data into the contact form

    Examples:
      | securepay website             | securepay searchterm |
      | https://www.securepay.com.au/ | securepay            |