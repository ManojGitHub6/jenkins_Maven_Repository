package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition {

	WebDriver driver=null;
	
	@Given("^open browser$")
	public void open_browser(){
     System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 driver=new ChromeDriver();
	}

	@When("^navigate to application$")
	public void navigate_to_application()  {
 
		driver.get("http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login");
	}

	@When("^login credentials are enterd$")
	public void login_credentials_are_enterd()  {
	   driver.findElement(By.name("txtUsername")).sendKeys("admin");
	   driver.findElement(By.name("txtPassword")).sendKeys("Admin@123");
	   driver.findElement(By.name("Submit")).click();
	}

	@Then("^Homepage should be displayed$")
	public void Homepage_should_be_displayed() throws InterruptedException  {
	     Thread.sleep(10000);
	     driver.quit();
	     Assert.assertEquals(false, true);
		
	}


}
