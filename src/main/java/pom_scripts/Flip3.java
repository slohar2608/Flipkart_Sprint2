 package pom_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.Base_Test;

public class Flip3 extends BasePage{
	
	public Flip3(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@name='q']")
	WebElement Search;
	public void Search(String search) {
		enter_value(Search,search);
	}
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchbutton;
	public void SearchButton() {
		clickAction(searchbutton);}
	@FindBy(xpath="(//div[@class='_2hVSre _1DmLJ5 -o7Q4n'])[1]")
	WebElement iconClick;
	public void Icon() {
		clickAction(iconClick);
WebElement loginPage=driver.findElement(By.className("_2MlkI1"));
		
		if(loginPage.isDisplayed())
		{
			System.out.println("user is not able to add product in wishlist without login");
		}
		else
			System.out.println("user is able to add product in wishlist without login");
		
		driver.quit();
		
	}
	
}
