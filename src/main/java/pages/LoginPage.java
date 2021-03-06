package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	//instance variables
	public WebDriver driver;
	
	//constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;	
	}
	
	//locatori
	public By usernameField = By.id("log");
	public By passwordField = By.id("password");
	public By subitButton = By.xpath("//input[@class='submit_button']");
	public By logoutButton = By.className("menu_user_logout");
	
	//metode
	public void loginInApp(String username, String password) {
		driver.findElement(usernameField).sendKeys(username);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(subitButton).click();


	}

}
