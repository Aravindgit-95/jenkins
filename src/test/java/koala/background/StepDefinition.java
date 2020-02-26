package koala.background;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	static WebDriver driver;
	
	@Given("^user should log in to the application$")
	public void user_should_log_in_to_the_application() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","I:\\Aravinsami\\sami codes\\MyProject\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.get("https://www.ikoala.com.au/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement f = driver.findElement(By.xpath("//a[@href='https://www.ikoala.com.au/login']"));
		f.click();
		
		WebElement f1 = driver.findElement(By.xpath("(//input[@name='email'])[3]"));
		f1.click();
		f1.sendKeys("aravindswaami@gmail.com");
		Thread.sleep(2000);
		
		WebElement f2 = driver.findElement(By.xpath("(//input[@name='password'])[3]"));
		f2.sendKeys("Aravind@123");
		Thread.sleep(2000);
	}

	@Given("^First tag in category should be cliked$")
	public void first_tag_in_category_should_be_cliked() throws Throwable {
		
		WebElement f1 = driver.findElement(By.xpath("(//a[contains(text(),'Home')])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(f1).perform();
		
		
	}

	@When("^click the first option$")
	public void click_the_first_option() throws Throwable {
		
		WebElement q = driver.findElement(By.xpath("//a[text()='Small Kitchen Appliances']"));
		q.click();
	}

	@Then("^contents of the option displayed$")
	public void contents_of_the_option_displayed() throws Throwable {
		
		System.out.println("Small kitchen Appliances");
	}

	@When("^clicks the second option$")
	public void clicks_the_second_option() throws Throwable {
		WebElement q = driver.findElement(By.xpath("//a[text()='Fans']"));
		q.click();
	}

	@Then("^contents of second option displayed$")
	public void contents_of_second_option_displayed() throws Throwable {
		System.out.println("fans displayed");
	}

	@When("^clicks the third option$")
	public void clicks_the_third_option() throws Throwable {
		WebElement q = driver.findElement(By.xpath("//a[text()='Heaters']"));
		q.click();
	}

	@Then("^contents of third option displayed$")
	public void contents_of_third_option_displayed() throws Throwable {
		System.out.println("Heaters are displayed");
	}



}
