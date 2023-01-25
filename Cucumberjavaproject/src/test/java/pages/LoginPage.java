package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	protected WebDriver driver;
	
	private By txtbox_username = By.id("name");
	private By txtbox_password = By.id("password");
	private By btn_login = By.id("login");
	private By btn_logout=By.id("logout");
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
		if(!driver.getTitle().equals("TestProject Demo")){
			throw new IllegalStateException("This is not Login Page.The Current page is "+driver.getCurrentUrl());
		}
	}
	
	public void enterUsername(String username) {
		driver.findElement(txtbox_username).sendKeys(username);
	}
	public void enterPassword(String password) {
		driver.findElement(txtbox_password).sendKeys(password);
		
	}
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	public void checkLogOutIsDisplayed() {
		driver.findElement(btn_logout).isDisplayed();
	}
	
}
