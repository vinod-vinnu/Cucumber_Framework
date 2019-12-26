package stepDefinitions;

import org.openqa.selenium.WebDriver;

import CommonFunctions.CommonFunctions;
import cucumber.api.java.en.When;

public class LoginValidation {
	WebDriver driver;
	@When("^open Browser$")
	public void open_Browser() throws Throwable {
	  driver=CommonFunctions.startBrowser("chrome");
	}

	@When("^open Application$")
	public void open_Application() throws Throwable {
	    CommonFunctions.openApplication(driver);
	}

	@When("^Wait For Username$")
	public void wait_For_Username() throws Throwable {
	    CommonFunctions.waitForElement(driver, "name", "username", "10");
	}

	@When("^Enter username$")
	public void enter_username() throws Throwable {
	    CommonFunctions.typeAction(driver, "name", "username", "admin");
	}

	@When("^Wait For Password$")
	public void wait_For_Password() throws Throwable {
	    CommonFunctions.waitForElement(driver, "id", "password", "10");
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
	    CommonFunctions.typeAction(driver, "id", "password", "master");
	}

	@When("^Click On Login$")
	public void click_On_Login() throws Throwable {
	    CommonFunctions.clickAction(driver, "id", "btnsubmit");
	}

	@When("^Wait For Logout$")
	public void wait_For_Logout() throws Throwable {
	   CommonFunctions.waitForElement(driver, "id", "logout","10"); 
	}

	@When("^Click On Logout$")
	public void click_On_Logout() throws Throwable {
	  CommonFunctions.clickAction(driver, "id", "logout"); 
	}

	@When("^Wait For Ok$")
	public void wait_For_Ok() throws Throwable {
	   CommonFunctions.waitForElement(driver, "xpath", "//button[contains(text(),'OK!')]", "10");
	}

	@When("^Click On Ok$")
	public void click_On_Ok() throws Throwable {
	    CommonFunctions.clickAction(driver, "xpath", "//button[contains(text(),'OK!')]");
	}

	@When("^Close Browser$")
	public void close_Browser() throws Throwable {
	    CommonFunctions.closeBrowser(driver);
	}



}
