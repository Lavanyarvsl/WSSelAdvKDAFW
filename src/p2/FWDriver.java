package p2;

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
			 k.k2=wb.getSheet("Script1").getRow(i).getCell(1).toString();
			 k.k3=wb.getSheet("Script1").getRow(i).getCell(2).toString();
			 k.getClass().getMethod(k1).invoke(k);
			
			
		}
		
		
		wb.close();
		driver.close();
	}
	
}
