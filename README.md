# securepay

Backbase Automation

Prerequisites :

The following are required to run the tests :

Maven
Jdk 1.8
Junit
Chrome browser
Firefox browser (optional)
Cucumber
Framework : The framework uses cucumber for BDD scenarios and java(selenium) to define the steps. The tests can be run in firefox or chrome.

Features : The scenario features are written in cucumber. the feature files are stored in the /src/test/features folder.

Step Defintions: The step definition code for the feature steps are stored in the /src/test/StepDefinition folder.

Test Data : The test data has been provided to the scenarios through the example tables in the feature files. The test data table can be tagged to be used for different environments. 

Random Data : Faker library is used to provide random data for filling up contact form.

Execution :

To run individual tests use the particular test tag : ./Backbase/mvn test -Dcucumber.options="--tags @TEST001" -DBROWSER="chrome" 

This will run the create computer scenario from the securepay.feature file The test will be run in chrome. 

To run a whole feature in firefox: mvn test -Dcucumber.options="--tags @SecurePay" -DBROWSER="firefox" 

run all the tests : mvn test -DBROWSER="chrome"

run headless : mvn test -Dcucumber.options="--tags @TEST001" -DBROWSER="headless"

Results : The html results will be stored in reports folder. Screenshots would be embedded for failed tests.
