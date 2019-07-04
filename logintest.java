package stepDefinations;


import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import PageFactory.loginrepo;
import cucumber.api.java.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logintest {

	WebDriver driver;
	loginrepo repo;
	ExtentTest test;
	//ExtentReports report=new ExtentReports("target\\ExtentReportResults.html");;
	ExtentReports report;
	@BeforeClass
	public  void startTest()
	{
	report = new ExtentReports("target\\ExtentReportResults.html",true);

	}

	@Before
	public void init()
	{
		//report = new ExtentReports("target\\ExtentReportResults.html");
		test = report.startTest("ExtentDemo");
		System.out.println("Before");
		System.setProperty("webdriver.chrome.driver","src\\test\\java\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    
	    repo=new loginrepo(driver);
	    
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Given("enter {string} and {string}")
	public void enter_and(String username, String password) throws InterruptedException {
System.out.println(username+ " -------------- "+password);
	    driver.get("https://unifiedportal-mem.epfindia.gov.in/memberinterface/");
	    repo.username().sendKeys(username);
	    Thread.sleep(5000);
	    repo.password().sendKeys(password);
	    //driver.findElement(By.id("userName")).sendKeys(username);
	    //driver.findElement(By.id("password")).sendKeys(password);

	}

	@When("click on login")
	public void click_on_login() {
		System.out.println("\n one");
		 repo.signin().click();
		 // driver.findElement(By.xpath("//*[@id=\"AuthenticationForm\"]/div[5]/div[2]/button")).click();
	}

	@Then("verify login is not successful")
	public void verify_login_is_not_successful() {
		System.out.println("\n two");
		 if(repo.signin().isDisplayed())
			 System.out.println("login is not successful");
	}
	@After
	public void after()
	{
		report.endTest(test);
		System.out.println("After");
	   driver.quit();
	   
	  
	}
	
	@AfterClass
	public  void endTest()
	{
		
		report.flush();
	}

}
