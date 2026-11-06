package pagepackage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/span")
	WebElement products;
	
	
	@FindBy(tagName="a")
	List <WebElement> links;
	
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
	WebElement addtocart;
	
	public homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String textmthd()
	{
		String actualtext=products.getText();
		return actualtext;
	}
	
	public void linkmthd()
	{
		int count=links.size();
	}
	
	public void cartmthd()
	{
		addtocart.click();
	}

}
