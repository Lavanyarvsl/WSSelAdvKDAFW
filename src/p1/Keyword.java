package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Keyword {

	public WebDriver driver;
	public String k2,k3;
	
	public void enter()
	{
		driver.findElement(By.xpath(k2)).sendKeys(k3);
		
	}
	
	
	public void click()
	{
		driver.findElement(By.xpath(k2)).click();
	}
	
}
