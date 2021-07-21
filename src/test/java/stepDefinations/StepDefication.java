package stepDefinations;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AuthenticationPage;
import pages.ContactUs;
import pages.CreateAccountPage;
import pages.Homepage;
import pages.MyAccountPage;
import testBase.TestBase;

public class StepDefication extends TestBase {
	
	public AuthenticationPage authObj;
	public ContactUs contactUsObj;
	public CreateAccountPage createAccObj;
	public Homepage homePageObj;
	public MyAccountPage myAccObj;
	
	@Given("^Open browser Navigate to \"([^\"]*)\"$")
    public void open_browser_navigate_to_something(String strArg1) throws Throwable {
		driver = TestBase.setup();
		
		authObj = new AuthenticationPage(driver);
		homePageObj = new Homepage(driver);
		myAccObj = new MyAccountPage(driver);
    }

    @When("^Click on the SignIn link$")
    public void click_on_the_signin_link() throws Throwable {
        homePageObj.getSignInLink().click();
    }

    @When("^Enter Username and Password \"([^\"]*)\" \"([^\"]*)\"$")
    public void enter_username_and_password_something_something(String strArg1, String strArg2) throws Throwable {
       authObj.setLoginEmail(strArg1);
       authObj.setLoginPassword(strArg2);
       authObj.getLoginSubmitButton().click();
    }

    @Then("^Veirfy MyAccount Page displayed or not$")
    public void veirfy_myaccount_page_displayed_or_not() throws Throwable {
        String heading = myAccObj.getMyAccPageHeading().getText();

        Assert.assertEquals(heading, "MY ACCOUNT");
        
    }
    
    @When("^Click on the ContactUs link$")
    public void click_on_the_contactus_link() throws Throwable {
    	homePageObj.getContactUs().click();
    }

    @Then("^Verify ContactUs page Displayed or not$")
    public void verify_contactus_page_displayed_or_not() throws Throwable {
    	
    }
    
    @When("^Enter Email id in CreateAccount section \"([^\"]*)\"$")
    public void enter_email_id_in_createaccount_section_something(String strArg1) throws Throwable {
    	authObj.setCreateAccountEmail(strArg1);
    }

    @When("^Enter Firstname \"([^\"]*)\"$")
    public void enter_firstname_something(String strArg1) throws Throwable {
   
    }

    @When("^Enter Lastname \"([^\"]*)\"$")
    public void enter_lastname_something(String strArg1) throws Throwable {
   
    }

    @When("^Enter Password \"([^\"]*)\"$")
    public void enter_password_something(String strArg1) throws Throwable {
   
    }

    @When("^Click on the Submit button$")
    public void click_on_the_submit_button() throws Throwable {
   
    }

    @Then("^Verify Account is created or not$")
    public void verify_account_is_created_or_not() throws Throwable {
   
    }
}
