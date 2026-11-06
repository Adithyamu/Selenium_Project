package testpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import basepackage.Baseclass;

public class hometest extends Baseclass{
	@Test(priority = 1)
	public void textverify()
	{
		homepageobj.textmthd();
		String productText=homepageobj.textmthd();
		Assert.assertEquals(productText, "Products");
		
	}
	
	@Test(priority=2)
	public void linkverifymthd()
	{
		int linkcount=homepageobj.linkmthd();
	}

}
