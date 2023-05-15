package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class dellstepdefinition  {
	WebDriver driver;
	@Given("^Open URL$")
	public void open_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Web Driver\\chromedriver.exe");
	    driver= new ChromeDriver();
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();		
		driver.manage().deleteAllCookies();    
	}

	@Then("^Click deals link$")
	public void click_deals_link() throws Throwable {
		Actions ac= new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[text()='Deals']"))).build().perform();
	    Thread.sleep(3000);
	}

	@Then("^Click Accessories deals link$")
	public void click_Accessories_deals_link() throws Throwable {
	    driver.findElement(By.xpath("//button[text()='Computer Accessories Deals']")).click();
	}

	@Then("^Click Software deals$")
	public void click_Software_deals() throws Throwable {
	   driver.findElement(By.linkText("Software Deals")) .click();
	}

	@Then("^Close Window$")
	public void close_Window() throws Throwable {
	    driver.close();
	}


}
