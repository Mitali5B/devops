package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class loginmaven {
	private WebDriver driver;
	@Given ("user is on the login page of newtours")
	public void user_is_on_the_login_page_of_newtours() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com//");
	}
	
	
	 @When  ("user enters correct credentials in newtours")
	 public void user_enters_correct_credentials_in_newtours()
	 {
		 driver.findElement(By.name("userName")).sendKeys("Mitali");
		 driver.findElement(By.name("password")).sendKeys("Mitali");
		 driver.findElement(By.name("login")).click();
	 }
	 
	 @Then  ("user can do sucessful login")
	 public void user_can_do_sucessful_login()
	 {
		 Assert.assertEquals("Find a flight", driver.getTitle());
		 driver.close();
		 
	 }
}
