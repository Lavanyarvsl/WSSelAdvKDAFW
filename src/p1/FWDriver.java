package p1;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FWDriver {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		Keyword k=new Keyword();
		k.driver=driver;
		
		Workbook wb=WorkbookFactory.create(new FileInputStream("./Scripts.xlsx"));
		int rc=wb.getSheet("Script1").getLastRowNum();
		
		for(int i=1;i<=rc;i++)
		{
			String k1=wb.getSheet("Script1").getRow(i).getCell(0).toString();
			String k2=wb.getSheet("Script1").getRow(i).getCell(1).toString();
			String k3=wb.getSheet("Script1").getRow(i).getCell(2).toString();
			
			System.out.println(k1+""+k2+""+k3);
			
			
			
			k.k2=k2;
			k.k3=k3;
			if(k1.equals("enter"))
			{
				k.enter();
			}
			
			else if(k1.equals("click"))
			{
				k.click();
			}
			else
			{
				System.out.println("invalid");
			}
			
		}
		
		
		
		
		
		wb.close();
	}
	
}
