package pom_scripts;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Flip1 extends BasePage{

		public Flip1(WebDriver driver) {
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
			clickAction(login);
		}
		@FindBy(xpath="//input[@class='_3704LK']")
		WebElement Search;
		public void Search(String search) {
			WebDriverWait wait=new WebDriverWait(driver,10);
			 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[.='Login']")));
			enter_value(Search,search);
		}
		@FindBy(xpath="//button[@type='submit']")
		WebElement searchbutton;
		public void SearchButton() {
			clickAction(searchbutton);
		}
		@FindBy(xpath="//div[@class='_2hVSre _3nq8ih']")
		WebElement iconClick;
		public void Icon() {
			 WebElement icon=driver.findElement(By.xpath("(//div[@class='_36FSn5'])[1]"));
			 if(icon.isEnabled())
		        {
		        	System.out.println("Button is clickable");
		        }
		        else
		        	System.out.println("Button is not clickable");
			clickAction(iconClick);
			
		}
		String S1;
		@FindBy(xpath="(//div[@class='_36FSn5'])[1]")
		WebElement PbeforeAdd;
		public void BeforeAdd() {
			String Confirmation=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.className("_2sKwjB"))).getText();
			if(Confirmation.contains("Added to your Wishlist"))
			{
				System.out.println("Confirmation messege is displayed");
			}else
				System.out.println("Confirmation messege is not displayed");
			
	       this.S1=driver.findElement(By.xpath("//div[@class='_4rR01T']")).getText();
		}
		
		@FindBy(xpath="_2sKwjB")
		WebElement message;
		@FindBy(xpath="//div[@class='_4rR01T']")
		WebElement message1;
		@FindBy(xpath="https://www.flipkart.com/wishlist?link=home_wishlist")
		WebElement Wishlist;
		public void wishlist() {
			 driver.get("https://www.flipkart.com/wishlist?link=home_wishlist");
			 driver.navigate().refresh();
			 driver.navigate().refresh();

		}
		@FindBy(xpath="(//div[@class='_3hscEA'])[1]")
		WebElement AddProduct;
		public void AddedProduct() {
			//enter_value(Search,search);
			String add=driver.findElement(By.xpath("(//div[@class='_3hscEA'])[1]")).getText();
			if(S1.contains(add))
			{
				System.out.println("Added successfully");
			}else
				System.out.println("not added");
			
			
				driver.quit();
		}
	}
