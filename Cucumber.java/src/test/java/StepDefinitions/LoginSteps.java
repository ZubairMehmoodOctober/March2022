package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	
 WebDriver driver = null;
 @Given("browser is open")
 public void browser_is_open() {
	 System.out.println("Inside Step - browser is open");
	 String projectPath = System.getProperty("user.dir");
	 System.out.println("Project path is :"+projectPath);
	 
	 System.setProperty( "webdriver.chrome.driver" , projectPath+ "/src/test/resources/drivers/chromedriver.exe");
	 driver = new ChromeDriver();
	 

 }
     
 
	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://invenauto.tech/index.php?controller=authentication&back=my-account");
	}

	@When("user enters email and password")
	public void user_enters_email_and_password() {
		driver.findElement(By.id("email")).sendKeys("user123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
	
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.id("submitlogin")).click();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("user will navigate to the home page");
		
		driver.close();
		driver.quit();
	}

}
