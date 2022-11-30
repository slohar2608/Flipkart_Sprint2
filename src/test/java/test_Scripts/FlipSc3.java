package test_Scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.Flip3;

public class FlipSc3 extends  Base_Test {
	@Test(dataProvider="testData")
	public void Flip(String[]testData) {
		Flip3 F3=new Flip3(driver);
		F3.Search(testData[0]);
		F3.SearchButton();
		F3.Icon();
		
	}
	@DataProvider(name="testData")
	public Object[][]getTestData() throws IOException{
		Object[][]testdata=ReadExcel.getMultipleData("User");
		return testdata;
	}
	}
	

