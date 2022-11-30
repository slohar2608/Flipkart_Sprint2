package pom_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.Base_Test;

public class Flip2 extends BasePage {
	public Flip2(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
			WebElement username;
	public void UserName(String Name) {
		enter_value(username,Name);
	}
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	WebElement password;
	public void Password(String pass) {
		enter_value(password,pass);
	}
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement login;
	public void login() {
		clickAction(login);}
	@FindBy(xpath="https://www.flipkart.com/wishlist?link=home_wishlist")
	WebElement Wishlist;
	public void wishlist() {
		WebDriverWait wait=new WebDriverWait(driver,10);
		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[.='Login']")));
		 driver.get("https://www.flipkart.com/wishlist?link=home_wishlist");}

	public void delete(){
		 if(deleteButton.isEnabled())
		 {
			 System.out.println("Delete button is clickable");
		 }
		 else 
			 System.out.println("Delete button is not clickable");}
	String l1;
	@FindBy(xpath="(//img[@class='_2Nq6Qc'])[1]")
	WebElement deleteButton;
	public void DeleteButton() {
		clickAction(deleteButton);
		this.l1=driver.findElement(By.xpath("//div[@class='_3hscEA']")).getText();
		}
	
	@FindBy(xpath="//button[@class='_2KpZ6l _27q62H']")
	WebElement Cancelbutton;
	public void cancelButton() {
		clickAction(Cancelbutton);
		String l2=driver.findElement(By.xpath("//div[@class='_3hscEA']")).getText();
		if(l1.equalsIgnoreCase(l2))
		{
			System.out.println("cancel button is working");
		}
		else
			System.out.println("cancel button is not working");
		
		}
	String l3;
	@FindBy(xpath="//button[text()='CANCEL']")
	WebElement CancelButton;
	public void Check() {
		this.l3=driver.findElement(By.xpath("//div[@class='_3hscEA']")).getText();
		}
	
	@FindBy(xpath="(//img[@class='_2Nq6Qc'])[1]")
	WebElement DELETElButton;
	public void DELETEbutton() {
		clickAction(DELETElButton);
		}
	
	@FindBy(xpath="//button[text()='YES, REMOVE']")
	WebElement RemoveButton;
	public void removebutton() {
		clickAction(RemoveButton);
		driver.navigate().refresh();
		driver.navigate().refresh();
		
		String l4=driver.findElement(By.xpath("//div[@class='_3hscEA'][1]")).getText();
	    
		
		if(l3.equalsIgnoreCase(l4))		{
			System.out.println("delete button is not working");
		}
		else
			System.out.println("delete button is working");
		
		driver.navigate().refresh();
		}
		
}
