package maven.org.cucumbertesting;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoGuruDay1 {
	static WebDriver driver;

@Given("The user is in GuruNinetyNine login page")
public void the_user_is_in_GuruNinetyNine_login_page() {
	System.setProperty("webdriver.chrome.driver", "E:\\Seleniumcode\\org.tcs\\driver\\chromedriver.exe");
    // Write code here that turns the phrase above into concrete actions
	driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/V1/index.php");

}

@When("The user enters the valid username and password")
public void the_user_enters_the_valid_username_and_password() {
	driver.findElement(By.name("uid")).sendKeys("mngr162690");
	driver.findElement(By.name("password")).sendKeys("arAjuzY");
	
    // Write code here that turns the phrase above into concrete actions

}

@When("The user clicks the submit button")
public void the_user_clicks_the_submit_button() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.name("btnLogin")).click();
	}

@Then("The user should be in manager home page")
public void the_user_should_be_in_manager_home_page() {
    // Write code here that turns the phrase above into concrete actions
    Assert.assertTrue(driver.getCurrentUrl().contains("Managerhomepage"));
}
 


}
