package koala.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	static WebDriver driver;
	
	@Given("^website should be launched$")
	public void website_should_be_launched() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "I:\\Aravinsami\\sami codes\\Cucumberkola\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.ikoala.com.au/");
			driver.manage().window().maximize();
			WebElement f = driver.findElement(By.xpath("//a[@href='https://www.ikoala.com.au/login']"));
			f.click();
		
	}

	@Given("^user should give id \"([^\"]*)\" and pass \"([^\"]*)\"$")
	public void user_should_give_id_and_pass(String name, String pass) throws Throwable {
		
		WebElement f1 = driver.findElement(By.xpath("(//input[@name='email'])[3]"));
		f1.click();
		f1.sendKeys(name);
		Thread.sleep(2000);
		
		WebElement f2 = driver.findElement(By.xpath("(//input[@name='password'])[3]"));
		f2.sendKeys(pass);
		Thread.sleep(2000);
		
		WebElement f3 = driver.findElement(By.xpath("//input[@value='Login']"));
		f3.click();
		Thread.sleep(2000);
	}

	@When("^search the products \"([^\"]*)\"$")
	public void search_the_products(String prd) throws Throwable {
		
		WebElement f7 = driver.findElement(By.xpath("//input[@class='form-control ']"));
		f7.sendKeys(prd);
	}

	@Then("^click the go button$")
	public void click_the_go_button() throws Throwable {
		WebElement f8 = driver.findElement(By.xpath("//div[@class='input-group-addon btn  srchbtn']"));
		f8.click();

	}



}
