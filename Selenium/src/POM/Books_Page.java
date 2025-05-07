package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

public class Books_Page {
	
	Books_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Replacing of findElement and FindElements
	@FindBy(id="products-orderby")
	private WebElement sortByDD;
	
	public WebElement getSortByDD()
	{
		return sortByDD;
	}
	
	//Same Elements with multiple locators it will use AND Operator
	@FindAll({@FindBy(linkText = "Register"),@FindBy(className = "ico-register")})
	   private WebElement registerLink;
	
	public WebElement getRegisterLink()
	{
		return registerLink;
	}
	
	//list of webElements
	
	@FindBy(tagName = "a")
		private List<WebElement> links;
	public List<WebElement> getLinks()
	{
		return links;
	}
	

}
