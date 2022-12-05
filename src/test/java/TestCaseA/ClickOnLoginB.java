package TestCaseA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import POJO.DClass;
import POJO.OpenB;
import POM.NijaTElements;

public class ClickOnLoginB extends DClass {

	@Test
	public void Test1() throws InterruptedException {
		driver = OpenB.OpenChrome();
		NijaTElements n = new NijaTElements();
		n.clickOnMyAct();
		n.clickOnlogIn();

		n.EnterMailID();
		n.EnterPass();
		n.clickOnLogInB();

		n.ClickOnHome();
		n.ScrollD();
		List<WebElement> Prices = driver.findElements(By.xpath("//span[@class='price-tax']"));
		List<Double> PriceList = new ArrayList<>();
		for (WebElement k : Prices) {
			String PriceWithOutDoller = k.getText().replace("Ex Tax: $", "");
			PriceList.add(Double.valueOf(PriceWithOutDoller));
		}
		Collections.sort(PriceList);

		System.out.println(PriceList);
		n.ScrollUp();
		n.movetolaptops();
		n.SortByM();
		n.clickOnaddtoCart();
		Thread.sleep(1000);
		n.clickOnaddtoCart();
		Thread.sleep(1000);
		n.clickOnCart();
		List<WebElement> CartValue = driver.findElements(By.xpath("(//table//tbody)[3]//td"));
		for (WebElement c : CartValue) {
			String d = c.getText();
			System.out.println(d);
		}
	}
}