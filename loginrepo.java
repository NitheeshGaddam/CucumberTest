package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginrepo {
	WebDriver driver;
	public loginrepo(WebDriver driver)
	{
		this.driver = driver; 
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="userName")
	private WebElement user_name;
	
	@FindBy(how=How.ID, using="password")
	private WebElement password;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"AuthenticationForm\"]/div[5]/div[2]/button")
	private WebElement signin;
	
	
	
	
	public WebElement username()
	{
		return user_name;
	}
	
	public WebElement password()
	{
		return password;
	}
	
	public WebElement signin()
	{
		return signin;
	}
	
}
