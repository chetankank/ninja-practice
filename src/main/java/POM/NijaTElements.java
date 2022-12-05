package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import POJO.DClass;

public class NijaTElements extends DClass {
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement MyAC;
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement LogIn;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement MailID;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement Pass;
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement LoginButton;
	@FindBy(xpath = "(//a[@href='http://tutorialsninja.com/demo/index.php?route=common/home'])[2]")
	private WebElement homeButton;
	@FindBy(xpath = "//h3[normalize-space()='Featured']")
	private WebElement feature;
	@FindBy(xpath = "//a[normalize-space()='MacBook']")
	private WebElement tagnameMacBook;
	@FindBy(xpath = "//span[@class='price-tax']")
	private WebElement priceMacBook;
	@FindBy(xpath = "//a[text()='Your Store']")
	private WebElement YourStore;
	@FindBy(xpath = "(//a[@class='dropdown-toggle'])[3]")
	private WebElement Laptops;
	@FindBy(xpath = "(//a[@class='see-all'])[2]")
	private WebElement AllLaptops;
	@FindBy(xpath = "//select[@id='input-sort']")
	private WebElement SortBy;
	@FindBy(xpath = "//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]//span[1]")
	private WebElement AddToCart;
	@FindBy(xpath = "//a[@title='Shopping Cart']")
	private WebElement CartView;
	
//	@FindBy(xpath = "//a[@title='Shopping Cart']")
//	private WebElement CartView;
//	@FindBy(xpath = "//a[@title='Shopping Cart']")
//	private WebElement CartView;
//	@FindBy(xpath = "//a[@title='Shopping Cart']")
//	private WebElement CartView;
	
	
	public NijaTElements() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnMyAct() {
		MyAC.click();
	}

	public void clickOnlogIn() {
		LogIn.click();
	}

	public void EnterMailID() {
		MailID.sendKeys("sctestqa@gr.la");
	}

	public void EnterPass() {
		Pass.sendKeys("Sct@123");
	}

	public void clickOnLogInB() {
		LoginButton.click();
	}

	public void ScrollD() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", feature);
	}

	public void ScrollUp() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", YourStore);
	}

	public void ClickOnHome() {
		homeButton.click();
	}

	public String getprice() {
		String a = priceMacBook.getText();
		return a;
	}

	public String getTagName() {
		String b = tagnameMacBook.getText();
		return b;
	}

	public void movetolaptops() {
		Actions a = new Actions(driver);
		a.moveToElement(Laptops);
		a.moveToElement(AllLaptops);
		a.click();
		a.build().perform();
	}

	public void SortByM() {
		Select s = new Select(SortBy);
		s.selectByIndex(4);
	}

	public void clickOnaddtoCart() {
		AddToCart.click();
	}

	public void clickOnCart() {
		CartView.click();
	}

}