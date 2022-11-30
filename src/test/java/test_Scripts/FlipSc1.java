package test_Scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.Flip1;

public class FlipSc1 extends Base_Test {
@Test(dataProvider="testData")
public void Flip(String[]testData) {
	Flip1 F1=new Flip1(driver);
	F1.UserName(testData[0]);
	F1.Password(testData[1]);
	F1.login();
	F1.Search(testData[2]);
	F1.SearchButton();
	F1.Icon();
	F1.BeforeAdd();
	F1.wishlist();
	F1.AddedProduct();	
}
@DataProvider(name="testData")
public Object[][]getTestData() throws IOException{
	Object[][]testdata=ReadExcel.getMultipleData("Add");
	return testdata;
}
}
