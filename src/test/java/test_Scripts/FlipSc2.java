package test_Scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.BasePage;
import pom_scripts.Flip1;
import pom_scripts.Flip2;

public class FlipSc2 extends Base_Test {
	@Test(dataProvider="testData")
	public void Flip(String[]testData) {
		Flip2 F2=new Flip2(driver);
		
		F2.UserName(testData[0]);
		F2.Password(testData[1]);
		F2.login();
		F2.wishlist();
		F2.delete();
		F2.DeleteButton();
		F2.cancelButton();
		F2.Check();
		F2.DELETEbutton();
		F2.removebutton();
	}
	@DataProvider(name="testData")
	public Object[][]getTestData() throws IOException{
		Object[][]testdata=ReadExcel.getMultipleData("Remove");
		return testdata;
	}
	}


